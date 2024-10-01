package ej2;

import java.util.ArrayList;

public class Sistema {
    private String nombre;
    private ArrayList<Elemento> elementos_sistema;

    public Sistema(String nombre) {
        this.nombre = nombre;
        elementos_sistema=new ArrayList<Elemento>();
    }

    public void addElementos_sistema(Elemento elemento){
        if(!elementos_sistema.contains(elemento)){
            elementos_sistema.add(elemento);
        }
    }


    public double getTamaño(Elemento e){ 
        double tamaño=0;

        if(elementos_sistema.contains(e)){
            tamaño =tamaño+e.getTamaño();
        }



        return tamaño;
    }

    public int getCantidad_elementos(Directorio d){
        return d.getCantidadElementos();
    }

    public double get_tamañoDirectorio(Directorio d){
        return d.getTamaño();
    }

}
