package Parcial_2023_yo;

import java.util.ArrayList;

public class Presupuesto_Complejo extends Presupuesto_abs {
    private double desc = 0.1;

    public Presupuesto_Complejo(String nombre,double dec) {
        super(nombre);
        desc = dec;
    }

    public double getCosto(){
        double suma = super.getCosto();
        return suma - suma * desc;
    }


    @Override
    public int getEmpleados() {
        int mayor = -1;
        for(int i = 0; i< listaElemento.size();i++) { //puedo hacerlo un FOREACH
             int aux = listaElemento.get(i).getEmpleados();
            if(mayor < aux ) {
                mayor = aux;
            }
        }
        return mayor;
    }



    @Override
    public int getTiempo_Estimando() { //puedo hacerlo un FOREACH
        int suma=0;
        for (int i =0; i< listaElemento.size(); i++){
            suma = suma + listaElemento.get(i).getTiempo_Estimando();
        }
        return suma;
    }

    @Override
    public ArrayList<String> getmateriales() {//la lista que devuelve no puede tener repetidos
        ArrayList<String> salida = new ArrayList<>();
        for (int i =0; i<listaElemento.size();i++){
            ArrayList<String> aux = listaElemento.get(i).getmateriales();
            for(int t=0; t<aux.size();t++){
                if(!salida.contains(aux.get(t))){
                    salida.add(aux.get(t));
                }
            }
        }
        return salida;
    }

    @Override
    public Presupuesto_abs getCascaron() {
        // TODO Auto-generated method stub
        return new Presupuesto_Complejo(getNombre(), desc);
    }


    


}
