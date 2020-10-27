package src;
//Diana
import java.util.*;
public class Diagnostico {

    //Atributos
    private int idDiagnostico;
    private Date fechaDiagnostico;
    private String observacion;
    private String estadoPaciente;
    private static int idSiguiente=1;
    //Constructores
    public Diagnostico() {
        this.idDiagnostico = 0;
        this.fechaDiagnostico = null;
        this.observacion = "";
        this.estadoPaciente = "";
    }
    public Diagnostico(Date fechaDiagnostico, String observacion, String estadoPaciente) {
        this.idDiagnostico = idSiguiente++;;
        this.fechaDiagnostico = fechaDiagnostico;
        this.observacion = observacion;
        this.estadoPaciente = estadoPaciente;
    }
    //Setter y Getter
    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public Date getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(Date fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }
    //Métodos
    public String crearDiagnostico(int idPaciente){
        return "";
    }
    /*public void imprimirDiagnostico(){
        
    }*/
    public void guardarDiagnostico(int idHistoriaClinica){

    }

    @Override
    public String toString() {
        return "Diagnostico{" + "idDiagnostico=" + idDiagnostico + ", fechaDiagnostico=" + fechaDiagnostico + ", observacion=" + observacion + ", estadoPaciente=" + estadoPaciente + '}';
    }
    /*
    void setFechaDiagnostico(Calendar fechaDiagnostico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
