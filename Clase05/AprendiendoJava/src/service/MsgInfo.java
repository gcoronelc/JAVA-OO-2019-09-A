package service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class MsgInfo implements IMensaje{

	@Override
	public void mostrar(String texto) {
		System.out.println("INFO:\n" + texto);
	}

}
