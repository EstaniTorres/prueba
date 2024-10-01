package Recuperatorio_2022;

import java.util.ArrayList;

public abstract class AUTOPARTE {
    private String marca;

    public AUTOPARTE(String marca){
        this.marca=marca;
    }

    public String getMarca() {
        return marca;
    }

    public abstract double getPeso();
    public abstract double getHuellas();
    public abstract ArrayList<String> getMateriales();
    public abstract double getCosto();
    public abstract ArrayList<Autoparte_Basica> buscar(Condicion c);


}
