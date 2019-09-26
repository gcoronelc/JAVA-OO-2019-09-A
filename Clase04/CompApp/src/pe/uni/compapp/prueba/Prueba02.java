package pe.uni.compapp.prueba;

import pe.uni.compapp.model.Item;
import pe.uni.compapp.service.CompAbstract;
import pe.uni.compapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba02 {

	public static void main(String[] args) {
		// Variables
		double total = 1000;
		// Proceso
		CompAbstract service = CompFactory.getComp(CompFactory.TIPO_FACTURA);
		Item[] repo = service.procesar(total);
		// Reporte
		for (Item item : repo) {
			System.out.println(item.getConcepto() + " - " + item.getValor());
		}
	}

}
