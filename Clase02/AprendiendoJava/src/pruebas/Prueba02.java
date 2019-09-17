package pruebas;

import dto.ProductoDto;

public class Prueba02 {

	public static void main(String[] args) {
		// Variables
		ProductoDto prod1;
		// Crear el objeto
		prod1 = new ProductoDto();
		// Reporte
		System.out.println(prod1.getId());		
		System.out.println(prod1.getNombre());		
		System.out.println(prod1.getPrecio());		
		System.out.println(prod1.getStock());		
		System.out.println(prod1.isActivo());		
	}
}
