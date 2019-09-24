package pe.uni.angelesapp.service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public final class MyMath {

	private MyMath() {
	}
		
	public static long factorial(int n){
		
		return 0;
	}

	public static int mcd( int n1, int n2){
		
		return 0;
	}
	
	public static int mcm( int n1, int n2){
		
		return 0;
	}
	
	public static String fibonacci( int n ){
		// Variable
		String serie = "";
		int a = 0, b = 1, c;
		// Validar "n"
		if( n <= 0){
			return serie;
		}
		// Proceso
		switch(n){
			case 1:
				serie = "0";
				break;
			case 2:
				serie = "0, 1";
				break;
			default:
				serie = "0, 1";
				for (int i = 3; i <= n; i++) {
					c =  a + b;
					serie += ", " + c;
					a = b;
					b = c;
				}
		}
		// reporte
		return serie;
	}
	
	public static boolean esPrimo( int n ){
		
		 return false;
	}
	
	
}
