package pe.uni.compapp.service;

import pe.uni.compapp.model.Item;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public abstract class CompAbstract {
	
	public static final double PORC_SERVICIO = 0.10;

	public abstract Item[] procesar(double total);
	
	
	
	
	protected double dosDec( double valor ){
		valor *= 100;
		valor = Math.round(valor);
		valor /= 100;
		return valor;
	}

}
