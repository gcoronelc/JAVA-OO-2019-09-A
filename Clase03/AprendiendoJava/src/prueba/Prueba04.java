package prueba;

import negocio.DatosGenerales;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba04 {

	public static void main(String[] args) {
		
		String datos[] = DatosGenerales.tiposDocs;
		for (String dato : datos) {
			System.out.println(dato);
		}
		
	}
	
}
