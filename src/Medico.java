package src;

import java.util.HashMap;
import java.util.Scanner;

//Santiago
public class Medico extends Usuario{
    //Atributos
    private String idMedico;
    private String numeroTelefonicoMedico;
    private String nombreMedico;
    private String apellidoMedico;
    private String cedulaMedico;
    private String correoMedico;
    private String especialidad;

    //Constructores
    public Medico() {
        this.idMedico = "";
        this.numeroTelefonicoMedico = " ";
        this.nombreMedico = " ";
        this.apellidoMedico = " ";
        this.cedulaMedico = " ";
        this.correoMedico = " ";
        this.especialidad = " ";
    }

    public Medico(String nombreUsuario, String password, String tipoUsuario){
        setNombreUsuario(nombreUsuario);
        setPassword(password);
        setTipoUsuario(tipoUsuario);
    }

    public Medico(String idMedico, String numeroTelefonicoMedico, String nombreMedico, String apellidoMedico,
                  String cedulaMedico, String correoMedico, String especialidad) {
        this.idMedico = idMedico;
        this.numeroTelefonicoMedico = numeroTelefonicoMedico;
        this.nombreMedico = nombreMedico;
        this.apellidoMedico = apellidoMedico;
        this.cedulaMedico = cedulaMedico;
        this.correoMedico = correoMedico;
        this.especialidad = especialidad;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
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

    public String getCedulaMedico() {
        return cedulaMedico;
    }

    public void setCedulaMedico(String cedulaMedico) {
        this.cedulaMedico = cedulaMedico;
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
    @Override
    public String toString(){

        return "id:"+idMedico +"\nNombre: "+nombreMedico+"\nApellido: "+apellidoMedico+
                "\nEspecialidad: "+especialidad+ "\nCorreo: "+correoMedico+"\nCelular: "+
                numeroTelefonicoMedico;
    }
    public void registrarMedico(int id, HashMap<String, String> coleccionMedicos){
        Scanner t = new Scanner(System.in);
        System.out.println("\nIngrese su nombre:");
        coleccionMedicos.put("nombreMedico",t.next());
        System.out.println("Ingrese su apellido:");
        coleccionMedicos.put("apellido",t.next());
        System.out.println("Ingrese su especialidad");
        coleccionMedicos.put("especialidad",t.next());
        System.out.println("Ingrese su teléfono:");
        coleccionMedicos.put("telefono",t.next());
        System.out.println("Ingrese su correo");
        coleccionMedicos.put("correo",t.next());
        System.out.println("Su información ha sido registrada con éxito.");
    }
}
