package pe.edutec.prueba;

import pe.edutec.lib.PromedioService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		int n1, n2, pr;
		// Datos
		n1 = 16;
		n2 = 18;
		// Proceso
		PromedioService service = new PromedioService();
		pr = service.promedio(n1, n2);
		// Reporte
		System.out.println("pr: " + pr);
	}
	
}
