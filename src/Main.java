package src;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner t = new Scanner (System.in);

        TreeMap<String, String> usuarios = new TreeMap<>();
        HashMap<String, String> pacientes = new HashMap<>();
        HashMap<String, Object> medicos = new HashMap<>();

        //Menú de opciones
        boolean salir = false;
        do {
            System.out.println("**************************"+
                                "\nBIENVENIDO A MEDVIRTUALDCS"+
                                "\n**************************");
            System.out.println("\nMenú de opciones: "+"\n1. Registrar usuario."
                                +"\n2. Iniciar sesión."+"\n3. Salir");
            int opcion = t.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\nElegir entre las siguientes opciones:" + "\n1. Paciente" +
                            "\n2. Médico");
                    int tipoDeUsuario = t.nextInt();
                    if (tipoDeUsuario == 1) {
                        Paciente paciente = new Paciente();
                        paciente.registrarUsuario(tipoDeUsuario);
                    } else if (tipoDeUsuario == 2) {
                        Medico medico = new Medico();
                        medico.registrarUsuario(tipoDeUsuario);//Verificar si nombre de usuario no se encuentra disponible
                        usuarios.put(medico.getNombreUsuario(), medico.getPassword());
                        medico.registrarMedico();
                        medicos.put(medico.getNombreUsuario(),medico);
                    } else {
                        System.out.println("Por favor ingrese una opción válida.");
                    }
                }
                case 2 -> {
                    System.out.println("Ingrese su nombre de usuario:");
                    String nombreUsuario = t.next();
                    if(usuarios.containsKey(nombreUsuario)){
                        System.out.println("Digite su contraseña:");
                        String password = t.next();
                        if(usuarios.get(nombreUsuario).equals(password)){
                            System.out.println("\nBienvenido al sistema");
                            System.out.println(medicos.get(nombreUsuario));

                        }else{
                            System.out.println("Contraseña errónea");
                        }
                    }else{
                        System.out.println("Usuario no registrado.");
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

    }
}
