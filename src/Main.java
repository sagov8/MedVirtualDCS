package src;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import src.InterfazHistorial.FormularioHistorial;

public class Main {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        int id = 0;
        int usuarioActivo = -1;
        /*
        HashMap organiza datos de la manera <k, v> (clave, valor), solo permite Clases, no datos
        primitivos, por eso se usa Integer y no int.
        */
        HashMap<String, Usuario> coleccionUsuarios = new HashMap<>();
        HashMap<String, Medico> coleccionMedicos = new HashMap<>();
        HashMap<String, Paciente> coleccionPacientes = new HashMap<>();
        HashMap<String, HistoriaClinica> historiasClinicas = new HashMap<>();
        ArrayList<Diagnostico> diagnosticos = new ArrayList<>();
        ArrayList<Evolucion> evoluciones = new ArrayList<>();
        
        FormularioHistorial form = new FormularioHistorial();
        form.setVisible(true);
        
        Paciente paciente = new Paciente(1, "CC", 10123456, "Pepe", "Perez", "3124567891", "pperez@gmail.com", "Calle 1 #2 33", 
        "8/8/1991", "Masculino", 45);
        
        Medico medico = new Medico();
        
        Usuario usuario = new Usuario(10123456, "pperez", "123456", "paciente");
        
        
        
        
        
        
        
        
        
        
        /*
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
                        paciente.setIdUsuario(id);

                 
                        boolean registroUsuarioExitoso = paciente.registrarUsuario(coleccionUsuarios);
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
                case 2:
                    
                    if (coleccionUsuarios.isEmpty()) {
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
        System.out.println(coleccionMedicos.get(usuarioActivo));
        */
    }
}
