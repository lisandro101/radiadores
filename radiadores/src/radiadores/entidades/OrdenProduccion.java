package radiadores.entidades;

import java.util.Date;

/**
 * @author Lisandro
 * @version 1.0
 * @created 21-oct-2008 12:47:07 a.m.
 */
public class OrdenProduccion {

	private Date fecha;
	private Date fechaEstimadaEntrega;
	private String id;
	private String nombreCliente;
	public ProductoTerminado productoTerminado;

	public OrdenProduccion(){

	}
}