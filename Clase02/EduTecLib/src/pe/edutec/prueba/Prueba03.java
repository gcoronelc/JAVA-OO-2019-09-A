package pe.edutec.prueba;

import pe.edutec.lib.PromedioService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba03 {

	public static void main(String[] args) {
		// Variables
		int n1, n2, n3, n4, pr;
		// Datos
		n1 = 16;
		n2 = 18;
		n3 = 20;
		n4 = 19;
		// Proceso
		PromedioService service = new PromedioService();
		pr = service.promedio(n1, n2, n3, n4);
		// Reporte
		System.out.println("pr: " + pr);
	}
	
}
