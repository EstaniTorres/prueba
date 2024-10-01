package Parcial_2022_computadorasTandil;

import java.util.ArrayList;

public abstract class Elementos_Empresa {
    
    private int id_codigo;

    public Elementos_Empresa(int id_codigo){
        this.id_codigo=id_codigo;
    }

    public int getID(){
        return id_codigo;
    }


    
    public abstract double getValor();
    public abstract int getAntiguedad();
    public abstract ArrayList<Producto_Empresa> buscar_productos(Condicion c);
    
    public boolean equals(Elementos_Empresa elemento){
        return id_codigo==elemento.getID();
    }

}
