package Parcial_2023_yo;

import java.util.ArrayList;

public abstract class Elemento_Abst {
    private String nombre;

    public Elemento_Abst(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }
    
    public abstract int getEmpleados();
    public abstract int getTiempo_Estimando();
    public abstract double getCosto();
    public abstract ArrayList<String> getmateriales();
    public abstract Elemento_Abst getCopia(Condicion c);


    public boolean equals(Elemento_Abst e){
        return nombre.equals(e.getNombre());
    }

    public abstract ArrayList<Tareas_basicas> buscar(Condicion c);

}
