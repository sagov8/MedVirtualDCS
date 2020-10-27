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
        return "ID: " +
                idUsuario +
                "&Usuario: " +
                nombreUsuario +
                "&Password: " +
                password +
                "&Tipo Usuario: " +
                tipoUsuario;
    }

    public Boolean registrarUsuario(HashMap<Integer, String> coleccionUsuarios) {
        Scanner t = new Scanner(System.in);

        boolean salir = false;
        boolean salirPassword = false;

        while (!salir) {
            System.out.println("Ingrese nombre de usuario: ");
            nombreUsuario = t.next();
            for (String usuarios : coleccionUsuarios.values()) {
                String[] nombre = usuarios.split("&");
                String nombreRegistrado = nombre[1].split(" ")[1];
                if (nombreRegistrado.equals(nombreUsuario)) {
                    System.out.println("\nUsuario existente. " +
                            "Por favor ingrese otro nombre de usuario:");
                    salirPassword = true;
                } else {
                    salirPassword = false;
                }
            }

            while (!salirPassword) {
                System.out.println("Ingrese un password:");
                password = t.next();
                System.out.println("Ingrese otra vez el password:");
                String confirmacionPassword = t.next();
                if (password.equals(confirmacionPassword)) {
                    coleccionUsuarios.put(idUsuario, guardarUsuario());
                    System.out.println("Usuario registrado satisfactoriamente.");
                    salirPassword = true;
                    salir = true;
                } else {
                    System.out.println("Los password no coinciden.");
                }
            }
        }
        return true;
    }

    public static int verificarLogin(HashMap<Integer, String> coleccionUsuarios) {
        Scanner t = new Scanner(System.in);
        int idUsuarioActivo = -1;
        boolean verificado = false;
        while (!verificado) {
            System.out.println("Ingrese su nombre de usuario:");
            String nombreUsuario = t.next();
            System.out.println("Digite su contraseña:");
            String password = t.next();
            for (String usuarios : coleccionUsuarios.values()) {
                String[] datos = usuarios.split("&");
                String nombreRegistrado = datos[1].split(" ")[1];
                String passwordRegistrado = datos[2].split(" ")[1];
                if (nombreRegistrado.equals(nombreUsuario) && passwordRegistrado.equals(password)) {
                    System.out.println("\nBienvenido a MedVirtualDCS\n");
                    idUsuarioActivo = Integer.parseInt(datos[0].split(" ")[1]);
                    verificado = true;
                } else {
                    verificado = false;
                }
            }
            System.out.println("\nUsuario o contraseña incorrectos.\n");
        }
        return idUsuarioActivo;
    }
}
