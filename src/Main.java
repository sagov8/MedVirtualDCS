package src;

import java.util.HashMap;
import java.util.Scanner;
import src.InterfazDeUsuario.InicioSesion;
import java.util.ArrayList;//Borrarformula
public class Main {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        ArrayList<Diagnostico> diagnosticos = new ArrayList<>();//Crea un ArrayList de objetos
        ArrayList<Formula> formulas=new ArrayList<>();
        
        boolean salirMenuDiagnostico = false;
        do {
            System.out.println("\n***********Menú Diagnostico***********"
                    + "\n1. Crear Diagnóstico."
                    + "\n2. Listar Diagnósticos."
                    + "\n3. Crear Formula."
                    + "\n4. Listar Formulas."
                    + "\n5. Salir.");

            int opcion = t.nextInt();
            t.nextLine();

            switch (opcion) {
                case 1:
                    Diagnostico diagnostico = new Diagnostico();//Crear objeto de la clase Diagnóstico
                    //diagnostico.crearDiagnostico();//Llama el método que solicita los datos del diagnóstico (Diagnóstico y estado)
                    diagnosticos.add(diagnostico);//Guarda el diagnostico creado en el ArrayList
                    break;
                case 2:
                    for (int i = 0; i < diagnosticos.size(); i++) {//Imprime los diagnósticos guardados en el ArrayList
                        System.out.println("\nDiagnostico: " + (i + 1));
                        Diagnostico diagnostico2 = diagnosticos.get(i);//Guarda en un objeto Diagnostico los datos del ArrayList
                        System.out.println("Id: " + diagnostico2.getIdDiagnostico());
                        System.out.println("Fecha: " + diagnostico2.getFechaDiagnostico());
                        System.out.println("Diagnostico: " + diagnostico2.getObservacion());
                        System.out.println("Estado: " + diagnostico2.getEstadoPaciente());

                    }
                    break;
                case 3:
                    Formula formula=new Formula();
                    formula.crearFormula();
                    formulas.add(formula);
                    break;
                case 4:
                    for (int i = 0; i < formulas.size(); i++) {
                        Formula formula2=formulas.get(i);
                        formula2.imprimirFormula(i);
                    }
                    
                    /*for (int i = 0; i < formulas.size(); i++) {
                        System.out.println("\nFormula: " + (i + 1));
                        Formula formula2=formulas.get(i);
                        System.out.println("Id: "+formula2.getIdFormula());
                        System.out.println("Fecha: "+fomula2.getFechaFormula());
                        System.out.println("Recomendación: "+formula2.getRecomendacion());
                        if((fomula2.getMedicamentos().size())!=0){
                            for (int j = 0; j < formula2.getMedicamentos().size(); j++) {
                                Medicamento medicamento=formula2.getMedicamentos().get(j);
                                System.out.println("Medicamento :"+(j+1));
                                System.out.println("Nombre: "+medicamento.getNombreMedicamento() );
                                System.out.println("Dosis: "+medicamento.getDosis());
                            }
                        }
                    }*/
                    break;
                case 5:
                    System.out.println("Salió del menú Diagnostico");
                    salirMenuDiagnostico = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        } while (!salirMenuDiagnostico);

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
