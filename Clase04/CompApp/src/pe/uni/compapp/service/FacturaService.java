package pe.uni.compapp.service;

import pe.uni.compapp.model.Item;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class FacturaService  extends CompAbstract{

	@Override
	public Item[] procesar(double total) {
		// Variables
		double consumo, impuesto, servicio, totalGeneral;
		// Proceso
		consumo = total / 1.18;
		impuesto = total - consumo;
		servicio = total * PORC_SERVICIO;
		totalGeneral = total + servicio;
		// Reporte
		Item[] repo = {
			new Item("Consumo", dosDec(consumo)),
			new Item("Impuesto", dosDec(impuesto)),
			new Item("Total", dosDec(total)),
			new Item("Servicio", dosDec(servicio)),
			new Item("Total General", dosDec(totalGeneral))
		};
		return repo;	
	}

}
