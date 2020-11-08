package src;

//Santiago
public class Evolucion {

    //Atributos
    private int idEvento;
    private String fechaEvento;
    private String tipoDeEvento;
    private String descripcionEvento;
    
    

    //Constructores
    public Evolucion() {
        this.idEvento = 0;
        this.fechaEvento = "";
        this.tipoDeEvento = "";
        this.descripcionEvento = "";
    }
    public Evolucion(int idEvento, String fechaEvento, String tipoDeEvento, String descripcionEvento) {
        this.idEvento = idEvento;
        this.fechaEvento = fechaEvento;
        this.tipoDeEvento = tipoDeEvento;
        this.descripcionEvento = descripcionEvento;
    }

    //Getters y Setters
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getTipoDeEvento() {
        return tipoDeEvento;
    }

    public void setTipoDeEvento(String tipoDeEvento) {
        this.tipoDeEvento = tipoDeEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    //Métodos y funciones
    public void guardarEvento(){

    }

    public String imprimirEvento(){
        return "";
    }

    public Object[] getTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
