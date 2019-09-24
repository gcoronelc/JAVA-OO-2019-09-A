package negocio;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Factura {

	public static final double IGV = 0.18;
	public static String empresa;
	
	public String cliente;
	public double importe;
	
		
	public static double calcularImporte( double total){
		double importe;
		importe = total / (1 + IGV);
		return importe;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
}
