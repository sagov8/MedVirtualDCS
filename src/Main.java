package src;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        int id = 0;
        //HashMap organiza datos de la manera <k, v> (clave, valor)
        HashMap<Integer, String> coleccionUsuarios = new HashMap<>();
        HashMap<Integer, String> coleccionMedicos = new HashMap<>();

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
                        Paciente paciente = new Paciente();
                        paciente.setTipoUsuario(tipoDeUsuario);
                        paciente.setIdUsuario(id);

                        paciente.registrarUsuario(coleccionUsuarios, paciente.getNombreUsuario());
                        id++;

                    } else if (tipoDeUsuario.equalsIgnoreCase("medico")) {
                        Medico medico = new Medico();
                        medico.setTipoUsuario(tipoDeUsuario);
                        medico.setIdUsuario(id);

                        System.out.println("Ingrese nombre de usuario: ");
                        medico.setNombreUsuario(t.next());

                        medico.registrarUsuario(coleccionUsuarios, medico.getNombreUsuario());

                        medico.registrarMedico(medico.getIdUsuario(), coleccionMedicos);
                        id++;

                    } else {
                        System.out.println("Por favor ingrese una opción válida.");
                    }
                    break;
                case 2:
                    boolean verificado = false;
                    if (coleccionUsuarios.size() != 0) {
                        while (!verificado) {
                            System.out.println("Ingrese su nombre de usuario:");
                            String nombreUsuario = t.next();
                            System.out.println("Digite su contraseña:");
                            String password = t.next();
                            verificado = Usuario.verificarLogin(nombreUsuario, password, coleccionUsuarios);
                        }
                        salir = true;
                    } else {
                        System.out.println("No hay usuarios registrados.");
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
            while (!salir) ;
            //Código de prueba
            System.out.println(coleccionUsuarios.values());
            System.out.println(coleccionMedicos.values());
        }
    }
