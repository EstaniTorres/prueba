package Parcial_2023_yo;

import java.util.ArrayList;

public abstract class Presupuesto_abs extends Elemento_Abst {

    protected ArrayList<Elemento_Abst> listaElemento;



    public Presupuesto_abs(String nombre) {
        super(nombre);
        listaElemento=new ArrayList<Elemento_Abst>();
    }


    @Override
    public abstract int getEmpleados();



    @Override
    public abstract int getTiempo_Estimando();


    public void addListaelemento(Elemento_Abst elemento){
            listaElemento.add(elemento);
    }


    @Override
    public  double getCosto(){
      double suma=0;  
        for (Elemento_Abst elemento : listaElemento) {
            suma = suma + elemento.getCosto();
        }
        return suma;
    }


    @Override
    public abstract ArrayList<String> getmateriales();

    public abstract Presupuesto_abs getCascaron();

    public Elemento_Abst getCopia(Condicion c) {
        Presupuesto_abs aux = this.getCascaron();
        boolean agrego = false;
        for(int i = 0; i< listaElemento.size(); i++) {
            Elemento_Abst copia = listaElemento.get(i).getCopia(c);
            if (copia != null) {
              aux.addListaelemento(copia);
              agrego = true;
            }  
        }
        if (agrego)
         return aux;
        else {
            return null;
        }
    }


    public ArrayList<Tareas_basicas> buscar(Condicion c){
        ArrayList<Tareas_basicas> salida = new ArrayList<Tareas_basicas>();
        for(int i = 0; i<listaElemento.size(); i++) {
             salida.addAll(listaElemento.get(i).buscar(c));
        }
        return salida;
    }


}
