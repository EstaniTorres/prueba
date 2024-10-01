package ej2;

public class ArchivoComprimido extends Directorio{
    private double tasa_compresion;

    public ArchivoComprimido(String nombre, int fecha_creacion, double tasa_compresion) {
        super(nombre, fecha_creacion);
        this.tasa_compresion=tasa_compresion;
    }

    public double getTasa_compresion(){
        return tasa_compresion;
    }

    
    
}
