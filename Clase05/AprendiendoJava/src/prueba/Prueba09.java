package prueba;

import java.util.logging.Level;
import java.util.logging.Logger;
import service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba09 {

	public static void main(String[] args) {
		// Datos
		int dividendo = 100;
		int divisor = 0;
		// Proceso
		MateService service = new MateService();
		int cociente = 123;
		try {
			cociente = service.dividir4(dividendo, divisor);
		} catch (Exception ex) {
			Logger.getLogger(Prueba09.class.getName()).log(Level.SEVERE, null, ex);
		}
		//System.out.println("Cociente: " + cociente);

	}
}
