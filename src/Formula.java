package src;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
//Diana

public class Formula {

    Scanner t = new Scanner(System.in);
    //Atributos
    private int idFormula;
    private String recomendacion;
    private static int idSiguiente = 1;
    public ArrayList<Medicamento> medicamentos = new ArrayList<>();

    //Constructores
    public Formula() {
        this.idFormula = idSiguiente++;
        this.recomendacion = "";
    }

    public Formula(String recomendacion, String dosis) {
        this.idFormula = idSiguiente++;
        this.recomendacion = recomendacion;
    }
    //Getter y Setter

    public int getIdFormula() {
        return idFormula;
    }

    public void setIdFormula(int idFormula) {
        this.idFormula = idFormula;
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
    public void crearFormula() {
        Date fechaFormula = new Date();
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

    public void imprimirFormula(int i) {
       
            System.out.println("\nFormula: " + (i + 1));
            System.out.println("Id: " +idFormula);
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

    public void guardarFormula(int idHistoriaClinica) {

    }

    @Override
    public String toString() {
        return "Formula{" + "idFormula=" + idFormula + ", recomendacion=" + recomendacion + '}';
    }

}
