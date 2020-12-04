package src;

import java.util.ArrayList;

public class Tratamiento {
    private int id;
    private String descripcion;
    private ArrayList<Evolucion> evoluciones;

    public Tratamiento(int id, String descripcion, ArrayList<Evolucion> evoluciones) {
        this.id = id;
        this.descripcion = descripcion;
        this.evoluciones = evoluciones;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Evolucion> getEvoluciones() {
        return evoluciones;
    }

    public void setEvoluciones(ArrayList<Evolucion> evoluciones) {
        this.evoluciones = evoluciones;
    }
    
   
    
}