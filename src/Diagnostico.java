package src;
//Diana

import java.util.Date;

public class Diagnostico {

    //Atributos
    private String idDiagnostico;
    private Date fechaDiagnostico;
    private String diagnostico; 
    private String observacion;
    private String estadoPaciente;
    private String tratamiento;
    private String observacion;
    private String recomendacion;
    private static int idSiguiente = 1;
    private Formula formula=new Formula();

    //Constructores
    public Diagnostico() {
        this.idDiagnostico = "";
        this.fechaDiagnostico = null;
        this.observacion = "";
        this.recomendacion = "";
    }

    public Diagnostico(String idPaciente, Date fechaDiagnostico, String observacion, 
            String estadoPaciente, String diagnostico) {
        this.idDiagnostico = idPaciente;
        this.fechaDiagnostico = fechaDiagnostico;
        this.observacion = observacion;
        this.estadoPaciente = estadoPaciente;
        this.diagnostico = diagnostico;
        this.tratamiento = "Dieta saludable, ejercicio 2 veces por semana";
        this.recomendacion = estadoPaciente;
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

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String estadoPaciente) {
        this.recomendacion = estadoPaciente;
    }

    public Formula getFormula() {
        return formula;
    }

    public void setFormula(Formula formula) {
        this.formula = formula;
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

    public void crearDiagnostico(String diagnostico,String recomendacion) {
        Date fechaDiagostico = new Date();
        this.fechaDiagnostico = fechaDiagostico;
        this.observacion=diagnostico;
        this.recomendacion =recomendacion;        
    }

    public void guardarDiagnostico(int idHistoriaClinica) {

    }

    @Override
    public String toString() {
        return "Diagnostico{" + "idDiagnostico=" + idDiagnostico + ", "
                + "fechaDiagnostico=" + fechaDiagnostico + ", observacion="
                + observacion + ", recomendacion=" + recomendacion + '}';
    }

}
