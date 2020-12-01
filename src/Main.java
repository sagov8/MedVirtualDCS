package src;

import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        
        Date fecha = new Date();
        Evolucion evo = new Evolucion(1, String.valueOf(fecha), "Nivel de Glucosa", "1.8");    
        Evolucion evo2 = new Evolucion(2, String.valueOf(fecha), "Nuevo síntoma", "Mareo en las mañanas");
        ArrayList <Evolucion> evoluciones = new ArrayList<>();
        
        evoluciones.add(evo);
        evoluciones.add(evo2);
        
        Tratamiento tratamiento = new Tratamiento(1, "El paciente requiere una segunda evaluación",
                evoluciones);
        
        Medico medico = new Medico (1234, "8123456", "Juan", "Cruz", "10611231234", "jcruz@gmail.com", "internista");
        
        Paciente paciente = new Paciente(1, "CC", 10123456, "Pepe", "Perez", "3124567891", "pperez@gmail.com", "Calle 1 #2 33",
                "8/8/1991", "M", 45, "Mareos constantes");
        
        Diagnostico diagnostico = new Diagnostico(String.valueOf(paciente.getNumeroDocumento()), fecha, 
                "Diabetes tipo 2", "Realizar pruebas de laboratorio", "estable",
                tratamiento, medico);
        
        paciente.setDiagnosticoYTratamiento(diagnostico);
        
        HistoriaClinica hc = new HistoriaClinica();
        hc.crearHistoriaClinica(paciente);
        System.out.println(hc.consultarPaciente(String.valueOf(paciente.getNumeroDocumento())).getDiagnosticoYTratamiento());
        
    }
}
