package src;

//Santiago
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Evolucion {

    //Atributos
    private int idEvento;
    private Date fechaEvento;
    private String tipoDeEvento;
    private float nivelGlucosa;
    private String descripcionEvento;
    private static int idNext = 1;
    private boolean alerta;
    private String estadoNivel;

    //Constructores
    public Evolucion() {
        this.idEvento = idNext++;
        this.fechaEvento = null;
        this.tipoDeEvento = "";
        this.descripcionEvento = "";
        this.alerta = false;
    }

    public Evolucion(int idEvento, Date fechaEvento, String tipoDeEvento, String descripcionEvento) {
        this.idEvento = idEvento;
        this.fechaEvento = fechaEvento;
        this.tipoDeEvento = tipoDeEvento;
        this.descripcionEvento = descripcionEvento;
    }

    //Getters y Setters
    public float getNivelGlucosa() {
        return nivelGlucosa;
    }

    public void setNivelGlucosa(float nivelGlucosa) {
        this.nivelGlucosa = nivelGlucosa;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public boolean isAlerta() {
        return alerta;
    }

    public void setAlerta(boolean alerta) {
        this.alerta = alerta;
    }

    public String getEstadoNivel() {
        return estadoNivel;
    }

    public void setEstadoNivel(String estadoNivel) {
        this.estadoNivel = estadoNivel;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
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
    public void descripcionEvento() {

        Scanner t = new Scanner(System.in);

        System.out.println("Descripcion del evento");
        descripcionEvento = t.nextLine();
        t.nextLine();

    }

    public void guardarEvento() {
        Scanner t = new Scanner(System.in);

        System.out.println("Guarda evento");

    }

    public void imprimirEvento() {

        System.out.println("");

    }

    public void validacionNivelGlucosa(float nivelGlucosa) {

        if (nivelGlucosa > 200) {
            estadoNivel = "NIVEL CRÍTICO";
            alerta = true;
        }
        if (nivelGlucosa > 140 && nivelGlucosa <= 200) {
            estadoNivel = "NIVEL ELEVADO: Tomar medicamentos";
        }
        if (nivelGlucosa > 70 && nivelGlucosa <= 140) {
            estadoNivel = "NIVEL NORMAL";
        }
        if (nivelGlucosa <=70) {
            estadoNivel = "HIPOGLUCEMIA";
            alerta = true;
        }
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

                    //validacionNivelGlucosa();
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
