package prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba13 {

	
	public static void main(String[] args) {
		Map<Integer, String> lista = new HashMap<>();
		
		
		lista.put(4567, "abc");
		lista.put(3456, "aaaa");
		
		for (Integer id : lista.keySet()) {
			System.out.println(id + " -- " + lista.get(id));
		}
		System.out.println("");
		
	}
	
}
