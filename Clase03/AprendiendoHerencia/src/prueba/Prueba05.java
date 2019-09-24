package prueba;

import service.Clase1;
import service.Clase2;
import service.Clase3;
import service.Clase4;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba05 {

	
	public static void main(String[] args) {
		
		Clase1 obj = new Clase2();
		
		System.out.println("obj es compatible con:");
		System.out.println("Object: " + ((obj instanceof Object)?"SI":"NO") );
		System.out.println("Clase1: " + ((obj instanceof Clase1)?"SI":"NO") );
		System.out.println("Clase2: " + ((obj instanceof Clase2)?"SI":"NO") );
		System.out.println("Clase3: " + ((obj instanceof Clase3)?"SI":"NO") );
		System.out.println("Clase4: " + ((obj instanceof Clase4)?"SI":"NO") );
		
	}
	
}
