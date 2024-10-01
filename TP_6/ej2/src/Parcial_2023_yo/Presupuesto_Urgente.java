package Parcial_2023_yo;

import java.util.ArrayList;

public class Presupuesto_Urgente extends Presupuesto_abs {
    private static double aumento=0.5;


    public Presupuesto_Urgente(String nombre) {
        super(nombre);
        //TODO Auto-generated constructor stub
    }


    @Override
    public int getEmpleados() {
      int suma =0;  
        for (Elemento_Abst elemento : listaElemento) {
            suma = suma + elemento.getEmpleados();
        }
        return suma;
    }


    @Override
    public int getTiempo_Estimando() {
        int mayor = -1;
        for(int i = 0; i< listaElemento.size();i++) { //puedo hacerlo un FOREACH
             int aux = listaElemento.get(i).getTiempo_Estimando();
            if(mayor < aux ) {
                mayor = aux;
            }
        }
        return mayor;
    }


    public double getCosto(){
        double suma = super.getCosto();
        return suma + suma * aumento;
    }

    @Override
    public ArrayList<String> getmateriales() {
		ArrayList<String> salida = new ArrayList<String>();
		for(int i = 0; i < listaElemento.size(); i++) {
			ArrayList<String> aux = listaElemento.get(i).getmateriales();
			salida.addAll(aux);
		}
		return salida;
    }


    @Override
    public Presupuesto_abs getCascaron() {
        // TODO Auto-generated method stub
        return new Presupuesto_Urgente(getNombre());
    }

   
     
}
