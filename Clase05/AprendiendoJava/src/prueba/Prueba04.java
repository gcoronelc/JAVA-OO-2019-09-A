package prueba;

import service.IMensaje;
import service.MsgError;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba04 {

	public static void main(String[] args) {
		
		IMensaje obj1 = new MsgError();
		MsgError obj2 = (MsgError) obj1;
		
		
	}
	
}
