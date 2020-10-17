package src;

public class Main {

    public static void main(String[] args) {

        Medico medico = new Medico();
        medico.setIdMedico(1);
        medico.setNombreMedico("Juan");
        medico.setApellidoMedico("Perez");
        medico.setNumeroTelefonicoMedico("3112345678");
        medico.setCorreoMedico("juanperez@gmail.com");
        medico.setEspecialidad("Medicina interna");

        System.out.println(medico);
    }
}
