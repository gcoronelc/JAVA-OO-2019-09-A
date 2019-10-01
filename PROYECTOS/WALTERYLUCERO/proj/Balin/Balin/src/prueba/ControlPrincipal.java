  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import service.Balin;
import service.Entrada;
import view.SuperficieDeDibujo;
import view.Ventana;

/**
 *
 * @author Walter P B
 */
public class ControlPrincipal {

    private static String NOM = "Balin WPB";
    private static int APS = 0, FPS = 0;
    private static SuperficieDeDibujo superficieDeDibujo;
    private static Ventana ventana;
    private static int i = 0;
    private static Entrada entra =new Entrada();
    // private static String cadena ;
    //private static Balin balin=new Balin(cadena);
    private static Balin pos = new Balin();
//public final  int ANCHO=950,ALTO=600;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ControlPrincipal dibujo = new ControlPrincipal();
//        JFrame lienso = new JFrame("balin");
//        lienso.add(dibujo);
//        lienso.setSize(1400, 730);
//        //lienso.setSize(600, 600);
//        lienso.setVisible(true);
//        lienso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        lienso.setLocationRelativeTo(null);
        //  iterarBublepricipal();
        entra.contraseña();
        iniciarJuego();

    }

    private static void iniciarJuego() {
        crearVentana(950, 600, NOM);
        iterarBublePricipal();
    }

    private static void crearVentana(int ancho, int alto, String nombre) {
        superficieDeDibujo = new SuperficieDeDibujo(ancho, alto);
        ventana = new Ventana(nombre, superficieDeDibujo);

    }

    private static void actualizar() {
        superficieDeDibujo.dibujar();
        APS++;
    }

    private static void dibujar() {

        FPS++;
    }

    public int controluno() {
        return i;
    }

    public static void iterarBublePricipal() {

        final int NS_POR_SEGUNDO = 1000000000;
        final int APS_OBJETIVO = 60;
        final int NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO;

        long tiempoDeReferenciaActualizacion = System.nanoTime();
        long tiempoReferenciacontador = System.nanoTime();
        int m = 0;
        double delta = 0, tiempoSinProcesar;

        while (true) {
            long tiempoIncio = System.nanoTime();
            tiempoSinProcesar = tiempoIncio - tiempoDeReferenciaActualizacion;
            tiempoDeReferenciaActualizacion = tiempoIncio;
            delta += tiempoSinProcesar / NS_POR_ACTUALIZACION;
            while (delta >= 1) {
                delta--;
                actualizar();
            }
            dibujar();
            if (System.nanoTime() - tiempoReferenciacontador >= NS_POR_SEGUNDO) {
                if (i >= 60) {
                    m = m + 1;
                    i = 0;
                }
                ventana.setTitle("Tiempo " + m + ":" + i++ + " " + NOM + " || APS " + APS + " || FPS " + FPS);
                System.out.println("Tiempo " + m + ":" + i++ + " " + "APS=" + APS + " || FPS=" + FPS);
                tiempoReferenciacontador = System.nanoTime();
                APS = 0;
                FPS = 0;

            }

        }
    }

//    public void paint(Graphics g) {
//        super.paint(g);
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setColor(Color.BLACK);
//        g2d.fillOval(0, 0, 30, 30);
////    g2d.fillRect(40, 670, 100, 20);
//        g2d.fillRect(40, 0, 100, 30);
//    }
}
