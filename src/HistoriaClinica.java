package src;

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

    //Getters y Setters
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
    public void imprimirHistoria(int idHistoria){

    }
}
