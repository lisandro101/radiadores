package radiadores.entidades;

import java.util.HashMap;

/**
 * @author Lisandro
 * @version 1.0
 * @created 21-oct-2008 12:47:15 a.m.
 */
public class EstructuraProducto {

	private HashMap<iComponente, Integer> partes;
	public ProductoTerminado productoTerminado;
	public iComponente componente;

	public EstructuraProducto(){

	}
}