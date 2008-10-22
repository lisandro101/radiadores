package radiadores.entidades;

import java.util.Date;

/**
 * @author Lisandro
 * @version 1.0
 * @created 21-oct-2008 12:47:16 a.m.
 */
public class Proveedor {

	private String direccion;
	private Date fechaInicioActividad;
	private String id;
	private String mail;
	private String nombreContacto;
	private String nombreProveedor;
	private String telefono;
	private OrdenCompra[] ordenesCompra;
        private iComponente[] componentes; 

	public Proveedor(){

	}
}