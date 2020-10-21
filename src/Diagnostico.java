package src;
//Diana
public class Diagnostico {

    //Atributos
    private int idDiagnostico;
    private String fechaDiagnostico;
    private String observacion;
    private String estadoPaciente;
    //Constructores
    public Diagnostico() {
        this.idDiagnostico = 0;
        this.fechaDiagnostico = "";
        this.observacion = "";
        this.estadoPaciente = "";
    }
    public Diagnostico(int idDiagnostico, String fechaDiagnostico, String observacion, String estadoPaciente) {
        this.idDiagnostico = idDiagnostico;
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

    public String getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(String fechaDiagnostico) {
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
    public void imprimirDiagnostico(){
        
    }
    public void guardarDiagnostico(int idHistoriaClinica){
        
    }
}
