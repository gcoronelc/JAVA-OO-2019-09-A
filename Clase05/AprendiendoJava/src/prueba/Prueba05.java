package prueba;

import java.util.Random;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba05 {

	public static void main(String[] args) {

		int notas[] = new int[5];
		Random rnd = new Random();

		pintar1(notas);

		notas[0] = 20;
		notas[1] = 18;
		notas[3] = rnd.nextInt(21) ;

		pintar2(notas);
		
		notas[2] = (notas[0] + notas[1]) / 2;
		
		pintar1(notas);

	}

	// FOR indexado
	private static void pintar1(int[] notas) {
		System.out.println("========================");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}

	// For Each
	private static void pintar2(int[] notas) {
		System.out.println("========================");
		for (int nota : notas) {
			System.out.println(nota);
		}
	}

}
