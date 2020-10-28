package src;
import java.util.Date;
//Diana
public class Receta {
    //Atributos
    private int idReceta;
    private Date fechaReceta;
    private String recomendacion;
    private String dosis;
    private static int idSiguiente=1;
    //Constructores
    public Receta() {
        this.idReceta = 0;
        this.fechaReceta = null;
        this.recomendacion="";
        this.dosis = "";
    }
    public Receta(Date fechaReceta,String recomendacion, String dosis) {
        this.idReceta = idSiguiente++;
        this.fechaReceta = fechaReceta;
        this.recomendacion=recomendacion;
        this.dosis = dosis;
    }
    //Getter y Setter

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public Date getFechaReceta() {
        return fechaReceta;
    }

    public void setFechaReceta(Date fechaReceta) {
        this.fechaReceta = fechaReceta;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }
    
    //Métodos
    public String crearReceta(int idPaciente){
        return "";
    }

    /*public void imprimirReceta(){
        
    }*/
    public void agregarMedicamento(){
        
    }
    public void guardarReceta(int idHistoriaClinica){
        
    }

    @Override
    public String toString() {
        return "Receta{" + "idReceta=" + idReceta + ", fechaReceta=" + fechaReceta + ", recomendacion=" + recomendacion + ", dosis=" + dosis + '}';
    }

    
    
}
