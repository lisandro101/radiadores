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
	private String id;
	private String mail;
	private String nombre;
	private String telefono;
	public Cargo cargo;
	public HorasLaborales horasTrabajadas;

	public Empleado(){

	}
}