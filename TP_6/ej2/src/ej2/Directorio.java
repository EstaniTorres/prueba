package ej2;

import java.util.ArrayList;

public class Directorio extends Elemento {
    protected ArrayList<Elemento> elementos;

    public Directorio(String nombre, int fecha_creacion) {
        super(nombre, fecha_creacion);
        elementos=new ArrayList<Elemento>();
    }

    public void addElementos(Elemento elemento){
        elementos.add(elemento);
    }
    

    public ArrayList<Elemento> getElementos(){ //solo para control de  q ande bien
        return elementos;
    }

    public int getCantidadElementos(){
        return elementos.size();
    }


    public double getTamaño(){
        double tamaño=0;
            for (Elemento elemento : elementos) {
                tamaño = tamaño + elemento.getTamaño();
            }
        return tamaño;
    }
    



    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Directorio "+super.toString();
    }


    
}
