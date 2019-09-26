package pe.uni.compapp.service;

import pe.uni.compapp.model.Item;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class BoletaService extends CompAbstract{

	@Override
	public Item[] procesar(double total) {
		// Variables
		double servicio, totalGeneral;
		// Proceso
		servicio = total * PORC_SERVICIO;
		totalGeneral = total + servicio;
		// Reporte
		Item[] repo = {
			new Item("Total", dosDec(total)),
			new Item("Servicio", dosDec(servicio)),
			new Item("Total General", dosDec(totalGeneral))
		};
		return repo;
	}

}
