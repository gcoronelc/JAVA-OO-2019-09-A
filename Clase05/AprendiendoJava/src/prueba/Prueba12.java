package prueba;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba12 {

	public static void main(String[] args) {
		Set<Integer> datos = new HashSet<>();
		datos.add(4567);
		datos.add(456);
		datos.add(2093);
		datos.add(9954);
		
		for (Integer dato : datos) {
			System.out.println(dato);
		}
		
	}
}
