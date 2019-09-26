package pe.uni.compapp.controller;

import pe.uni.compapp.model.Item;
import pe.uni.compapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class CompController {
	
	public String[] traerTipos(){
		return CompFactory.traerTipos();
	}

	public Item[] procesarVenta(String tipo, double total) {
		return CompFactory.getComp(tipo).procesar(total);
	}
	

}
