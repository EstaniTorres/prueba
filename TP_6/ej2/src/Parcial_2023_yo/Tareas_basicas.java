package Parcial_2023_yo;

import java.util.ArrayList;

public class Tareas_basicas extends Elemento_Abst {
    private ArrayList<String> materiales;
    private double costo;
    private int cantidad_empleados;
    private int tiempo_estimado;

    public Tareas_basicas(String nombre, double costo, int cantidad_empleados, int tiempo_estimado) {
        super(nombre);
        this.costo = costo;
        this.cantidad_empleados = cantidad_empleados;
        this.tiempo_estimado = tiempo_estimado;
        materiales = new ArrayList<String>();
    }

    public void addMateriales(String material){
        if(!materiales.contains(material)){
            materiales.add(material);
        }
    }


    @Override
    public int getEmpleados() {
        return cantidad_empleados;
    }

    @Override
    public int getTiempo_Estimando() {
        return tiempo_estimado;
    }

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public ArrayList<String> getmateriales() {
        ArrayList<String> aux = new ArrayList<>();
        aux.addAll(materiales);
        return aux;
    }

    @Override
    public String toString() {
        return "Tareas_basicas [materiales=" + materiales + ", costo=" + costo + ", cantidad_empleados="
                + cantidad_empleados + ", tiempo_estimado=" + tiempo_estimado + "]";
    }

    @Override
    public Elemento_Abst getCopia(Condicion c) {
        if(c.cumple(this)){
            return new Tareas_basicas(getNombre(), costo, cantidad_empleados, tiempo_estimado);
        }else{
            return null;
        }
    }

    @Override
	public ArrayList<Tareas_basicas> buscar(Condicion c){
		ArrayList<Tareas_basicas> salida = new ArrayList<Tareas_basicas>();
		if (c.cumple(this))
			salida.add(this);
	    return salida;
	}

    


    
}
