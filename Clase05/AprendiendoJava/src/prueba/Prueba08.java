package prueba;

import service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba08 {
	
public static void main(String[] args) {
	try {
		// Datos
			int dividendo = 100;
			int divisor = 0;
			// Proceso
			MateService service = new MateService();
			int cociente = service.dividir3(dividendo, divisor);
			// Reporte
			System.out.println("Cociente: " + cociente);
	} catch (Exception e) {
		System.err.println(e.getMessage());
	}
			

		
	}
}
