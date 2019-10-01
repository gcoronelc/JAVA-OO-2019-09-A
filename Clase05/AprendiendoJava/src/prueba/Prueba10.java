package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.Producto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba10 {
	
	public static void main(String[] args) {
		
		List lista = new ArrayList();
		
		lista.add(10);
		lista.add("PERU ESTA LIBRE DE MALAS PERSONAS.");
		lista.add(6789.435);
		lista.add(new Random());
		
		System.out.println("------------------");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		lista.remove(2);
		System.out.println("-----------------------");
		for (Object object : lista) {
			System.out.println(object);
		}
		
		lista.add(1, "GUSTAVO, ESE SOY YO.");
		System.out.println("-----------------------");
		for (Object object : lista) {
			System.out.println(object);
		}
		
		
		lista.set(0, 20);
		System.out.println("-----------------------");
		for (Object object : lista) {
			System.out.println(object);
		}
		
		
		lista.add(new int[]{23,54,67,23});
		lista.set(0, 20);
		System.out.println("-----------------------");
		for (Object object : lista) {
			System.out.println(object);
		}
		
		int datos[] = (int[]) lista.get(4);
		System.out.println("--------------------");
		for (int dato : datos) {
			System.out.println(dato);
		}
		
		
		lista.add(new Producto[]{
			new Producto("AAA", 20), 
			new Producto("BBBBB", 100),
			new Producto("CCCCC", 500)});
		System.out.println("-----------------------");
		for (Object object : lista) {
			System.out.println(object);
		}
		
		Producto[] lstProds = (Producto[]) lista.get(5);
		System.out.println("-----------------");
		for (Producto prod : lstProds) {
			System.out.println(prod);
		}
	}

}
