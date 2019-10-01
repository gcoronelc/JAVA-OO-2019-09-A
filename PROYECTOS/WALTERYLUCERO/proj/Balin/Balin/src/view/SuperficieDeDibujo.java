package view;


import service.Nave;
import service.Balin;
import service.Puntaje;
import service.Carga;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

/**
 * @author Walter P B
 */
public class SuperficieDeDibujo extends Canvas {

    private BufferStrategy buffer;
    private Graphics g;
    private Balin balin;
    public Nave nave;
    private Puntaje puntaje;
    BufferedImage fondo = Carga.imagenes("/fondo-java.png");
    BufferedImage fondo2 = Carga.imagenes("/fondo2.png");
  

    public SuperficieDeDibujo(int ancho, int alto) {
        setPreferredSize(new Dimension(ancho, alto));//aqui se le ajusta el tamaño del canvas

        nave = new Nave(puntaje);
        puntaje = new Puntaje();
        balin = new Balin(nave, puntaje );

        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                nave.control(e);
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                nave.fenar();
            }
        });
        setFocusable(true);

    }

    public void dibujar() {
        buffer = getBufferStrategy();
        if (buffer == null) {
            createBufferStrategy(2);
            return;
        }
        g = buffer.getDrawGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 950, 600);
        if (puntaje.puntajeObtinido() > 20) {
            g.drawImage(fondo2, 0, 0, null);
        } else {
            g.drawImage(fondo, 0, 0, null);
        }
        g.setColor(Color.BLACK);
        balin.pintar(g);
        nave.pintar(g);
        puntaje.pintar(g);

        g.dispose();
        buffer.show();

    }

//    public void run() {
//       try{
//       }catch(Exception ex){
//           System.out.println("Error en el thread de la clase balin");
//       }
//    }
}
