package src;
//Diana

import java.util.Date;
import java.util.Scanner;

public class Diagnostico {

    Scanner t = new Scanner(System.in);
    //Atributos
    private int idDiagnostico;
    private Date fechaDiagnostico;
    final String[] diagnostico = {"Diabetes tipo 1", "Diabetes tipo 2",
        "Diabetes gestacional", "Diabetes relacionada con fibrosis quística",
        "Diabetes MODY", "Diabetes secundaria a medicamentos"};
    private String observacion;
    private String estadoPaciente;
    private static int idSiguiente = 1;

    //Constructores
    public Diagnostico() {
        this.idDiagnostico = idSiguiente++;
        this.fechaDiagnostico = null;
        this.observacion = "";
        this.estadoPaciente = "";
    }

    public Diagnostico(Date fechaDiagnostico, String observacion, String estadoPaciente) {
        this.idDiagnostico = idSiguiente++;
        this.fechaDiagnostico = fechaDiagnostico;
        this.observacion = observacion;
        this.estadoPaciente = estadoPaciente;
    }

    //Setter y Getter
    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public Date getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(Date fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    //Métodos
    public void crearDiagnostico() {

        System.out.println("Elija uno de los siguientes diagnósticos:");
        for (int i = 0; i < diagnostico.length; i++) {
            System.out.println((i + 1) + ". " + diagnostico[i]);
        }
        int item = t.nextInt();
        t.nextLine();
        observacion=diagnostico[item-1];
        System.out.println("Ingrese el estado del paciente: ");
        this.estadoPaciente = (t.nextLine());
        Date fechaDiagostico = new Date();
        this.fechaDiagnostico = fechaDiagostico;
    }

    public void guardarDiagnostico(int idHistoriaClinica) {

    }

    @Override
    public String toString() {
        return "Diagnostico{" + "idDiagnostico=" + idDiagnostico + ", "
                + "fechaDiagnostico=" + fechaDiagnostico + ", observacion="
                + observacion + ", estadoPaciente=" + estadoPaciente + '}';
    }

}
