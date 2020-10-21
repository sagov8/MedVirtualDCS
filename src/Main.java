package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner t = new Scanner (System.in);
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
                        medico.registrarUsuario(tipoDeUsuario);
                    } else {
                        System.out.println("Por favor ingrese una opción válida.");
                    }
                }
                case 2 -> System.out.println("Ingrese su nombre de usuario:");
                case 3 -> {
                    System.out.println("Gracias por usar MedVirtualDCS, vuelva pronto.");
                    salir = true;
                }
                default -> System.out.println("Ingrese una opción válida");
            }
        }while(!salir);
        //Código de prueba
        Medico medico = new Medico(1,"3112345678",
                "Juan","Perez","fredsds@abs.com",
                "Medicina interna");

        System.out.println(medico);

        Paciente paciente = new Paciente();
        paciente.setNombrePaciente("Pepito");
        paciente.setNombreUsuario("Ppto");

        System.out.println(paciente);

        HistoriaClinica historia = new HistoriaClinica();
        String [] historiaClinica;
        historiaClinica = historia.crearHistoriaClinica("Nombre paciente: "+
                        paciente.getNombrePaciente(),
                "Datos médico:"+medico,
                "Diabetes tipo A",
                "El paciente dice estar medio bien");

        for (String s : historiaClinica) {
            System.out.println(s);
        }

    }
}
