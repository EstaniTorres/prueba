package Recuperatorio_2022;

import java.util.ArrayList;

public class Autoparte_Basica extends AUTOPARTE {
    protected double precio_fijo;
    protected double peso;
    protected double huella_carbono_produccion;
    protected ArrayList<String> materiales_utilizados;

    
    public Autoparte_Basica(String marca, double peso, double huella_carbono_produccion,int precio_fijo) {
        super(marca);
        this.peso = peso;
        this.huella_carbono_produccion = huella_carbono_produccion;
        materiales_utilizados = new ArrayList<String>();
        this.precio_fijo = precio_fijo;
    }

    public double getPrecio_fijo(){
        return precio_fijo;
    }

    @Override
    public double getPeso() {
        return peso;
    }
    @Override
    public double getHuellas() {
        return huella_carbono_produccion;
    }


    public void addMateriales_utilizados(String material){
        if(!materiales_utilizados.contains(material)){
            materiales_utilizados.add(material);
        }
    }


    @Override
    public ArrayList<String> getMateriales() {
        ArrayList<String> salida = new ArrayList<String>();
        salida.addAll(materiales_utilizados);
        return salida;
    }

    @Override
    public double getCosto() {
        CalcularCosto_basico c = new CalcularCosto_basico("plastico");
        return c.Calcular_costo(this);
    }

    @Override
    public ArrayList<Autoparte_Basica> buscar(Condicion condicion) {
        ArrayList<Autoparte_Basica> salida = new ArrayList<Autoparte_Basica>();
        if(condicion.cumple(this)){
            salida.add(this);
        }
        return salida;
    }



    
    
}
