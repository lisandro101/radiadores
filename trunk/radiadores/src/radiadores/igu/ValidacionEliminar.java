/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.igu;

import javax.persistence.Query;
import radiadores.entidades.Cargo;
import radiadores.entidades.Empleado;
import radiadores.entidades.HoraLaboral;
import radiadores.entidades.MateriaPrima;
import radiadores.entidades.ParteDeEstructura;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author stafoxter
 */
public class ValidacionEliminar {
    private static ValidacionEliminar instancia;
    
    public synchronized static ValidacionEliminar getInstancia(){
        if (instancia == null){
            instancia = new ValidacionEliminar();
        }
        return instancia;            
    }
    private ValidacionEliminar(){ 
    }
    
    public boolean cargoEstaRelacionado(Cargo cargo){
        boolean resultado;
        Query consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from Empleado a where a.cargo = :cargo and a.borrado=false" );
        consulta.setParameter("cargo", cargo);
        
        if(FachadaPersistencia.getInstancia().buscar(Empleado.class, consulta).size()==0){
            resultado=false;
        }else{
            resultado=true;
        }

        return resultado;
    }
    
    public boolean empleadoEstaRelacionado(Empleado empleado){
        boolean resultado;
        Query consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from HoraLaboral a where a.empleado = :empleado and a.borrado=false" );
        consulta.setParameter("empleado", empleado);
        
        if(FachadaPersistencia.getInstancia().buscar(HoraLaboral.class, consulta).size()==0){
            resultado=false;
        }else{
            resultado=true;
        }

        return resultado;
    }
    
    public boolean materiaPrimaEstaRelacionada(MateriaPrima materiaPrima){
        boolean resultado;
        Query consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from ParteDeEstructura a where a.componente = :materiaPrima and a.borrado=false" );
        consulta.setParameter("materiaPrima", materiaPrima);
        
        if(FachadaPersistencia.getInstancia().buscar(ParteDeEstructura.class, consulta).size()==0){
            resultado=false;
        }else{
            resultado=true;
        }

        return resultado;
    }
            
}
