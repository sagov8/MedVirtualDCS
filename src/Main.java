package src;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner t = new Scanner (System.in);
        Paciente paciente = new Paciente();
        Medico medico = new Medico();
        //HashMap organiza datos de la manera <k, v> (clave, valor)
        HashMap<String, String> coleccionUsuarios = new HashMap<>();
        HashMap<String, String> coleccionMedicos = new HashMap<>();

        boolean salir = false;//variable de salida
        //Menú de opciones
        do {
            System.out.println("**************************"+
                                "\nBIENVENIDO A MEDVIRTUALDCS"+
                                "\n**************************")+
                                "\nMenú de opciones: "+
                                "\n1. Registrar usuario."+
                                "\n2. Iniciar sesión."+
                                "\n3. Salir.");

            int opcion = t.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nElegir entre las siguientes opciones:" + "\n1. Paciente" +
                                                                                   "\n2. Médico");
                    int tipoDeUsuario = t.nextInt();

                    if (tipoDeUsuario == 1) {

                        paciente.registrarUsuario();
                    } else if (tipoDeUsuario == 2) {

                        //Registar como usuario:
                        medico.registrarUsuario();
                        //Registrar como médico:
                        medico.registrarMedico(medico.getIdUsuario(), coleccionMedicos);
                        System.out.println(coleccionUsuarios);
                    } else {
                        System.out.println("Por favor ingrese una opción válida.");
                    }
                break;
                case 2:
                    System.out.println("Ingrese su nombre de usuario:");
                    String nombreUsuario = t.next();
                    System.out.println("Digite su contraseña:");
                    String password = t.next();
                break;
                case 3:
                    System.out.println("Gracias por usar MedVirtualDCS, vuelva pronto.");
                    salir = true;
                break;
                default: System.out.println("Ingrese una opción válida");
            }
        }while(!salir);
        //Código de prueba
    }
}
