/**
 * Desarrollar un programa para encontrar
 * el factorial de un número.
 * 
 * N! = 1 x 2 x 3 x ... x N
 *  
 */
package demos;

import java.util.Scanner;

public class Demo07 {
	
	public static void main(String[] args) {
		// Variables
		int num;
		long fact;
		Scanner scanner = new Scanner(System.in);
		// Leer el número
		System.out.print("Ingresar el número: ");
		num = scanner.nextInt();
		fact = 1;
		for( int n = 2; n <= num; n++ ){
			fact *= n;
		}
		// Reporte
		System.out.println("Número: " + num);
		System.out.println("Factorial: " + fact);
	}
}
