package prueba;

import negocio.Factura;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		
		System.out.println("IGV: " + Factura.IGV);
		
		Factura fact1 = new Factura();
		fact1.cliente = "Gustavo";
		
		Factura fact2 = new Factura();
		fact2.cliente = "Walter";
		
		Factura fact3 = new Factura();
		fact3.cliente = "Lucero";
		
		
		System.out.println("fact1: " + fact1.cliente);
		System.out.println("fact2: " + fact2.cliente);
		System.out.println("fact3: " + fact3.cliente);
		
		
		fact1.empresa = "GUSTAVO CORONEL";
		System.out.println("Empresa: " + fact2.empresa);
		System.out.println("Empresa: " + Factura.empresa);
		
		System.out.println("Importe: " + Factura.calcularImporte(118));
		
	}
	
}
