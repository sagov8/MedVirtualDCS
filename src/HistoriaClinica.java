package src;

import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//Santiago
public class HistoriaClinica {

    //atributos
    private String fechaDeCreacion;
    private int idHistoria;

    //Constructores
    public HistoriaClinica() {
        this.fechaDeCreacion = "";
        this.idHistoria = 0;
    }

    public HistoriaClinica(String fechaDeCreacion, int idHistoria) {
        this.fechaDeCreacion = fechaDeCreacion;
        this.idHistoria = idHistoria;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public int getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    //Métodos y funciones

    //anamnesis
    
    public boolean verificarExistencia(String idPaciente, HashMap<String, ArrayList> historiasClinicas) {
        if (historiasClinicas.containsKey(idPaciente)) {
            return true;
        } else {
            return false;
        }
    }
    
    public void crearHistoriaClinica(HashMap<String, ArrayList> historiasClinicas, String idPaciente,
            ArrayList<Object> datos) {
        if (historiasClinicas.containsKey(idPaciente)) {
            JOptionPane.showMessageDialog(null, "No se puede crear Historia Clínica. "
                    + "\nEl paciente ya tiene una historia registrada.");
        } else {
            historiasClinicas.put(idPaciente, datos);
        }
    }
    
    public void editarHistoria (HashMap<String, ArrayList> historiasClinicas, String idPaciente,
            ArrayList<Object> datos){
        
        if (historiasClinicas.containsKey(idPaciente)) {
            historiasClinicas.put(idPaciente, datos);
        } else {
            JOptionPane.showMessageDialog(null,"No existe una historia clínica asociada a este paciente.");
        }
    }

    
    
    

}
