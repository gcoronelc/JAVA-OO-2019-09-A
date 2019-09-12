/*
 * Hacer un programa para calcular
 * el pronedio de un estudiante.
 * Son 4 notas.
 */
package demos;

public class Demo02 {

	public static void main(String[] args) {
		// Variables
		int n1, n2, n3, n4;
		double pr;
		// Datos
		n1 = 16;
		n2 = 18;
		n3 = 14;
		n4 = 19;
		// Proceso
		pr = ( n1 + n2 + n3 + n4 ) / 4.0;
		// Reporte
		System.out.println("Pronedio: " + pr);
	}

}
