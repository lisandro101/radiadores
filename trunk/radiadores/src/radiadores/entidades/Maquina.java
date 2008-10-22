package radiadores.entidades;

import java.util.Date;

/**
 * @author Lisandro
 * @version 1.0
 * @created 21-oct-2008 12:47:11 a.m.
 */
public class Maquina {

	private String codigo;
	private Date fechaAntiguedad;
	private String id;
	private String nombreMaquina;
	public CentroTrabajo centroTrabajo;
	public Sector sector;

	public Maquina(){

	}
}