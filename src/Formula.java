package src;

import java.util.ArrayList;
//Diana

public class Formula {

    //Atributos
    private int idFormula;
    private static int idSiguiente = 1;
    public ArrayList<Medicamento> medicamentos = new ArrayList<>();
    private String dosis;

    //Constructores
    public Formula() {
        this.idFormula = idSiguiente++;
        this.dosis="";
    }

    public Formula( String dosis) {
        this.idFormula = idSiguiente++;
        this.dosis=dosis;
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

  
    //Métodos

    @Override
    public String toString() {
        return "Formula{" + "idFormula=" + idFormula + ", medicamentos=" + medicamentos + ", dosis=" + dosis + '}';
    }
  
}
