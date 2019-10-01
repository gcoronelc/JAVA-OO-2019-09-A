package service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class MsgError implements IMensaje{

	@Override
	public void mostrar(String texto) {
		System.err.println("ERROR:\n" + texto);
	}

}
