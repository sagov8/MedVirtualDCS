package src;

//Camilo
public class Paciente {
    
    //Atributos paciente
    
    private int idPaciente;
    private String tipoDocumento;
    private String nombrePaciente;
    private String apellidoPaciente;
    private int numeroTelefonicoPaciente;
    private String correoPaciente;
    private String direccionDeDomicilio;
    private String fechaDeNacimiento;
    private String genero;
    private float peso;
    
    //Constructor

    public Paciente() {
        
        this.idPaciente= 0;
        this.tipoDocumento= "";
        this.nombrePaciente= "";
        this.apellidoPaciente= "";
        this.numeroTelefonicoPaciente= 0;
        this.correoPaciente= "";
        this.direccionDeDomicilio= "";
        this.fechaDeNacimiento= "";
        this.genero= "";
        this.peso= 0;    
    }

    public Paciente(int idPaciente, String tipoDocumento, String nombrePaciente,
            String apellidoPaciente, int numeroTelefonicoPaciente, 
            String correoPaciente, String direccionDeDomicilio, 
            String fechaDeNacimiento, String genero, float peso) {
        
        this.idPaciente = idPaciente;
        this.tipoDocumento = tipoDocumento;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.numeroTelefonicoPaciente = numeroTelefonicoPaciente;
        this.correoPaciente = correoPaciente;
        this.direccionDeDomicilio = direccionDeDomicilio;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.peso = peso;
        
    }
    
    //Getter y Setter

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public int getNumeroTelefonicoPaciente() {
        return numeroTelefonicoPaciente;
    }

    public void setNumeroTelefonicoPaciente(int numeroTelefonicoPaciente) {
        this.numeroTelefonicoPaciente = numeroTelefonicoPaciente;
    }

    public String getCorreoPaciente() {
        return correoPaciente;
    }

    public void setCorreoPaciente(String correoPaciente) {
        this.correoPaciente = correoPaciente;
    }

    public String getDireccionDeDomicilio() {
        return direccionDeDomicilio;
    }

    public void setDireccionDeDomicilio(String direccionDeDomicilio) {
        this.direccionDeDomicilio = direccionDeDomicilio;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    //Metodos y funciones
    
    public void consultarDiagnostico (){
        
    }
    
    public void consultarReceta (){
        
    }
    
    public void registrarEvolucion (){
        
    }
    

}



