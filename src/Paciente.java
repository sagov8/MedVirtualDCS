package src;

//Camilo

import java.util.HashMap;
import java.util.Scanner;

public class Paciente extends Usuario {

    //Atributos paciente

    private int idPaciente;
    private String tipoDocumento;
    private long numeroDocumento;
    private String nombrePaciente;
    private String apellidoPaciente;
    private String numeroTelefonicoPaciente;
    private String correoPaciente;
    private String direccionDeDomicilio;
    private String fechaDeNacimiento;
    private String genero;
    private float peso;

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
                    String genero, float peso) {
        
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

    }
    
    public Paciente(int idPaciente, String tipoDocumento, long numeroDocumento,
                    String nombrePaciente, String apellidoPaciente,
                    String numeroTelefonicoPaciente, String correoPaciente,
                    String direccionDeDomicilio, String fechaDeNacimiento,
                    String genero, float peso) {
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

    //Procedimientos y funciones

    @Override
    public String toString() {
        //Sobrescritura de toString para obtener toda la info del paciente en un String separado por "&"
        return "idPaciente: " + idPaciente + "&TipoDocumento: "
                + tipoDocumento + "&NumeroDocumento: " + numeroDocumento +
                "&NombrePaciente: " + nombrePaciente + "&ApellidoPaciente: " +
                apellidoPaciente + "&NumeroCelular: " + numeroTelefonicoPaciente
                + "&CorroElectronico: " + correoPaciente + "&Domicilio: " +
                direccionDeDomicilio + "&FechaNacimiento: " + fechaDeNacimiento
                + "&Genero: " + genero + "&Peso(kg): " + peso;
    }


    public void registrarPaciente(int id, HashMap<Integer, String> ColeccionPacientes) {
        Scanner t = new Scanner(System.in);
        //Se pide y se guarda la información del paciente en cada variable.
        System.out.println("\nPor favor digite sus datos personales: ");
        System.out.println("Ingrese tipo de documetos (CC,TI,RC,CE): ");
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
        peso = t.nextFloat();
        idPaciente = id;

        ColeccionPacientes.put(id, toString());
        System.out.println("\nSu información ha sido registrada con éxito.\n");
    }
}



