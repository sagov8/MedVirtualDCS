package src;

import java.util.Scanner;

//Camilo
public class Usuario {

    //Atributos usuario
    private int idUsuario;
    private String nombreUsuario;
    private String password;
    private String tipoUsuario;
    
    // Contructor
    
    public Usuario (){
        
        this.idUsuario= 0;
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
    
    public void registrarUsuario(int tipoUsuario){
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario: ");//Hacer excepciones
        this.nombreUsuario = t.next();
        //Hacer excepciones
        boolean salir = false;
        do{
            System.out.println("Ingrese el password");
            this.password = t.next();
            System.out.println("Ingrese de nuevo el password");
            String confirmacionPassword = t.next();
            if(password.equals(confirmacionPassword)){
                this.tipoUsuario = String.valueOf(tipoUsuario);
                this.idUsuario = 1;
                System.out.println("Usuario Registrado con éxito.");
                salir = true;
            }else{
                System.out.println("Los password ingresados no coinciden.");
            }
        }while(!salir);
        if(tipoUsuario == 1){
            System.out.println("\nIngrese su nombre: ");

        }
    }
    public void guardarUsuario(){

    }
    
    public void verificarLogin (){
        
    }
    
}
