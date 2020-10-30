package src;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
//Diana

public class Receta {

    Scanner t = new Scanner(System.in);
    //Atributos
    private int idReceta;
    private Date fechaReceta;
    private String recomendacion;
    private static int idSiguiente = 1;
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();

    //Constructores
    public Receta() {
        this.idReceta = idSiguiente++;
        this.fechaReceta = null;
        this.recomendacion = "";
    }

    public Receta(Date fechaReceta, String recomendacion, String dosis) {
        this.idReceta = idSiguiente++;
        this.fechaReceta = fechaReceta;
        this.recomendacion = recomendacion;
    }
    //Getter y Setter

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public Date getFechaReceta() {
        return fechaReceta;
    }

    public void setFechaReceta(Date fechaReceta) {
        this.fechaReceta = fechaReceta;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    //Métodos
    public void crearReceta() {
        Date fechaReceta = new Date();
        this.fechaReceta = fechaReceta;
        System.out.println("Digite las recomendaciones: ");
        recomendacion = t.nextLine();
        int formular = 1;
        do {
            System.out.println("Desea formular medicamento? 1.Si 2.No");
            formular = t.nextInt();
            if (formular == 1) {
                agregarMedicamento();
            }
        } while (formular != 2);
    }

    public void imprimirReceta(int i) {
       
            System.out.println("\nReceta: " + (i + 1));
            System.out.println("Id: " +idReceta);
            System.out.println("Fecha: " + fechaReceta);
            System.out.println("Recomendación: " + recomendacion);
            if ((medicamentos.size()) != 0) {
                for (int j = 0; j < medicamentos.size(); j++) {
                    Medicamento medicamento = medicamentos.get(j);
                    System.out.println("Medicamento :" + (j + 1));
                    System.out.println("Nombre: " + medicamento.getNombreMedicamento());
                    System.out.println("Dosis: " + medicamento.getDosis());
                }
            }
        
    }

    public void agregarMedicamento() {
        Medicamento medicamento = new Medicamento();
        int item = 0;
        do {
            System.out.println("Elija uno de los siguientes medicamentos:");
            for (int i = 0; i < medicamento.medicamento.length; i++) {
                System.out.println((i + 1) + ". " + medicamento.medicamento[i]);
            }
            item = t.nextInt();
            t.nextLine();
        } while (item < 1 || item > 20);
        medicamento.setNombreMedicamento(medicamento.medicamento[item - 1]);
        System.out.println("Ingrese la dosis: ");
        medicamento.setDosis(t.nextLine());
        medicamentos.add(medicamento);
    }

    public void guardarReceta(int idHistoriaClinica) {

    }

    @Override
    public String toString() {
        return "Receta{" + "idReceta=" + idReceta + ", fechaReceta=" + fechaReceta + ", recomendacion=" + recomendacion + '}';
    }

}
