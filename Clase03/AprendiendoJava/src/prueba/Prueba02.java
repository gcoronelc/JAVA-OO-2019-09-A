package prueba;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba02 {

	public static void main(String[] args) {
		
		System.out.println("Ejm 1: " + Math.max(12, 16));
		System.out.println("Ejm 2: " + Math.min(12, 16));
		
		System.out.println("Mayor de 12, 67, 45, 39: " + mayor(12,67,45,39));
	}

	private static int mayor(int a, int b, int c, int d) {
		// Variable
		int m;
		// Proceso
		m = Math.max(a, b);
		m = Math.max(m, c);
		m = Math.max(m, d);
		// Reporte
		return m;
	}

	
}
