package pruebas;

import dto.ProductoDto;

public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		ProductoDto prod1;
		// Crear el objeto
		prod1 = new ProductoDto();
		prod1.setId(1000);
		prod1.setNombre("Manzana");
		prod1.setPrecio(7.0);
		prod1.setStock(1000);
		prod1.setActivo(false);
		// Reporte
		System.out.println(prod1.getId());		
		System.out.println(prod1.getNombre());		
		System.out.println(prod1.getPrecio());		
		System.out.println(prod1.getStock());		
		System.out.println(prod1.isActivo());		
	}
}
