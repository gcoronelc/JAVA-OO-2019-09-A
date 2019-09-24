package prueba;

import service.Clase1;
import service.Clase2;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba02 {

	public static void main(String[] args) {
		
		Clase1 obj1 = new Clase1();
		Clase1 obj2 = new Clase2();
		Clase2 obj3 = new Clase2();
		
		System.out.println("A.- 8 + 5 = " + obj1.sumar(8, 5));
		System.out.println("B.- 8 + 5 = " + obj2.sumar(8, 5));
		System.out.println("C.- 8 - 5 = " + obj3.restar(8, 5));
		
	}
	
	
}
