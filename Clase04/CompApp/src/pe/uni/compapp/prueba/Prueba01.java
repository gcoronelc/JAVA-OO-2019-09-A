package pe.uni.compapp.prueba;

import pe.uni.compapp.model.Item;
import pe.uni.compapp.service.BoletaService;
import pe.uni.compapp.service.CompAbstract;
import pe.uni.compapp.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		double total = 1000;
		// Proceso
		//CompAbstract service = new BoletaService();
		CompAbstract service = new FacturaService();
		Item[] repo = service.procesar(total);
		// Reporte
		for (Item item : repo) {
			System.out.println(item.getConcepto() + " - " + item.getValor());
		}
	}

}
