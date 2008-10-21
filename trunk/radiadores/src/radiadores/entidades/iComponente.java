package radiadores.entidades;

/**
 * @author Lisandro
 * @version 1.0
 * @created 21-oct-2008 12:47:13 a.m.
 */
public interface iComponente {

//	public Proveedor mProveedor;

	/**
	 * 
	 * @param componente
	 */
	public iComponente getComponente(String componente);

	public Proveedor[] getProveedores();

}