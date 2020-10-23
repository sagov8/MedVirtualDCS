package src;

import java.util.HashMap;

//Camilo
public class Usuario {

    //Atributos usuario
    private int idUsuario;
    private static int idNext = 1;
    private String nombreUsuario;
    private String password;
    private String tipoUsuario;
    
    // Contructor
    
    public Usuario (){
        
        this.idUsuario= idNext++;
        this.nombreUsuario= "";
        this.password= "";
        this.tipoUsuario= "";  
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
    
    //Metodos y funciones
    
    public String registrarUsuario(HashMap<String, String> coleccionUsuarios,
                                 int tipoUsuario,
                                 int idUsuario){

        return " ";
    }
    
    public static String verificarLogin (String nombreUsuario, String password,
                                HashMap<String, String> coleccionUsuarios,
                                HashMap<String, String> coleccionMedicos,
                                HashMap<String, String> coleccionPacientes){
        try {
            for (String datos : coleccionUsuarios.values()) {
                if (datos.contains(nombreUsuario)) {
                    if (datos.contains(password)) {
                        return ("Bienvenido a MedVirtualDCS");
                    }
                    return "Contraseña incorrecta";
                }
            }
        }
        catch (NullPointerException e)
        {
            return("No hay usuarios registrados.");
        }
        return "Usuario no encontrado";
    }
    
}
