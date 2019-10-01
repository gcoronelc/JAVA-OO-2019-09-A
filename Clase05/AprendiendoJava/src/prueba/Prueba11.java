package prueba;

import java.util.ArrayList;
import java.util.List;
import model.Producto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba11 {

	public static void main(String[] args) {
		
		List<Producto> lista = new ArrayList<>();
		
		lista.add(new Producto("Coca Cola", 3));
		lista.add(new Producto("Pan Selecto", 10));
		lista.add(new Producto("Pan Selecto", 10));
		
		for (Producto producto : lista) {
			System.out.println(producto);
		}
		
	}
	
}
