package src;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

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
    
    public void registrarUsuario(int tipoUsuario, TreeMap<String, HashMap<String, String>> usuario){
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario: ");//Hacer excepciones
        this.nombreUsuario = t.next();
        //Hacer excepciones
        boolean salir = false;
        do{
            System.out.println("Ingrese el password:");
            this.password = t.next();
            System.out.println("Ingrese de nuevo el password:");
            String confirmacionPassword = t.next();
            if(password.equals(confirmacionPassword)){
                this.tipoUsuario = String.valueOf(tipoUsuario);
                this.idUsuario = 1;
                System.out.println("Usuario Registrado con éxito.");
                salir = true;
            }else{
                System.out.println("Los password ingresados no coinciden.");
                salir = false;
            }
        }while(!salir);
    }
    
    public void verificarLogin (){
        
    }
    
}
