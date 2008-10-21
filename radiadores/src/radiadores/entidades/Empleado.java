package radiadores.entidades;

import java.util.Date;

/**
 * @author Lisandro
 * @version 1.0
 * @created 21-oct-2008 12:47:10 a.m.
 */
public class Empleado {

	private String direccion;
	private Date fechaIngreso;
	private Date fechaNacimiento;
	private String idEmpleado;
	private String mail;
	private String nombre;
	private String telefono;
	public Cargo m_Cargo;
	public HorasLaborales m_HorasLaborales;

	public Empleado(){

	}
}