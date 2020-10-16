package src;

//Diana
public class Receta {
    //Atributos
    private int idReceta;
    private String fechaReceta;
    private String dosis;
    //Constructores
    public Receta() {
        this.idReceta = 0;
        this.fechaReceta = "";
        this.dosis = "";
    }
    public Receta(int idReceta, String fechaReceta, String dosis) {
        this.idReceta = idReceta;
        this.fechaReceta = fechaReceta;
        this.dosis = dosis;
    }
    //Getter y Setter

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getFechaReceta() {
        return fechaReceta;
    }

    public void setFechaReceta(String fechaReceta) {
        this.fechaReceta = fechaReceta;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    
    //Métodos
    public void imprimirReceta(){
        
    }
    public void agregarMedicamento(){
        
    }
    public void guardarReceta(int idHistoriaClinica){
        
    }
}
