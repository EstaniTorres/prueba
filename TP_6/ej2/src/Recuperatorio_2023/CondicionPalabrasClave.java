package Recuperatorio_2023;

public class CondicionPalabrasClave {
    private int cantidad_palabras;

    public CondicionPalabrasClave(int cantidad_palabras) {
        this.cantidad_palabras = cantidad_palabras;
    }
    
    public boolean cumple(Elemento_Curso elemento){
     int suma=0;   
        for(int t = 0; t < elemento.getPalabras_Claves().size();t++){
            suma++;
        }
        return suma < cantidad_palabras;
    }
}
