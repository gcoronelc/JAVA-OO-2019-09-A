package prueba;

import service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba07 {

	public static void main(String[] args) {
		
			// Datos
			int dividendo = 100;
			int divisor = 0;
			// Proceso
			MateService service = new MateService();
			int cociente = service.dividir2(dividendo, divisor);
			// Reporte
			System.out.println("Cociente: " + cociente);
	
		
		
	}
	
}
