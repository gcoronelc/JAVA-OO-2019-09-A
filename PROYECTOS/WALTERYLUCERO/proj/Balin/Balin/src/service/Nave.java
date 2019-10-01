 package service;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

/**
 *
 * @author Walter P B
 */
public class Nave extends Canvas implements Runnable {

    private double x = 425, y = 550, vx = 15;
    private Graphics g;
    private  Puntaje puntaje;
    private volatile boolean derecha = false, izquierda = false;
    private Thread mover = new Thread(this);
    BufferedImage inave= Carga.imagenes("/bitmap.png");
    BufferedImage inave2=Carga.imagenes("/nave-java2.png");
  
    
    public Nave(Puntaje puntaje) {
        mover.start();
        this.puntaje = puntaje;
        
    }
    

    public void pintar(Graphics g) {
        this.g = g;
//puntaje=new Puntaje();
        g.setColor(Color.BLACK);
        //g.fillRect((int) x, (int) y, 100, 20);
  //      if (puntaje.puntajeObtinido()<20){
        g.drawImage(inave, (int) x, (int) y, null);
    //    }else{
      //  g.drawImage(inave2, (int) x, (int) y, null);
        //}
        
    }
    public void fenar(){
   //    if(puntaje.puntajeObtinido()%2==0)
            vx = 15;// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        derecha = false;
        izquierda = false;

    }

   public void control(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            izquierda = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            derecha = true;
        }

    }

    private void mover() {
        if (derecha) {
            if (x < 850) {
                x += vx;
            } else {
                x = 850;
            }
        }
        if (izquierda) {
            if (x > 0) {
                x -= vx;
            } else {
                x = 0;
            } 
        }
    }


    public Rectangle rectanguloNave() {
    
   puntaje=new Puntaje();
//cx=new ControlPrincipal();
     if (puntaje.puntajeObtinido()%20==0){
            return new Rectangle((int) x, (int) y, 100, 30);
        }else{
            pintar(g);
            g.drawImage(inave2, (int) x, (int) y, null);
             return new Rectangle((int) x, (int) y, 120, 30);
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                mover();
                Thread.sleep(15);
            }
        } catch (Exception e) {
            System.err.println("error en ejecucion");
        }
    }

   

}
