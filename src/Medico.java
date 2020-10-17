package src;
//Santiago
public class Medico {
    //Atributos
    private int idMedico;
    private String numeroTelefonicoMedico;
    private String nombreMedico;
    private String apellidoMedico;
    private String correoMedico;
    private String especialidad;

    //Constructor
    public Medico() {
        this.idMedico = 0;
        this.numeroTelefonicoMedico = " ";
        this.nombreMedico = " ";
        this.apellidoMedico = " ";
        this.correoMedico = " ";
        this.especialidad = " ";
    }
    public Medico(int idMedico, String numeroTelefonicoMedico, String nombreMedico, String apellidoMedico, String correoMedico, String especialidad) {
        this.idMedico = idMedico;
        this.numeroTelefonicoMedico = numeroTelefonicoMedico;
        this.nombreMedico = nombreMedico;
        this.apellidoMedico = apellidoMedico;
        this.correoMedico = correoMedico;
        this.especialidad = especialidad;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNumeroTelefonicoMedico() {
        return numeroTelefonicoMedico;
    }

    public void setNumeroTelefonicoMedico(String numeroTelefonicoMedico) {
        this.numeroTelefonicoMedico = numeroTelefonicoMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApellidoMedico() {
        return apellidoMedico;
    }

    public void setApellidoMedico(String apellidoMedico) {
        this.apellidoMedico = apellidoMedico;
    }

    public String getCorreoMedico() {
        return correoMedico;
    }

    public void setCorreoMedico(String correoMedico) {
        this.correoMedico = correoMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Métodos y funciones

    public String toString(){
        return "Nombre: "+nombreMedico+"\nApellido: "+apellidoMedico+"\nEspecialidad: "+especialidad+
                "\nCorreo: "+correoMedico+"\nCelular: "+numeroTelefonicoMedico;
    }
    public String crearDiagnostico(int idPaciente){
        return "";
    }

    public String crearReceta(int idPaciente){
        return "";
    }

    public String consultarHistoriaClinica(int idPaciente){
        return "";
    }

    public String actualizarHistoriaClinica(int idPaciente, int idHistoriaClinica){
        return "";
    }
    
    


}
