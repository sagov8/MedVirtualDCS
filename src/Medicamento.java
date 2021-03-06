package src;

//Diana
public class Medicamento {
    //Atributos
    private int idMedicamento;
    final String[] medicamento ={"Metformina","Sulfonilureas","Meglitinidas",
        "Tiazolidinadionas","Inhibidores de la DPP-4","Agonistas del receptor de la GLP-1",
        "Inhibidores de la SGLT2","Insulina"};
    private String dosis;
    private String nombreMedicamento;
    private String principioActivo;
    private String[] viaAdministracion={"Oral"};
    private String contraindicaciones;
    //Constructores
    public Medicamento() {
        this.idMedicamento = 0;
        this.dosis="";
        this.nombreMedicamento = "";
        this.principioActivo = "";
        //this.viaAdministracion = "";
        this.contraindicaciones = "";
    }
    public Medicamento(int idMedicamento, String dosis,String nombreMedicamento, String principioActivo, String viaAdministracion, String contraindicaciones) {
        this.idMedicamento = idMedicamento;
        this.dosis=dosis;
        this.nombreMedicamento = nombreMedicamento;
        this.principioActivo = principioActivo;
        //this.viaAdministracion = viaAdministracion;
        this.contraindicaciones = contraindicaciones;
    }
    //Getter y Setter
    public int getIdMedicamento() {
        return idMedicamento;
    }
    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }
    public String getDosis() {
        return dosis;
    }
    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    public String getNombreMedicamento() {
        return nombreMedicamento;
    }
    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }
    public String getPrincipioActivo() {
        return principioActivo;
    }
    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }
    public String getContraindicaciones() {
        return contraindicaciones;
    }
    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }
}
