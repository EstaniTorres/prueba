package Parcial_4nov2022;

import java.util.ArrayList;

public class Carta extends Envio {
    private Persona destinatario;
    private Persona remitente;
    private double peso;
    private boolean retiro_sucursal;

    
    public Carta(int nro_tracking, Persona destinatario, Persona remitente, double peso, boolean retiro_sucursal) {
        super(nro_tracking);
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.peso = peso;
        this.retiro_sucursal = retiro_sucursal;
    }


    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public Persona getRemitente() {
     return remitente;
    }

    @Override
    public Persona getDestinatario() {
        return destinatario;
    }


    @Override
    public ArrayList<Carta> buscar(Filtro f) {
        ArrayList<Carta> salida = new ArrayList<Carta>();
        if(f.cumple(this)){
            salida.add(this);
        }
        return salida;
    }

    

    
}
