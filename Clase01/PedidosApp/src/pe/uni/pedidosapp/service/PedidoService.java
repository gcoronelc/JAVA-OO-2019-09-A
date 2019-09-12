package pe.uni.pedidosapp.service;

public class PedidoService {
	
	public double calcularImpuesto( double importe ){
		// Variables
		double impuesto;
		// Proceso
		impuesto = importe * 0.18;
		// Reporte
		return redondear(impuesto);
	}
	
	public double calcularTotal( double importe ){
		// Variables
		double total;
		// Proceso
		total = importe + calcularImpuesto(importe);
		// Reporte
		return redondear(total);
	}
	
	private double redondear( double num){
		num *= 100;
		num = Math.round(num);
		num = num / 100;
		return num;
	}
	
}
