/*
 * Hacer un programa para calcular
 * el pronedio de un estudiante.
 * Son 4 notas.
 */
package demos;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		// Variables
		int n1, n2, n3, n4;
		double pr;
		Scanner scanner = new Scanner(System.in);
		// Datos
		System.out.print("Nota 1: ");
		n1 = scanner.nextInt();
		System.out.print("Nota 2: ");
		n2 = scanner.nextInt();
		System.out.print("Nota 3: ");
		n3 = scanner.nextInt();
		System.out.print("Nota 4: ");
		n4 = scanner.nextInt();
		// Proceso
		pr = ( n1 + n2 + n3 + n4 ) / 4.0;
		// Reporte
		System.out.println("Pronedio: " + pr);
	}

}
