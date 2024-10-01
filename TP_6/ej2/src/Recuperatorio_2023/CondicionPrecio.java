package Recuperatorio_2023;

public class CondicionPrecio extends Condicion {
    private double precio_buscar;

    

    public CondicionPrecio(double precio_buscar) {
        this.precio_buscar = precio_buscar;
    }

    public boolean cumple(Elemento_Curso e){
        return e.getPrecio()<precio_buscar;
    }
    
}
