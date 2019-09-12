/**
 * Hacer un programa para encontrar el importe
 * de una venta, se sabe que si la vanta se
 * realiza un Lunes o Miercoles has un descuento 
 * del 5% sobre el precio de venta, y si la venta
 * se realiza un Martes o Jueves el descuento es
 * del 10%.
 */
package demos;

import java.util.Scanner;

public class Demo05 {
	
	public static void main(String[] args) {
		// Variables
		double precio, importe, dcto, total;
		int cantidad, porcDcto;
		String dia;
		// Datos
		Scanner scanner = new Scanner(System.in);
		System.out.print("Precio: ");
		precio = scanner.nextDouble();
		System.out.print("Cantidad: ");
		cantidad = scanner.nextInt();
		System.out.print("Dia: ");
		dia = scanner.next().toUpperCase();
		// Proceso
		porcDcto = 0;
		switch( dia ){
			case "LUNES":
			case "MIERCOLES":
				porcDcto = 5;
				break;
			case "MARTES":
			case "JUEVES":
				porcDcto = 10;
				break;
		}
		importe = precio * cantidad;
		dcto = importe * porcDcto / 100.0;
		total = importe - dcto;
		// Reporte
		System.out.println("Importe: " + importe);
		System.out.println("Descuento: " + dcto);
		System.out.println("Total: " + total);
		
		
	}
	
}
