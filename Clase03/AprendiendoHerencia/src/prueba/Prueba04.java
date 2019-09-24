package prueba;

import service.Comprobante;
import service.Venta;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba04 {

	public static void main(String[] args) {
	
			Comprobante comp;
			
			comp = new Comprobante() {
				@Override
				public double calcularImporte() {
					return 1000.0;
				}
			};
			
			System.out.println("Importe: " + comp.calcularImporte());
			
			
			comp = new Venta();
			System.out.println("Importe: " + comp.calcularImporte());							
		
	}
	
}
