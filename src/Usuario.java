package src;

import java.util.ArrayList;

//Camilo
public abstract class Usuario {

    //Atributos usuario
    private int idUsuario;
    private String nombreUsuario;
    private String password;
    private String tipoUsuario;

    // Contructor
    public Usuario() {
        this.idUsuario = 0;
        this.nombreUsuario = "";
        this.password = "";
        this.tipoUsuario = "";
    }

    public Usuario(int idUsuario, String nombreUsuario, String password, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
    }

    //Getter y Setter
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    //Procedimientos y funciones
    public String guardarUsuario() {
        return "ID: "
                +//Se retorna un String con la información del paciente usando el "&" como separador
                idUsuario
                + "&Usuario: "
                + nombreUsuario
                + "&Password: "
                + password
                + "&Tipo Usuario: "
                + tipoUsuario;
    }


    public static String verificarLogin(ArrayList<Usuario> coleccionUsuarios,
            String nombreUsuario, String password) {
       
        for (Usuario user : coleccionUsuarios) {
            if (user.getNombreUsuario().equals(nombreUsuario) && user.getPassword().equals(password)) {
                return user.getTipoUsuario();
            }
        }
        return null;
    }
}
