package Parcial_2022_computadorasTandil;

import java.util.ArrayList;

public class Combos_armados extends Elementos_Empresa{

    private ArrayList<Elementos_Empresa> elementos_combo;
    private String nombre;

    public Combos_armados(int id_codigo,String nombre){
        super(id_codigo);
        this.nombre=nombre;
        elementos_combo = new ArrayList<Elementos_Empresa>();
    }

    public void addElementos_combo(Elementos_Empresa elemento){
        if(!elementos_combo.contains(elemento)){
            elementos_combo.add(elemento);
        }
    }

    public ArrayList<Elementos_Empresa> getElementos_combo(){
        ArrayList<Elementos_Empresa> salida = new ArrayList<Elementos_Empresa>();
        salida.addAll(elementos_combo);
        return salida;
    }


    @Override
    public double getValor() {
        double suma = 0;
        for (Elementos_Empresa elemento : elementos_combo) {
            suma++;
        }
        return suma;
    }

    @Override
    public int getAntiguedad() {
        int mayor =-1;
        for(int i=0;i<elementos_combo.size();i++){
            int aux = elementos_combo.get(i).getAntiguedad();
                if(mayor < aux){
                    mayor=aux;
                }
        }
        return mayor;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public ArrayList<Producto_Empresa> buscar_productos(Condicion c) {
        ArrayList<Producto_Empresa> salida =new ArrayList<Producto_Empresa>();
        for (Elementos_Empresa elemento : elementos_combo){ 
            salida.addAll(elemento.buscar_productos(c));
        } 
            return salida;
 
    }
    
}
