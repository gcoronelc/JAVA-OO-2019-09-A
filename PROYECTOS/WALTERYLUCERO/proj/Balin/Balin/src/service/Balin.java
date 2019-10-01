 package service;

import prueba.ControlPrincipal;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;

/**
 * @author Walter P B
 */
public class Balin extends Canvas implements Runnable {

    private Graphics g;
    private Thread mover = new Thread(this);
    private double x, y, vx, vy;
    private String posicion;
    private Nave nave;
    private Puntaje puntaje;
    BufferedImage imagen=Carga.imagenes("/pelota.png");
    BufferedImage imagen2=Carga.imagenes("/pelota3.png");
    private ControlPrincipal cx;
    public Balin(Nave nave, Puntaje puntaje) {
        mover.start();
        this.nave = nave;
        this.puntaje = puntaje;

                
        //  System.out.println(x+" "+y);
        reiniciarBalin();
       C_Asar();
        
        //if(Sonidos.fondo.play()Sonidos.fondo.stop()){
        //Sonidos.fondo2.play();
        //}
        
        
    }

    public Balin() {
        this.posicion = posicion;
    }

    public void pintar(Graphics g) {
        this.g = g;
        g.setColor(Color.red);
       // g.fillOval((int) x, (int) y, 20, 20);
       // cx=new ControlPrincipal();
        if(puntaje.puntajeObtinido()%2==0){
        g.drawImage(imagen2, (int) x, (int) y, null);
        }else{
        g.drawImage(imagen, (int) x, (int) y, null);
        }
    }

    public void posicion(String posicion) {
        posicion = "Coordenadas: x=" + (int) x + " y=" + (int) y;
    }

    private void juegoterminado() {
        Sonidos.fondo2.stop();
        Sonidos.fondo.stop();
        Sonidos.juegoteminado.play();
     //   Sonidos.juegoteminado.stop();
        JOptionPane.showMessageDialog(null, "Juego terminado");
        puntaje.reiniciarPuntaje();
        reiniciarBalin();
        C_Asar();
    }

    private double aliatorioEntre(double numeroMayor, double numeroMeno) {
        final double ditorcion = numeroMayor - numeroMeno;
        final double traslacion = numeroMeno;
        final double funcion = Math.random();
        return funcion * ditorcion + traslacion;
    }
    private void C_Asar(){
    double sx=Math.random();
    double sm=10*sx;
    int sv=(int)sm;
    if(sv%2==0){
        Sonidos.fondo.loop();
    }
    else{
        Sonidos.fondo2.loop();
    }
    }
    private void reiniciarBalin() {
        y = 0;
        x = aliatorioEntre(0, 920);//ancho de la ventana =950 ancho del balin
        elegirAngulo();
    }
    private Dupla aliatorioAngulo20_160(){
    double xd=2,yd=0;
    double r=Math.sqrt(xd*xd+yd*yd);
    double a=Math.atan2(yd, xd);
    double da=Math.toRadians(aliatorioEntre(20, 160));
    a+=da;
    double xP=r*Math.cos(a);
    double yP=r*Math.sin(a);
    return new Dupla(xP,yP);
    }
    private void elegirAngulo(){
    final Dupla vector=aliatorioAngulo20_160();
    vx=vector.getX();
    vy=vector.getY();
    
    }

    private void mover() {
        x += vx;
        if (x > 920 || x <= 0) {
            vx = -vx;
        }
        y += vy;
        if (colicion()) {
            Sonidos.rebote2.play();
            y = 518;
            vy = -vy;
            puntaje.puntajeAumenta();
            
            double contCre=aliatorioEntre(0, 1);
            if(puntaje.puntajeObtinido()%5==0){
                vy-=contCre; 
            }
            if(puntaje.puntajeObtinido()%3==0){
                if(vx<0){
                vx-=contCre;
                }else{
                vx+=contCre;
                } 
                
            }
        }
        if (y > 570) {
            vy = -vy;
            juegoterminado();
        }
        if (y < 0) {
            vy = -vy;
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                mover();
                Thread.sleep(10);//10 veces en un segundo()
            }
        } catch (Exception ex) {
            System.out.println("Error en el thread de la clase balin");

        }
    }

    public boolean colicion() {
        return nave.rectanguloNave().intersects(rectanguloNave());

    }

    public Rectangle rectanguloNave() {
        return new Rectangle((int) x, (int) y, 20, 20);

    }

}
