package Parcial_4nov2022;

import java.util.ArrayList;

public class Combo extends Envio {
    private ArrayList<Envio> elementos;
    private Filtro f;

    public Combo(int nro_tracking) {
        super(nro_tracking);
        this.elementos = new ArrayList<Envio>(); 
    }



    public void addElementos(Envio envio){
        if(f.cumple(envio)){
            elementos.add(envio);
            envio.setNro_tracking(getNro_tracking());
        }
    }


    
    @Override
    public double getPeso() {
        double suma =0;
        for(int i =0; i<elementos.size();i++){
            suma = suma + elementos.get(i).getPeso();
        }
       return suma; 
    }


    @Override
    public Persona getRemitente() {
        if(!elementos.isEmpty()){
            return elementos.get(0).getRemitente();
        }else{return null; }
    }

    @Override
    public Persona getDestinatario() {
        if(!elementos.isEmpty()){
            return elementos.get(0).getDestinatario();
        }else{
            return null;
        }
    }



    @Override
    public ArrayList<Carta> buscar(Filtro f) {
        ArrayList<Carta> salida = new ArrayList<Carta>();
        for (Envio carta : elementos) {
            salida.addAll(carta.buscar(f));
        }
        return salida;
    }

    

    
}
