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
    @Override
    public String toString(){
        return "Fecha de creación: "+fechaDeCreacion +
                "id: "+idHistoria;
    }
    //anamnesis
    public String[] crearHistoriaClinica(String infoPaciente, String infoMedico,
                                       String diagnostico, String evolucion){
        String [] historia = new String[4];
        historia[0] = infoPaciente;
        historia[1] = infoMedico;
        historia[2] = diagnostico;
        historia[3] = evolucion;

        return historia;
    }

}
