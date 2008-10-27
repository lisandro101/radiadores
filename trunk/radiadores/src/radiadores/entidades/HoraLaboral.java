package radiadores.entidades;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Contiene la información de las horas de trabajo por centro
 * 
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
@Entity
@Table(name="horas_laborales")
public class HoraLaboral implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private int cantidad;
    private Empleado empleado;
    private CentroDeTrabajo centroDeTrabajo;

    /**
     * Constructor
     */
    public HoraLaboral(){
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

    @Column(name="cantidad")
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @ManyToOne(targetEntity=Empleado.class, cascade=CascadeType.ALL)
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @ManyToOne(targetEntity=CentroDeTrabajo.class, cascade=CascadeType.ALL)
    public CentroDeTrabajo getCentroDeTrabajo() {
        return centroDeTrabajo;
    }

    public void setCentroDeTrabajo(CentroDeTrabajo centroDeTrabajo) {
        this.centroDeTrabajo = centroDeTrabajo;
    }
}