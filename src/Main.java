package src;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner t = new Scanner (System.in);
        //Un TreeMap guarda datos de manera ordenada según la clave asignada.
        TreeMap<String, HashMap<String, String>> coleccionUsuarios = new TreeMap<>();
        HashMap<String, String> coleccionMedicos = new HashMap<>();
        boolean salir = false;//variable de salida
        //Menú de opciones
        do {
            System.out.println("**************************"+
                                "\nBIENVENIDO A MEDVIRTUALDCS"+
                                "\n**************************");
            System.out.println("\nMenú de opciones: "+"\n1. Registrar usuario."
                                +"\n2. Iniciar sesión."+"\n3. Salir.");

            int opcion = t.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nElegir entre las siguientes opciones:" + "\n1. Paciente" +
                            "\n2. Médico");
                    int tipoDeUsuario = t.nextInt();//Recibe el tipo de usuario

                    if (tipoDeUsuario == 1) {
                        Paciente paciente = new Paciente();
                        paciente.registrarUsuario(tipoDeUsuario, coleccionUsuarios, paciente.getIdUsuario());
                    } else if (tipoDeUsuario == 2) {
                        Medico medico = new Medico();
                        medico.registrarUsuario(tipoDeUsuario, coleccionUsuarios, medico.getIdUsuario());

                        medico.registrarMedico(medico.getIdUsuario(), coleccionMedicos);
                        System.out.println(coleccionUsuarios);
                    } else {
                        System.out.println("Por favor ingrese una opción válida.");
                    }
                break;
                case 2:
                    System.out.println("Ingrese su nombre de usuario:");
                    String nombreUsuario = t.next();

                    int i = 0;
                    boolean usuarioExistente = false;
                    do {
                        if (coleccionUsuarios.get(String.valueOf(i)).get("nombre").equals(nombreUsuario)) {
                            System.out.println("Digite su contraseña:");
                            String password = t.next();
                            if (coleccionUsuarios.get(String.valueOf(i)).get("password").equals(password)) {
                                System.out.println("Bienvenido a MedVirtualDCS Dr. "+
                                        coleccionMedicos.get("nombreMedico")+" "+
                                        coleccionMedicos.get("apellidoMedico"));
                                usuarioExistente = true;
                                salir = true;
                            }else{
                                System.out.println("Contraseña incorrecta");
                            }
                        }
                        i++;
                    } while (i < coleccionUsuarios.size());
                    if (!usuarioExistente){
                        System.out.println("Usuario no encontrado");
                    }
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
