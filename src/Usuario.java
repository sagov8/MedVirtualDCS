package src;

import java.util.HashMap;
import java.util.Scanner;

//Camilo
public class Usuario {

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

    //Metodos y funciones

    public String guardarUsuario() {
        return "\nID: " +
                idUsuario +
                "\nNombre: " +
                nombreUsuario +
                "\nPassword: " +
                password +
                "\nTipo Usuario: " +
                tipoUsuario;
    }

    public void registrarUsuario(HashMap<Integer, String> coleccionUsuarios, String nombreUsuario) {
        Scanner t = new Scanner(System.in);

        boolean salir = false;
        boolean usuarioDisponible = false;

        while (!salir) {
            /*
            for (String datos : coleccionUsuarios.values()) {
                if (datos.contains(nombreUsuario)) {
                    System.out.println("Usuario existente, elija otro nombre de usuario.");
                } else {
                    usuarioDisponible = true;
                }
            }*/
            if (usuarioDisponible = true) {
                boolean passwordConfirmado = false;
                while (!passwordConfirmado) {
                    System.out.println("Ingrese un password:");
                    password = t.next();
                    System.out.println("Ingrese otra vez el password:");
                    String confirmacionPassword = t.next();
                    if (password.equals(confirmacionPassword)) {
                        coleccionUsuarios.put(idUsuario, guardarUsuario());
                        passwordConfirmado = true;
                        System.out.println("Registro éxitoso.");
                        salir = true;
                    }

                }


            }

        }

    }

    public static void verificarLogin(String nombreUsuario, String password,
                                      HashMap<Integer, String> coleccionUsuarios) {
        try {
            for (String datos : coleccionUsuarios.values()) {
                System.out.println(datos);
                if (datos.contains(nombreUsuario)) {
                    if (datos.contains(password)) {
                        System.out.println("Bienvenido a MedVirtualDCS");
                    }
                    System.out.println("Contraseña incorrecta");
                }
            }
        } catch (NullPointerException e) {
            System.out.println("No hay usuarios registrados.");
        }
        System.out.println("Usuario no encontrado");
    }

}
