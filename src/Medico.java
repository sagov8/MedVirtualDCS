package src;

import java.util.HashMap;
import java.util.Scanner;

//Santiago
public class Medico extends Usuario {
    //Atributos
    private int idMedico;
    private String numeroTelefonicoMedico;
    private String nombreMedico;
    private String apellidoMedico;
    private String cedulaMedico;
    private String correoMedico;
    private String especialidad;

    //Constructores
    public Medico() {
        this.idMedico = 0;
        this.numeroTelefonicoMedico = " ";
        this.nombreMedico = " ";
        this.apellidoMedico = " ";
        this.cedulaMedico = " ";
        this.correoMedico = " ";
        this.especialidad = " ";
    }

    public Medico(int idMedico, String numeroTelefonicoMedico, String nombreMedico, String apellidoMedico,
                  String cedulaMedico, String correoMedico, String especialidad) {
        this.idMedico = idMedico;
        this.numeroTelefonicoMedico = numeroTelefonicoMedico;
        this.nombreMedico = nombreMedico;
        this.apellidoMedico = apellidoMedico;
        this.cedulaMedico = cedulaMedico;
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
    public String toString() {
    //Sobrescritura del método toString para obtener toda la info del médico separada por el símbolo "&".
        return "id: " + getIdUsuario() + "&Nombre: " + nombreMedico + "&Apellido: " + apellidoMedico +
                "&Especialidad: " + especialidad + "&Celular: " + numeroTelefonicoMedico +
                "&Correo: " + correoMedico;
    }

    public void registrarMedico(int id, HashMap<Integer, String> coleccionMedicos) {
        /*
        Se pide la información al médico para ingresarla dentro de los atributos de la clase
        y a través del método sobrescrito de toString se le da un formato agregándole el símbolo
        Ampersand (&) para poder obtener un dato específico si se requiere (ej &nombreMedico: Juan)
        Si todos los datos se escriben correctamente se guarda la información en el Hashmap: coleccionMedicos.
         */
        Scanner t = new Scanner(System.in);
        System.out.println("\nPor favor digite sus datos personales:");
        System.out.println("\nIngrese su nombre:");
        nombreMedico = t.nextLine();
        System.out.println("Ingrese su apellido:");
        apellidoMedico = t.nextLine();
        System.out.println("Ingrese su especialidad:");
        especialidad = t.nextLine();
        System.out.println("Ingrese su número de celular:");
        numeroTelefonicoMedico = t.next();
        System.out.println("Ingrese su correo:");
        correoMedico = t.next();
        idMedico = id;
        coleccionMedicos.put(id, toString());
        System.out.println("\nSu información ha sido registrada con éxito.\n");

    }
}
