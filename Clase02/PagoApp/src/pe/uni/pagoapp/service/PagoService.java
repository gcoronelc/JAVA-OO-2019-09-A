package pe.uni.pagoapp.service;

import pe.uni.pagoapp.dto.PagoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class PagoService {

	public PagoDto procesarPago( PagoDto dto){
		// Variables
		double ingresos, renta, neto;
		// Proceso
		ingresos = dto.getHorasDia() * dto.getDias() * dto.getPagoHora();
		renta = 0.0;
		if( ingresos > 1500.0 ){
			renta = ingresos * 0.08;
		}
		neto = ingresos - renta;
		// Reporte
		dto.setIngresos(ingresos);
		dto.setRenta(renta);
		dto.setNeto(neto);
		return dto;
	}
	
}
