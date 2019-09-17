package pe.uni.pagoapp.prueba;

import pe.uni.pagoapp.dto.PagoDto;
import pe.uni.pagoapp.service.PagoService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		// Datos
		PagoDto dto = new PagoDto();
		dto.setHorasDia(6);
		dto.setDias(20);
		dto.setPagoHora(140.0);
		// Proceso
		PagoService service = new PagoService();
		dto = service.procesarPago(dto);
		// Reporte
		System.out.println("Ingresos: " + dto.getIngresos());
		System.out.println("Renta: " + dto.getRenta());
		System.out.println("Neto: " + dto.getNeto());
	}

}
