package src;

import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//Santiago
public class HistoriaClinica {

    //atributos
    private String fechaDeCreacion;
    private String idHistoria;

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

    //Métodos y funciones
    @Override
    public String toString() {
        return "Historia Creada";
    }
    //anamnesis

    public void crearHistoriaClinica(HashMap<String, ArrayList> historiasClinicas, String idPaciente,
            ArrayList<Object> datos) {

        historiasClinicas.put(idPaciente, datos);
    }

    public void editarHistoria(HashMap<String, ArrayList> historiasClinicas, String idPaciente,
            ArrayList<Object> datos) {

        if (historiasClinicas.containsKey(idPaciente)) {
            historiasClinicas.put(idPaciente, datos);
        } else {
            JOptionPane.showMessageDialog(null, "No existe una historia clínica asociada a este paciente.");
        }
    }

    public ArrayList consultarPaciente(HashMap<String, ArrayList> historiasClinicas, String idPaciente, ArrayList<Object> datosPaciente) {

        idHistoria = idPaciente;
        if (historiasClinicas.containsKey(idPaciente)) {
            return historiasClinicas.get(idHistoria);
        } else {
            System.out.println("");
        }
        return datosPaciente; 
    }

}
