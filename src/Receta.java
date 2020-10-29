package src;
import java.util.Date;
//Diana
public class Receta {
    //Atributos
    private int idReceta;
    private Date fechaReceta;
    private String recomendacion;
    private static int idSiguiente=1;
    //Constructores
    public Receta() {
        this.idReceta = 0;
        this.fechaReceta = null;
        this.recomendacion="";
    }
    public Receta(Date fechaReceta,String recomendacion, String dosis) {
        this.idReceta = idSiguiente++;
        this.fechaReceta = fechaReceta;
        this.recomendacion=recomendacion;
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

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }
    
    //Métodos
    public void crearReceta( ){
        
    }

    /*public void imprimirReceta(){
        
    }*/
    public void agregarMedicamento(){
        
    }
    public void guardarReceta(int idHistoriaClinica){
        
    }

    @Override
    public String toString() {
        return "Receta{" + "idReceta=" + idReceta + ", fechaReceta=" + fechaReceta + ", recomendacion=" + recomendacion + '}';
    }

    
    
}
