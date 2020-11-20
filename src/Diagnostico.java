package src;
//Diana

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Diagnostico {

    Scanner t = new Scanner(System.in);
    //Atributos
    private int idDiagnostico;
    private Date fechaDiagnostico;
    /*final String[] diagnostico = {"Diabetes tipo 1", "Diabetes tipo 2",
        "Diabetes gestacional", "Diabetes relacionada con fibrosis quística",
        "Diabetes MODY", "Diabetes secundaria a medicamentos"};*/
    private String observacion;
    private String recomendacion;
    private static int idSiguiente = 1;
    private Formula formula=new Formula();

    //Constructores
    public Diagnostico() {
        this.idDiagnostico = idSiguiente++;
        this.fechaDiagnostico = null;
        this.observacion = "";
        this.recomendacion = "";
    }

    public Diagnostico(Date fechaDiagnostico, String observacion, String estadoPaciente) {
        this.idDiagnostico = idSiguiente++;
        this.fechaDiagnostico = fechaDiagnostico;
        this.observacion = observacion;
        this.recomendacion = estadoPaciente;
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

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String estadoPaciente) {
        this.recomendacion = estadoPaciente;
    }

    public Formula getFormula() {
        return formula;
    }

    public void setFormula(Formula formula) {
        this.formula = formula;
    }

    //Métodos
    public void crearDiagnostico(String diagnostico,String recomendacion) {
        Date fechaDiagostico = new Date();
        this.fechaDiagnostico = fechaDiagostico;
        this.observacion=diagnostico;
        this.recomendacion =recomendacion;        
    }

    public String imprimirDiagnostico(ArrayList<Diagnostico> diagnosticos) {
        String imprimir="";
        for (int i = 0; i < diagnosticos.size(); i++) {
            Diagnostico diagnostico = diagnosticos.get(i);
            Formula formula=diagnostico.getFormula();
            imprimir = imprimir +"\n\nDIAGNÓSTICO " + (i + 1)+":"
            + "\nId Diagnóstico: " + diagnostico.getIdDiagnostico()
            + "\nFecha: " + diagnostico.getFechaDiagnostico()
            + "\nDiagnostico: " + diagnostico.getObservacion()
            + "\nRecomendacion: " + diagnostico.getRecomendacion();
            if (formula.medicamentos.size() != 0) {
                imprimir =imprimir+"\nFÓRMULA: ";
                for (int j = 0; j < formula.medicamentos.size(); j++) {
                    Medicamento medicamento = formula.medicamentos.get(j);
                    imprimir = imprimir +"\nMedicamento " + (j + 1)+": "
                    + "\nNombre: " + medicamento.getNombreMedicamento()
                    + "\nDosis: " + medicamento.getDosis();
                }
            }
        }
        return imprimir;
    }

    @Override
    public String toString() {
        return "Diagnostico{" + "idDiagnostico=" + idDiagnostico + ", "
                + "fechaDiagnostico=" + fechaDiagnostico + ", observacion="
                + observacion + ", recomendacion=" + recomendacion + '}';
    }

}
