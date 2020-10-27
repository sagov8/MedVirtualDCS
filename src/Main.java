package src;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        ArrayList<Diagnostico> diagnosticos = new ArrayList<>();
        boolean salirMenuDiagnostico = false;
        do {
            System.out.println("***********Menú Registro Diagnostico***********" +
                    "\n1. Registrar Diagnóstico." +
                    "\n2. Registrar Receta." +
                    "\n3. Medicamento."+
                    "\n4. Salir.");

            int opcion = t.nextInt();
            t.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el diagnóstico: ");
                    String observacion=(t.nextLine());
                    System.out.println("Ingrese el estado del paciente: ");
                    String estadoPaciente=(t.nextLine());
                    Date fechaDiagnostico=new Date();
                    //Calendar fechaDiagnostico = Calendar.getInstance(TimeZone.getDefault());
                    //diagnostico.setFechaDiagnostico(fechaDiagnostico);
                    //System.out.println("Fecha: "+fechaDiagnostico.getTime());
                    Diagnostico diagnostico=new Diagnostico(fechaDiagnostico,observacion,estadoPaciente);
                    System.out.println(diagnostico.toString());
                    diagnosticos.add(diagnostico);
                    break;

                case 2:
                    System.out.println("Ingrese recomendaciones: ");
                    String recomendaciones=t.nextLine();
                    System.out.println("Ingrese dosis: ");
                    String dosis=t.nextLine();
                    Date fechaReceta=new Date();
                    Receta receta=new Receta(fechaReceta,recomendaciones,dosis);
                    System.out.println(receta.toString());
                    break;
                case 3:
                    Medicamento medicamento=new Medicamento();
                    break;
                case 4:
                    System.out.println("Salió del menú de Registro Diagnostico");
                    salirMenuDiagnostico = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        }
        while (!salirMenuDiagnostico);
        /*int id = 0;
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
                    if (coleccionUsuarios.isEmpty()) {
                        System.out.println("No hay usuarios registrados.");
                    } else {
                        while (!verificado) {
                            System.out.println("Ingrese su nombre de usuario:");
                            String nombreUsuario = t.next();
                            System.out.println("Digite su contraseña:");
                            String password = t.next();
                            verificado = Usuario.verificarLogin(nombreUsuario, password, coleccionUsuarios);
                        }
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
        System.out.println(coleccionUsuarios.values());
        System.out.println(coleccionMedicos.values());*/
    }
}
