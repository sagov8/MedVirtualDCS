package src;

import java.util.ArrayList;
//Diana

public class Formula extends Tratamiento{

    //Atributos
    private static int idSiguiente = 1;
    public ArrayList<Medicamento> medicamentos = new ArrayList<>();
    private String dosis;
    
    //Constructores
    public Formula() {
        this.dosis="";
    }

    public Formula( String dosis) {
        this.dosis=dosis;
    }
    //Getter y Setter

       public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    //Métodos
    @Override
    public String toString() {
        return "Formula{" + "idFormula=" + id + ", medicamentos=" + medicamentos + ", dosis=" + dosis + '}';
    }
  
}
