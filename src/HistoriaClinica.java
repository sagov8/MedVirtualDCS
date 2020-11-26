package src;

import java.util.HashMap;


//Santiago
public class HistoriaClinica {

    //atributos
    private String fechaDeCreacion;
    private String idHistoria;
    private Paciente paciente;

    //Constructores
    public HistoriaClinica() {
        this.fechaDeCreacion = "";
        this.idHistoria = " ";
    }

    public HistoriaClinica(String fechaDeCreacion, String idHistoria, Paciente paciente) {
        this.fechaDeCreacion = fechaDeCreacion;
        this.idHistoria = idHistoria;
        this.paciente = paciente;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(String idHistoria) {
        this.idHistoria = idHistoria;
    }

    //Métodos y funciones
    @Override
    public String toString() {
        return "Historia Creada";
    }
    //anamnesis

    public void crearHistoriaClinica(HashMap<String, Paciente> historiasClinicas, String idPaciente,
            Paciente paciente) {

        historiasClinicas.put(idPaciente, paciente);
    }

    public Paciente consultarPaciente(HashMap<String, Paciente> historiasClinicas, String idPaciente) {

        idHistoria = idPaciente;
        return historiasClinicas.get(idPaciente);
    }
    
    public void modificarHistoria (HashMap<String, Paciente> historiasClinicas, String idPaciente, Paciente paciente){
        historiasClinicas.put(idPaciente, paciente);
    }
    
    public void eliminarHistoria (HashMap<String, Paciente> historiasClinicas, String idPaciente){
        historiasClinicas.remove(idPaciente);
    }

}
