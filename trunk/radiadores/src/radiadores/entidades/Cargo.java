package radiadores.entidades;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Contiene los datos del cargo de un empleado
 * 
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
@Entity
@Table(name="cargos")
public class Cargo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private int horasPorMes;
    private String nombreCargo;
    private double valorHora;
    private boolean borrado;

    /**
     * Constructor
     */
    public Cargo(){
        setId(UUID.randomUUID().toString());
    }

    /**
     * Devuelve el identificador único de la clase
     * 
     * @return El identificador único de la clase
     */
    @Id
    @Column(name="id", length=36)
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador único de la clase
     * 
     * @param id Nuevo valor del identificador único de la clase
     */
    public void setId(String id) {
        this.id = id;
    }

    @Column(name="horas_por_mes")
    public int getHorasPorMes() {
        return horasPorMes;
    }

    public void setHorasPorMes(int horasPorMes) {
        this.horasPorMes = horasPorMes;
    }

    @Column(name="nombre_cargo", length=30)
    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    @Column(name="valor_hora")
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Column(name="borrado")
    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
}