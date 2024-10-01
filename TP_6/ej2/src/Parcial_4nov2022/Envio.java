package Parcial_4nov2022;

import java.util.ArrayList;

public abstract class Envio {
    private int nro_tracking;

    public Envio(int nro_tracking) {
        this.nro_tracking = nro_tracking;
    }

    

    public abstract double getPeso();
    public abstract Persona getRemitente();
    public abstract Persona getDestinatario();
    public abstract ArrayList<Carta> buscar(Filtro f);



    public int getNro_tracking() {
        return nro_tracking;
    }



    public void setNro_tracking(int nro_tracking) {
        this.nro_tracking = nro_tracking;
    }


        
}
