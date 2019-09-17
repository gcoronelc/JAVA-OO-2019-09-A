package pe.edutec.prueba;

import pe.edutec.lib.PromedioService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba04 {

	public static void main(String[] args) {
		// Variables
		int n1, n2, n3, n4, n5, pr;
		// Datos
		n1 = 16;
		n2 = 18;
		n3 = 20;
		n4 = 19;
		n5 = 10;
		// Proceso
		PromedioService service = new PromedioService();
		pr = service.promedio(n1, n2, n3, n4, n5);
		// Reporte
		System.out.println("pr: " + pr);
	}
	
}
