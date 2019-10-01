
package view;

import java.awt.BorderLayout;
import java.awt.Canvas;
//import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * @author Walter P B
 */
public class Ventana extends JFrame{
    private final ImageIcon icono=new ImageIcon(Ventana.class.getResource("/logoBalin.png"));
    public Ventana(String nombre, Canvas superficieDeDibujo){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle(nombre);
    this.setIconImage(icono.getImage());
    this.setResizable(false);//el usuario no puede redimencionar la ventana
    this.setLayout(new BorderLayout());
    this.add(superficieDeDibujo);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
      
    }
    
}
