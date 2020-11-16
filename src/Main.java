package src;

import java.util.HashMap;
import java.util.Scanner;
import src.InterfazDeUsuario.InicioSesion;
import java.util.ArrayList;//Borrarformula
public class Main {

    public static void main(String[] args) {
        HashMap<String,Paciente>colecionPacientes=new HashMap<>();
        
        
        /*Scanner t = new Scanner(System.in);
        int id = 0;
        int usuarioActivo = -1;*/
        /*
        HashMap organiza datos de la manera <k, v> (clave, valor), solo permite Clases, no datos
        primitivos, por eso se usa Integer y no int.
        */
        /*HashMap<Integer, String> coleccionUsuarios = new HashMap<>();
        HashMap<Integer, String> coleccionMedicos = new HashMap<>();

        
        InicioSesion ventana = new InicioSesion();
        ventana.setVisible(true);

        HashMap<Integer, String> coleccionPacientes = new HashMap<>();


        boolean salir = false;

        do {
            System.out.println("**************************" +
                    "\nBIENVENIDO A MEDVIRTUALDCS" +
                    "\n**************************" +
                    "\nMenú de opciones: " +
                    "\n1. Registrar usuario." +
                    "\n2. Iniciar sesión." +
                    "\n3. Salir.");

            int opcion = t.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nEscriba el tipo de usuario (medico/paciente):");
                    String tipoDeUsuario = t.next();

                    if (tipoDeUsuario.equalsIgnoreCase("paciente")) {
                        Paciente paciente = new Paciente();//Instancia el objeto paciente
                        paciente.setTipoUsuario(tipoDeUsuario);//asigna el tipo de Usuario y el ID respectivo.
                        paciente.setIdUsuario(id);*/

                        /* El método registrarUsuario() devuelve true en caso de que el registro de
                        Usuario se complete exitósamente. De no ser así no permite registrar los datos
                        personales del paciente ó médico. Si el registro se hace correctamente, guarda al
                        usuario en el Hashmap coleccionUsuarios.
                        La clase paciente hereda el método registrarUsuario de la clase Usuario.*/
                        /*boolean registroUsuarioExitoso = paciente.registrarUsuario(coleccionUsuarios);
                        if (registroUsuarioExitoso){
                            paciente.registrarPaciente(id, coleccionPacientes);
                        }
                        id++;

                    } else if (tipoDeUsuario.equalsIgnoreCase("medico")) {
                        Medico medico = new Medico();
                        medico.setTipoUsuario(tipoDeUsuario);
                        medico.setIdUsuario(id);

                        //Leer comentario de la línea 42
                        boolean registroUsuarioExitoso = medico.registrarUsuario(coleccionUsuarios);
                        if (registroUsuarioExitoso){
                            medico.registrarMedico(medico.getIdUsuario(), coleccionMedicos);
                        }
                        id++;
                    } else {
                        System.out.println("Por favor ingrese una opción válida.");
                    }
                    break;
                case 2:*/
                    /*
                    Para iniciar sesión primero se hace una verificación de la coleccionUsuarios
                    en caso de estar vacía es porque no hay usuarios registrados, en caso contrario
                    se pide un nombre de usuario y password y a través del método verificarLogin()
                    se realiza el proceso de verificación retornando en caso éxitoso el ID del usuario
                    que se realizó su login en el sistema.
                     */
                    /*if (coleccionUsuarios.isEmpty()) {
                        System.out.println("No hay usuarios registrados.");
                    } else {
                        usuarioActivo = Usuario.verificarLogin(coleccionUsuarios);
                        salir = true;
                    }
                    break;
                case 3:
                    System.out.println("Gracias por usar MedVirtualDCS, vuelva pronto.");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        }
        while (!salir);
        //Código de prueba
        System.out.println(coleccionUsuarios.get(usuarioActivo));
        System.out.println(coleccionPacientes.get(usuarioActivo));
        System.out.println(coleccionMedicos.get(usuarioActivo));*/

    }
}
