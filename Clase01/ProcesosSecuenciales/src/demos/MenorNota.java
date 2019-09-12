package demos;

import java.util.Arrays;

public class MenorNota {

	public static void main(String[] args) {
		// Datos
		int n1 = 12, n2 = 8, n3 = 15, n4 = 11;
		int menor;
		// Caso 1
		/*
		menor = n1;
		if( n2 < menor){
			menor = n2;
		}
		if( n3 < menor){
			menor = n3;
		}
		if( n4 < menor){
			menor = n4;
		}
		*/
		
		// Caso 2
		/*
		int[] arreglo = new int[]{n1,n2,n3,n4};
		Arrays.sort(arreglo);
		menor = arreglo[0];
		*/
		
		// Caso 3
		int[] arreglo = new int[]{n1,n2,n3,n4};
		menor = Arrays.stream(arreglo).min().getAsInt();
						
		// Reporte
		System.out.println("Menor: " + menor);
	}
}
