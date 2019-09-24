package prueba;

import negocio.DatosGenerales;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba03 {

	public static void main(String[] args) {
		
		String datos[] = DatosGenerales.tiposDocs;
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i]);
		}
		
	}
	
}
