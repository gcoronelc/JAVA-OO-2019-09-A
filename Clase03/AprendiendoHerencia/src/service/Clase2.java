package service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Clase2 extends Clase1{

	public Clase2() {
		
		super("Walter");
		
	}
	
	

	@Override
	public int sumar(int n1, int n2) {
		int suma;
		suma = (n1 + n2) * (n1 - n2);
		return suma;
	}

	public int restar( int n1, int n2){
		return (n1 - n2);
	}
	
}
