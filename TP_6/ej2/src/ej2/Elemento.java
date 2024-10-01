package ej2;

public abstract class Elemento {
    private String nombre;
    private int fecha_creacion;

    public Elemento(String nombre, int fecha_creacion){
        this.nombre=nombre;
        this.fecha_creacion=fecha_creacion;
    }

    public abstract double getTamaño(); 
    /*puedo crear una clase abstracta CALCULADOR_TAMAÑO y desde ahi calculo el tamaño para los distintos elementos
    de esa manera tambien se puede cambiar la manera de calcular el tamaño*/
    

    @Override
    public  String toString() {
        return " [nombre=" + nombre + ", fecha_creacion=" + fecha_creacion;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public int getFecha_creacion() {
        return fecha_creacion;
    }

    public boolean equals(Object o1){
        Elemento elemento = (Elemento) o1;
        return nombre.equals(elemento.getNombre());
    }

}
