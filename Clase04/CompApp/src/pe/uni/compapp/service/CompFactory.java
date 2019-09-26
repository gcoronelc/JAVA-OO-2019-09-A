package pe.uni.compapp.service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class CompFactory {

	public static final String TIPO_FACTURA = "FACTURA";
	public static final String TIPO_BOLETA = "BOLETA";
	
	public static String[] traerTipos(){
		String[] tipos = {TIPO_FACTURA, TIPO_BOLETA};
		return tipos;
	}
	
	public static CompAbstract getComp( String tipo){
		// Variables
		CompAbstract comp = null;
		// Proceso
		switch( tipo ){
			case TIPO_FACTURA:
				comp = new FacturaService();
				break;
			case TIPO_BOLETA:
				comp = new BoletaService();
				break;			
		}
		// Reporte
		return comp;
	}
	
}
