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

    //Procedimientos y funciones

    public String guardarUsuario() {
        return "ID: " +//Se retorna un String con la información del paciente usando el "&" como separador
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
        /*
        Se valida primero si el nombre de usuario ingresado está disponible,
        para ello, se pide el HashMap como parámetro ya que contiene la colección de usuarios,
        se realiza la comparación del nombre ingresado con los nombres de usuarios ya registrados.
        En caso de que ya exista vuelve a pedir otro nombre de usario, si no, continua con normalidad.
         */
        while (!salir) {
            System.out.println("Ingrese nombre de usuario: ");
            nombreUsuario = t.next();

            for (String usuarios : coleccionUsuarios.values()) {
                String[] nombre = usuarios.split("&");//Divide la información del usuario con el símbolo "&" para
                                                            //obtener un Array, iterable con la info del usuario.
                String nombreRegistrado = nombre[1].split(" ")[1];//Se divide de nuevo la cadena obtenida con " " y
                                                                        // Se obtiene a través del índice el dato que se
                                                                        //requiere, en este caso el nombre corresponde al
                                                                        //índice 1.
                if (nombreRegistrado.equals(nombreUsuario)) {
                    System.out.println("\nUsuario existente. " +
                            "Por favor ingrese otro nombre de usuario:");
                    salirPassword = true;
                } else {
                    salirPassword = false;
                }
            }
            /*
            Se realiza la validación del password, ingresado dos veces por el usuario, en caso de ser correcto
            se sale del ciclo y retorna true. En caso negativo vuelve a pedir un password nuevamente que
            coincide con el segundo que se escribe.
             */
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
        int idUsuarioActivo;
        /*
        Para iniciar sesión se pide ingresar el nombre y password, se itera el HashMap con un ciclo
        for each buscando si el nombre y password ingresados corresponden al de un usuario registrado
        en el sistema.
        Si el usuario y password coinciden con el de un usuario registrado la función retorna el
        identificador del usuario que ingresó al sistema.
         */
        while (true) {
            System.out.println("Ingrese su nombre de usuario:");
            String nombreUsuario = t.next();
            System.out.println("Digite su contraseña:");
            String password = t.next();

            for (String usuarios : coleccionUsuarios.values()) {
                String[] datos = usuarios.split("&");//Leer comentarios de la línea 86 a 90.
                String nombreRegistrado = datos[1].split(" ")[1];
                String passwordRegistrado = datos[2].split(" ")[1];

                if (nombreRegistrado.equals(nombreUsuario) && passwordRegistrado.equals(password)) {
                    System.out.println("\nBienvenido a MedVirtualDCS\n");
                    idUsuarioActivo = Integer.parseInt(datos[0].split(" ")[1]);
                    return idUsuarioActivo;
                }
            }
            System.out.println("\nUsuario o contraseña incorrectos.\n");
        }
    }
}
