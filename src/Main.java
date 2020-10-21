package src;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner t = new Scanner (System.in);

        TreeMap<String, HashMap<String, String>> usuarios = new TreeMap<>();
        //Menú de opciones
        boolean salir = false;//variable de salida
        do {
            //Encabezado pantalla de inicio
            System.out.println("**************************"+
                                "\nBIENVENIDO A MEDVIRTUALDCS"+
                                "\n**************************");
            System.out.println("\nMenú de opciones: "+"\n1. Registrar usuario."
                                +"\n2. Iniciar sesión."+"\n3. Salir");
            int opcion = t.nextInt();//Registra la opción de inicio de sesión, registro o salida
            Medico medico = new Medico();
            Paciente paciente = new Paciente();
            //Selecciona una opción
            switch (opcion) {
                //Registro de Usuario
                case 1 -> {
                    System.out.println("\nElegir entre las siguientes opciones:" + "\n1. Paciente" +
                            "\n2. Médico");
                    int tipoDeUsuario = t.nextInt();//Recibe el tipo de usuario

                    if (tipoDeUsuario == 1) {
                        //Instancia un objeto Paciente
                        paciente.registrarUsuario(tipoDeUsuario, usuarios);
                    } else if (tipoDeUsuario == 2) {
                        //Instancia un objeto Medico

                        //Pide los datos al usuario médico
                        medico.registrarUsuario(tipoDeUsuario, usuarios);// Falta Verificar si nombre de usuario no se encuentra disponible
                        //Se guarda en un HashMap: usuarios, la información de médico
                        System.out.println(usuarios.get(String.valueOf(medico.getIdUsuario())).get("nombre"));
                        //Registra los datos del Médico
                        medico.registrarMedico();
                        //Guarda la información del médico en HashMap: médicos
                    } else {
                        System.out.println("Por favor ingrese una opción válida.");
                    }
                }
                case 2 -> {
                    System.out.println("Ingrese su nombre de usuario:");
                    String nombreUsuario = t.next();

                    int i = 0;
                    boolean usuarioExistente = false;
                    do {
                        if (usuarios.get(String.valueOf(i)).get("nombreUsuario").equals(nombreUsuario)) {
                            System.out.println("Digite su contraseña:");
                            String password = t.next();
                            if (usuarios.get(String.valueOf(i)).get("password").equals(password)) {
                                System.out.println("Bienvenido al sistema");
                                usuarioExistente = true;
                            }else{
                                System.out.println("Contraseña incorrecta");
                            }

                        }
                        i++;
                    } while (i < usuarios.size());
                    if (!usuarioExistente){
                        System.out.println("Usuario no encontrado");
                    }
                }
                case 3 -> {
                    System.out.println("Gracias por usar MedVirtualDCS, vuelva pronto.");
                    salir = true;
                }
                default -> System.out.println("Ingrese una opción válida");
            }
        }while(!salir);
        //Código de prueba
        System.out.println(usuarios);
    }
}
