package Parcial_2022_computadorasTandil;

import java.util.ArrayList;

public class Sistema {
    private String nombre;
    private ArrayList<Elementos_Empresa> elementos_sistema;

    
    public Sistema(String nombre) {
        this.nombre = nombre;
        elementos_sistema = new ArrayList<Elementos_Empresa>();
    }

    
    public ArrayList<Elementos_Empresa> get_Lista_Deseados(Condicion condicion){
        return null;
    }


    public String getNombre() {
        return nombre;
    }


    public void addElementos_combo(Elementos_Empresa elemento){
        if(!elementos_sistema.contains(elemento)){
            elementos_sistema.add(elemento);
        }
    }

    public ArrayList<Elementos_Empresa> getElementos_combo(){
        ArrayList<Elementos_Empresa> salida = new ArrayList<Elementos_Empresa>();
        salida.addAll(elementos_sistema);
        return salida;
    }

}
