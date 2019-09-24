package pe.uni.angelesapp.prueba;

import pe.uni.angelesapp.service.MyMath;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		// Varriables
		int n = 10;
		// Proceso
		String serie = MyMath.fibonacci(n);
		// Reporte
		System.out.println(serie);
	}
	
}
