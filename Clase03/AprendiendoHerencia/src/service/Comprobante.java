package service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public abstract class Comprobante {

	public abstract double calcularImporte();
	
	public int sumar(int n1, int n2){
		return (n1 + n2);
	}
	
}
