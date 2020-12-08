package src;
//Diana

import java.util.ArrayList;
import java.util.Date;

public class Diagnostico {

    //Atributos
    private int idDiagnostico;
    private Date fechaDiagnostico;
    private String diagnostico; 
    private String observacion;
    private String estadoPaciente;
    private String tratamiento;
    private String recomendacion;
    private static int idSiguiente = 1;
    private Formula formula=new Formula();
    private Dieta dieta=new Dieta();
    private Cirugia cirugia=new Cirugia();
    private Tratamiento informe;
    private Medico encargado;
    
    //Constructores
    public Diagnostico() {
        this.fechaDiagnostico = null;
        this.observacion = "";
        this.recomendacion = null;
    }
   
    public Diagnostico(String idPaciente, Date fechaDiagnostico, String observacion, 
            String estadoPaciente, String diagnostico) {
        //this.idDiagnostico = idPaciente;////Está comentada porque idDiagnostico es int no String
        this.fechaDiagnostico = fechaDiagnostico;
        this.observacion = observacion;
        this.estadoPaciente = estadoPaciente;
        this.diagnostico = diagnostico;
        this.tratamiento = "Dieta saludable, ejercicio 2 veces por semana";
        this.recomendacion = estadoPaciente;
    }

    public Diagnostico(String idDiagnostico, Date fechaDiagnostico, String diagnostico, 
            String observacion, String estadoPaciente,  Tratamiento informe,
            Medico encargado) {
        //this.idDiagnostico = idDiagnostico;//Está comentada porque idDiagnostico es int no String
        this.fechaDiagnostico = fechaDiagnostico;
        this.diagnostico = diagnostico;
        this.observacion = observacion;
        this.estadoPaciente = estadoPaciente;
        this.informe = informe;
        this.encargado = encargado;
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Tratamiento getInforme() {
        return informe;
    }

    public void setInforme(Tratamiento informe) {
        this.informe = informe;
    }

    public Medico getEncargado() {
        return encargado;
    }

    public void setEncargado(Medico encargado) {
        this.encargado = encargado;
    }
     
    
    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public Cirugia getCirugia() {
        return cirugia;
    }

    public void setCirugia(Cirugia cirugia) {
        this.cirugia = cirugia;
    }

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }
    //Métodos

    public void crearDiagnostico(String diagnostico,String recomendacion) {
        this.idDiagnostico = idSiguiente++;
        Date fechaDiagostico = new Date();
        this.fechaDiagnostico = fechaDiagostico;
        this.observacion=diagnostico;
        this.recomendacion =recomendacion;        
    }

    public String imprimirDiagnostico(ArrayList<Diagnostico> diagnosticos, String motivoConsulta) {
        String imprimir="";
        for (int i = 0; i < diagnosticos.size(); i++) {
            Diagnostico diagnostico = diagnosticos.get(i);
            Formula formula=diagnostico.getFormula();
            Dieta dieta=diagnostico.getDieta();
            Cirugia cirugia=diagnostico.getCirugia();
            imprimir = imprimir +"\n\nDIAGNÓSTICO " + (i + 1)+":"
            + "\nId Diagnóstico: " + diagnostico.getIdDiagnostico()
            + "\nFecha: " + diagnostico.getFechaDiagnostico()
            + "\nDiagnostico: " + diagnostico.getObservacion()
            + "\nMotivo Consulta: " + motivoConsulta        
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
            if(dieta.getDescripcion()!=null)
                imprimir=imprimir+"\nDieta: "+dieta.getDescripcion();
            if(cirugia.getDescripcion()!=null)
                imprimir=imprimir+"\nCirugía: "+cirugia.getDescripcion();
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
