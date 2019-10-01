package service;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
//import javax.print.DocFlavor;

/**
* @author Walter P B
 */
public class Carga {
public static BufferedImage imagenes (String ruta){
BufferedImage imagen=null;
    try {
        imagen=ImageIO.read(ClassLoader.class.getResource(ruta));
        
    } catch (Exception e) {
        System.err.println("problema con las imagenes"+ruta);
    }
  
return imagen;
   

}
}
