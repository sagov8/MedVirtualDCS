package src;

import java.util.HashMap;


//Santiago
public class HistoriaClinica {

    //atributos
    private String fechaDeCreacion;
    private String idHistoria;
    private HashMap<String, Paciente> historiasClinicas = new HashMap<>();

    //Constructores
    public HistoriaClinica() {
        this.fechaDeCreacion = "";
        this.idHistoria = " ";
    }

    public HistoriaClinica(String fechaDeCreacion, String idHistoria) {
        this.fechaDeCreacion = fechaDeCreacion;
        this.idHistoria = idHistoria;
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

    public HashMap<String, Paciente> getHistoriasClinicas() {
        return historiasClinicas;
    }

    public void setHistoriasClinicas(HashMap<String, Paciente> historiasClinicas) {
        this.historiasClinicas = historiasClinicas;
    }

    //Métodos y funciones
    @Override
    public String toString() {
        return "Historia Creada";
    }
    //anamnesis

    public void crearHistoriaClinica(Paciente paciente) {

        historiasClinicas.put(String.valueOf(paciente.getNumeroDocumento()), paciente);
    }

    public Paciente consultarPaciente(String idPaciente) {

        try{
            return historiasClinicas.get(idPaciente);
        }catch(Exception e){
            System.out.println("Paciente no encontrado");
        }
        return null;
    }
    
    public void modificarHistoria (Paciente paciente){
        try{
            String key = String.valueOf(paciente.getNumeroDocumento());
            if (historiasClinicas.containsKey(paciente)){
                historiasClinicas.replace(key, paciente);
            }
        }catch(Exception e){
            System.out.println("Paciente no encontrado");
        }
        
    }
    
    public void eliminarHistoria (String idPaciente){
        historiasClinicas.remove(idPaciente);
    }

}
