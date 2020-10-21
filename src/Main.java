package src;

import java.util.Calendar;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {

        Medico medico = new Medico(1,"3112345678",
                "Juan","Perez","fredsds@abs.com",
                "Medicina interna");

        System.out.println(medico);
        Calendar colombiaToday = Calendar.getInstance(TimeZone.getDefault());
        System.out.println(colombiaToday.getTime());
    }
}
