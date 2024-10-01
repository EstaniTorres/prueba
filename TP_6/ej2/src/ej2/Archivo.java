package ej2;

public class Archivo extends Elemento{
    private int fecha_modificacion;
    private double tamaño;

    public Archivo(String nombre, int fecha_creacion, int fecha_modificacion, double tamaño) {
        super(nombre, fecha_creacion);
        this.fecha_modificacion = fecha_modificacion;
        this.tamaño = tamaño;
    }

    public double getTamaño(){
        return tamaño;
    }





    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Archivo " + super.toString() + ", fecha modificacion " + fecha_modificacion+ ", Tamaño "+ tamaño+"]";
    }





    

    
}
