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
public class Prueba02 {

	public static void main(String[] args) {
		
		IMensaje obj = new MsgError();
		
		System.out.println("Tipo de obj: " + obj.getClass());
		System.out.println("obj es compatible con:");
		System.out.println("------------------------------");
		System.out.println("Object: " + (obj instanceof Object?"SI":"NO"));
		System.out.println("IMensaje: " + (obj instanceof IMensaje?"SI":"NO"));
		System.out.println("MsgError: " + (obj instanceof MsgError?"SI":"NO"));
		System.out.println("MsgInfo: " + (obj instanceof MsgInfo?"SI":"NO"));
		
		// MsgInfo info = (MsgInfo) obj;
		
	}
	
}
