package pe.uni.pedidosapp.pruebas;

import pe.uni.pedidosapp.service.PedidoService;

public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		double importe, impuesto, total;
		// Datos
		importe = 5678.45;
		// Proceso
		PedidoService service = new PedidoService();
		impuesto = service.calcularImpuesto(importe);
		total = service.calcularTotal(importe);
		// Reporte
		System.out.println("Importe: " + importe);
		System.out.println("Impuesto: " + impuesto);
		System.out.println("Total: " + total);
	}
}
