package src;
//Diana

import java.util.Date;
import java.util.Scanner;

public class Diagnostico {

    Scanner t = new Scanner(System.in);
    //Atributos
    private String idDiagnostico;
    private Date fechaDiagnostico;
    private String diagnostico; 
    private String observacion;
    private String estadoPaciente;
    private String tratamiento;
    private static int idSiguiente = 1;

    //Constructores
    public Diagnostico() {
        this.idDiagnostico = "";
        this.fechaDiagnostico = null;
        this.observacion = "";
        this.estadoPaciente = "";
    }

    public Diagnostico(String idPaciente, Date fechaDiagnostico, String observacion, 
            String estadoPaciente, String diagnostico) {
        this.idDiagnostico = idPaciente;
        this.fechaDiagnostico = fechaDiagnostico;
        this.observacion = observacion;
        this.estadoPaciente = estadoPaciente;
        this.diagnostico = diagnostico;
        this.tratamiento = "Dieta saludable, ejercicio 2 veces por semana";
    }

    //Setter y Getter
    public String getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(String idDiagnostico) {
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    
    //Métodos
    public void crearDiagnostico() {
       
    }

    public void guardarDiagnostico(int idHistoriaClinica) {

    }

    @Override
    public String toString() {
        return "Diagnostico{" + "idDiagnostico=" + idDiagnostico + ", "
                + "fechaDiagnostico=" + fechaDiagnostico + ", observacion="
                + observacion + ", estadoPaciente=" + estadoPaciente + '}';
    }

}
