package src;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

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
                        paciente.registrarUsuario(coleccionUsuarios, paciente.getNombreUsuario());

                    } else if (tipoDeUsuario.equalsIgnoreCase("medico")) {
                        Medico medico = new Medico();
                        medico.setTipoUsuario(tipoDeUsuario);

                        System.out.println("Ingrese nombre de usuario: ");
                        medico.setNombreUsuario(t.next());

                        medico.registrarUsuario(coleccionUsuarios, medico.getNombreUsuario());

                        medico.registrarMedico(medico.getIdUsuario(), coleccionMedicos);

                        System.out.println(coleccionUsuarios);
                        System.out.println(coleccionMedicos);
                    } else {
                        System.out.println("Por favor ingrese una opción válida.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese su nombre de usuario:");
                    String nombreUsuario = t.next();
                    System.out.println("Digite su contraseña:");
                    String password = t.next();
                    Usuario.verificarLogin(nombreUsuario, password, coleccionUsuarios);
                    salir = true;
                    break;
                case 3:
                    System.out.println("Gracias por usar MedVirtualDCS, vuelva pronto.");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        } while (!salir);
        //Código de prueba
    }
}
