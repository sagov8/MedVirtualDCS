package src;
import java.util.Date;
import java.util.Scanner;
//Diana
public class Receta {
    Scanner t=new Scanner(System.in);
    //Atributos
    private int idReceta;
    private Date fechaReceta;
    private String recomendacion;
    private static int idSiguiente=1;
    //Constructores
    public Receta() {
        this.idReceta = idSiguiente++;
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
        Date fechaReceta=new Date();
        this.fechaReceta=fechaReceta;
        System.out.println("Digite las recomendaciones: ");
        recomendacion=t.nextLine();
        System.out.println("Desea formular medicamento? 1.Si 2.No");
        int formular=t.nextInt();
        if(formular==1){
            agregarMedicamento();
        }
        /*Date fechaDiagostico = new Date();
        this.fechaDiagnostico = fechaDiagostico;*/
    }

    /*public void imprimirReceta(){
        
    }*/
    public void agregarMedicamento(){
        System.out.println("Medicamento Registrado");
    }
    public void guardarReceta(int idHistoriaClinica){
        
    }

    @Override
    public String toString() {
        return "Receta{" + "idReceta=" + idReceta + ", fechaReceta=" + fechaReceta + ", recomendacion=" + recomendacion + '}';
    }

    
    
}
