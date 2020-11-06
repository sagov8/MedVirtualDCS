package src;

//Santiago
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Evolucion {

    //Atributos
    private int idEvento;
    private String fechaEvento;
    private String tipoDeEvento;
    private String descripcionEvento;

    //Constructores
    public Evolucion() {
        this.idEvento = 0;
        this.fechaEvento = "";
        this.tipoDeEvento = "";
        this.descripcionEvento = "";
    }

    public Evolucion(int idEvento, String fechaEvento, String tipoDeEvento, String descripcionEvento) {
        this.idEvento = idEvento;
        this.fechaEvento = fechaEvento;
        this.tipoDeEvento = tipoDeEvento;
        this.descripcionEvento = descripcionEvento;
    }

    //Getters y Setters
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getTipoDeEvento() {
        return tipoDeEvento;
    }

    public void setTipoDeEvento(String tipoDeEvento) {
        this.tipoDeEvento = tipoDeEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    //Métodos y funciones
    public void guardarEvento() {

    }

    public String imprimirEvento() {
        return "";
    }

    public Object[] getTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void validacionNivelGlucosa() {

        Scanner t = new Scanner(System.in);

        float nivelGlucosa;

        System.out.println("Ingrese nivel de glucosa: " + "(mg/dl)");
        nivelGlucosa = t.nextFloat();

        if (nivelGlucosa > 168) {
            System.out.println("PELIGRO: Consultar medico, nivel de "
                    + "glucosa muy ALTO");
        }
        if (nivelGlucosa <= 154 && nivelGlucosa > 139) {
            System.out.println("ALARMA: Tomar medicamentos");

        }
        if (nivelGlucosa <= 126 && nivelGlucosa >= 97) {
            System.out.println("DIABETICO EN CONTROL");

        }

    }

    public void descripcionEvento() {

        Scanner t = new Scanner(System.in);

        String descripcionEvento = "";

        System.out.println("Descripcion del evento");
        descripcionEvento = t.nextLine();
        t.nextLine();

    }

    public void MenuEventosPaciente() {

        Scanner t = new Scanner(System.in);

        /* String DescripcionEvento = "";
        float nivelGlucosa;*/
        do {
            System.out.println("\nModulo - Paciente");
            System.out.println("\nInformacion del paciente: ");
            System.out.println("Nombre: ");
            System.out.println("\nMenu de opciones: ");
            System.out.println("1. Consultar historia clinica");
            System.out.println("2. Crear evento");
            System.out.println("3. Cerrar sesión");
            int optionMenuEvvolucion = t.nextInt();

            switch (optionMenuEvvolucion) {

                case 1:
                    System.out.println("Consulta tu Historia Clinica: ");

                    break;

                case 2:

                    validacionNivelGlucosa();

                    descripcionEvento();

                    /*    System.out.println("Crear Evolucion");
                    System.out.println("Ingrese nivel de glucosa: " + "(mg/dl)");
                    nivelGlucosa = t.nextFloat();

                    if (nivelGlucosa > 168) {
                        System.out.println("PELIGRO: Consultar medico, nivel de "
                                + "glucosa muy ALTO");
                    }
                    if (nivelGlucosa <= 154 && nivelGlucosa > 139) {
                        System.out.println("ALARMA: Tomar medicamentos");

                    }
                    if (nivelGlucosa <= 126 && nivelGlucosa >= 97) {
                        System.out.println("DIABETICO EN CONTROL");

                    }

                    System.out.println("Descripcion del evento: ");
                    descripcionEvento=t.nextLine();
                    t.nextLine();*/
 /*    System.out.println("*************************"
                            + "Evento guardado Satisfactoriamente"
                            + "******************************");*/
                    break;

                case 3:

                    System.out.println("Sesión Finalizada - MedVirtualDCS, vuelva pronto.");
                    System.exit(0);
                default:

                    System.out.println("Ingrese una opción valida");

            }

        } while (true);

    }

}
