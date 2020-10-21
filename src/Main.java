package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner t = new Scanner (System.in);

        Medico medico = new Medico(1,"3112345678",
                "Juan","Perez","fredsds@abs.com",
                "Medicina interna");

        System.out.println(medico);

        Paciente paciente = new Paciente();
        paciente.setNombrePaciente("Pepito");
        paciente.setNombreUsuario("Ppto");

        System.out.println(paciente);

        HistoriaClinica historia = new HistoriaClinica();
        String [] historiaClinica = new String[4];
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
