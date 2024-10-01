package ej2;

public class Link extends Elemento {
    private static double tamaño=1;

    public Link(String nombre, int fecha_creacion){
        super(nombre, fecha_creacion);
    }

    public double getTamaño(){
        return tamaño;
    }

    
}
