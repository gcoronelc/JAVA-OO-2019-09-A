package prueba;

import service.IMensaje;
import service.MsgError;
import service.MsgInfo;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		
		IMensaje msg1 = new MsgError();
		msg1.mostrar("El dato es incorrecto.");
		
		IMensaje msg2 = new MsgInfo();
		msg2.mostrar("Bien hecho, estan en el camino correcto.");
		
		
	}
	
	
}
