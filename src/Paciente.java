package src;

//Camilo
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Paciente extends Usuario {

    //Atributos paciente
    private int idPaciente;
    private String tipoDocumento;
    private long numeroDocumento;
    private String nombrePaciente;
    private String apellidoPaciente;
    private String numeroTelefonicoPaciente;//POR QUÉ ES UN STRING?????
    private String correoPaciente;
    private String direccionDeDomicilio;
    private String fechaDeNacimiento;
    private String genero;
    private float peso;
    private String motivoConsulta;
    private ArrayList<Diagnostico> diagnosticos = new ArrayList<>();
    private Diagnostico diagnosticoYTratamiento;

    //Constructor Temporal para usar el paciente de prueba en "RegistrarDiagnostico" (BORRAR AL TERMINAR)
    public Paciente(String tipoDocumento,long numeroDocumento,String nombrePaciente,String apellidoPaciente
                    ,String numeroTelefonicoPaciente,String correoPaciente,String direccionDeDomicilio
                    ,String fechaDeNacimiento,String genero,float peso){
        this.tipoDocumento=tipoDocumento;
        this.numeroDocumento=numeroDocumento;
        this.nombrePaciente=nombrePaciente;
        this.apellidoPaciente=apellidoPaciente;
        this.numeroTelefonicoPaciente=numeroTelefonicoPaciente;
        this.correoPaciente=correoPaciente;
        this.direccionDeDomicilio=direccionDeDomicilio;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.genero=genero; 
        this.peso=peso;
        
    }
    //Constructores
    public Paciente() {

        this.idPaciente = 0;
        this.tipoDocumento = "";
        this.numeroDocumento = 0;
        this.nombrePaciente = "";
        this.apellidoPaciente = "";
        this.numeroTelefonicoPaciente = "";
        this.correoPaciente = "";
        this.direccionDeDomicilio = "";
        this.fechaDeNacimiento = "";
        this.genero = "";
        this.peso = 0;
    }
    
    public Paciente(int idUsuario, String nombreUsuario, String password, String tipoUsuario,
            int idPaciente, String tipoDocumento, long numeroDocumento,
            String nombrePaciente, String apellidoPaciente,
            String numeroTelefonicoPaciente, String correoPaciente,
            String direccionDeDomicilio, String fechaDeNacimiento,
            String genero, float peso, String motivoConsulta) {

        super(idUsuario, nombreUsuario, password, tipoUsuario);
        this.idPaciente = idPaciente;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.numeroTelefonicoPaciente = numeroTelefonicoPaciente;
        this.correoPaciente = correoPaciente;
        this.direccionDeDomicilio = direccionDeDomicilio;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.peso = peso;
        this.motivoConsulta = motivoConsulta;

    }

    public Paciente(int idPaciente, String tipoDocumento, long numeroDocumento,
            String nombrePaciente, String apellidoPaciente,
            String numeroTelefonicoPaciente, String correoPaciente,
            String direccionDeDomicilio, String fechaDeNacimiento,
            String genero, float peso, String motivoConsulta) {

        this.idPaciente = idPaciente;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.numeroTelefonicoPaciente = numeroTelefonicoPaciente;
        this.correoPaciente = correoPaciente;
        this.direccionDeDomicilio = direccionDeDomicilio;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.peso = peso;
        this.motivoConsulta = motivoConsulta;
    }

    //Getter y Setter
    public Paciente(int idPaciente, String tipoDocumento, long numeroDocumento,
            String nombrePaciente, String apellidoPaciente, String numeroTelefonicoPaciente,
            String correoPaciente, String direccionDeDomicilio, String fechaDeNacimiento,
            String genero, float peso, String motivoConsulta, Diagnostico diagnosticoYTratamiento,
            int idUsuario, String nombreUsuario, String password, String tipoUsuario) {

        super(idUsuario, nombreUsuario, password, tipoUsuario);
        this.idPaciente = idPaciente;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.numeroTelefonicoPaciente = numeroTelefonicoPaciente;
        this.correoPaciente = correoPaciente;
        this.direccionDeDomicilio = direccionDeDomicilio;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.peso = peso;
        this.motivoConsulta = motivoConsulta;
        this.diagnosticoYTratamiento = diagnosticoYTratamiento;
    }

    public Paciente(int idUsuario, String nombreUsuario, String password, String tipoUsuario) {
        super(idUsuario, nombreUsuario, password, tipoUsuario);
    }
    public Paciente(String nombreUsuario, String password, String tipoUsuario,String nombrePaciente, String apellidoPaciente,
                    String tipoDocumento, long numeroDocumento) {//Se usa en RegistrarUsuario
        super(nombreUsuario, password, tipoUsuario);
        this.nombrePaciente=nombrePaciente;
        this.apellidoPaciente=apellidoPaciente;
        this.tipoDocumento=tipoDocumento;
        this.numeroDocumento=numeroDocumento;
    }
    /*public Paciente(String cédula, int i, String juan, String jiménez, int i0, String jjimenezgmailcom, String calle_5_634, String string, String masculino, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

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

    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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

    public String getNumeroTelefonicoPaciente() {
        return numeroTelefonicoPaciente;
    }

    public void setNumeroTelefonicoPaciente(String numeroTelefonicoPaciente) {
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

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public Diagnostico getDiagnosticoYTratamiento() {
        return diagnosticoYTratamiento;
    }

    public void setDiagnosticoYTratamiento(Diagnostico diagnosticoYTratamiento) {
        this.diagnosticoYTratamiento = diagnosticoYTratamiento;
    }

    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(Diagnostico diagnostico) {
        this.diagnosticos.add(diagnostico);
    }

    //Procedimientos y funciones
    @Override
    public String toString() {
        return "idPaciente: " + idPaciente + "\nTipoDocumento: "
                + tipoDocumento + "\nNumeroDocumento: " + numeroDocumento
                + "\nNombrePaciente: " + nombrePaciente + "\nApellidoPaciente: "
                + apellidoPaciente + "\nNumeroCelular: " + numeroTelefonicoPaciente
                + "\nCorroElectronico: " + correoPaciente + "\nDomicilio: "
                + direccionDeDomicilio + "\nFechaNacimiento: " + fechaDeNacimiento
                + "\nGenero: " + genero + "\nPeso(kg): " + peso;

    }

    public void registrarPaciente(int id, HashMap<Integer, String> ColeccionPacientes) {
        Scanner t = new Scanner(System.in);
        //Se pide y se guarda la información del paciente en cada variable.
        System.out.println("\nPor favor digite sus datos personales: ");
        /*  System.out.println("Ingrese tipo de documetos (CC,TI,RC,CE): ");
        tipoDocumento = t.next();
        System.out.println("Ingrese número de documento: ");
        numeroDocumento = t.nextLong();
        t.nextLine();
        System.out.println("Ingrese su nombre: ");
        nombrePaciente = t.next();
        System.out.println("Ingrese su apellido: ");
        apellidoPaciente = t.next();
        System.out.println("Ingrese su número de celular: ");
        numeroTelefonicoPaciente = t.next();
        t.nextLine();
        System.out.println("Ingrese su correo electrónico: ");
        correoPaciente = t.next();
        t.nextLine();
        System.out.println("Ingrese dirección de domicilio: ");
        direccionDeDomicilio = t.nextLine();
        System.out.println("Ingrese su fecha de nacimiento dd-mm-yyyy: "); // Buscar metodo para calcular edad, libreria calendar
        fechaDeNacimiento = t.nextLine();
        System.out.println("Ingrese su género (Hombre/Mujer): ");
        genero = t.next();
        System.out.println("Ingrese su peso (kg): ");
        peso = t.nextFloat();*/
        idPaciente = id;

        ColeccionPacientes.put(id, toString());
        System.out.println("\nSu información ha sido registrada con éxito.\n");
    }

}
