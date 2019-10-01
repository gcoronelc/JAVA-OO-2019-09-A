package service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class MateService {

	public int dividir(int dividendo, int divisor) {
		int cociente;
		cociente = dividendo / divisor;
		return cociente;
	}

	public int dividir2(int dividendo, int divisor) {
		int cociente = 0;
		try {
			cociente = dividendo / divisor;
		} catch (Exception e) {
			cociente = 0;
		}
		return cociente;
	}
	
	public int dividir3(int dividendo, int divisor) {
		int cociente = 0;
		try {
			cociente = dividendo / divisor;
		} catch (Exception e) {
			throw new RuntimeException("No se puede dividir por cero.");
		}
		return cociente;
	}
	
	public int dividir4(int dividendo, int divisor) throws Exception {
		int cociente = 0;
		try {
			cociente = dividendo / divisor;
		} catch (Exception e) {
			throw new Exception("No se puede dividir por cero.");
		}
		return cociente;
	}

}
