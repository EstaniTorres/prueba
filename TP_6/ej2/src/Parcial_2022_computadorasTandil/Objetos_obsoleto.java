package Parcial_2022_computadorasTandil;

import java.util.ArrayList;

public class Objetos_obsoleto extends Elementos_Empresa {
 private int tiempo_util;
 private ArrayList<Elementos_Empresa> elementos_obsoletos;
 private double descuento = 0.02;
 
    public Objetos_obsoleto(int id_codigo,int tiempo_util) {
        super(id_codigo);
        this.tiempo_util=tiempo_util;
        elementos_obsoletos = new ArrayList<Elementos_Empresa>();
    }

    

    public void addElementos_obsoletos(Elementos_Empresa e){
        if(!elementos_obsoletos.contains(e)){
            elementos_obsoletos.add(e);
        }
    }


    public ArrayList<Elementos_Empresa> getLista_elementos_obsoletos(){
        ArrayList<Elementos_Empresa> salida = new ArrayList<Elementos_Empresa>();
        salida.addAll(elementos_obsoletos);
        return salida;
    }


    public double getDescuento() {
        return descuento;
    }




    public Elementos_Empresa buscar_elemento(int id_codigo){ //BUSCA EL ELEMENTO DE LA LISTA ELEMENTOS_OBSOLETOS
       Elementos_Empresa aux = null; 
        for (Elementos_Empresa elementos_Empresa : elementos_obsoletos) {
                if(elementos_Empresa.getID() == id_codigo){
                    aux = elementos_Empresa;
                }
        }
       return aux; 
    }

    public double getValor_elemento_obsoleto(Elementos_Empresa obsoleto){//DEVUELVE EL VALOR DEL ELEMENTO BUSCADO   
        double suma =0;
        double desc =0;

        suma = obsoleto.getValor();
        desc = (obsoleto.getAntiguedad() - tiempo_util)*descuento;
        return (suma + desc);
    }




    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }



    @Override
    public double getValor() {   //DEVUELVE EL VALOR DE  TODA LA CLASE
    double suma=0;    
        for(int i=0; i<elementos_obsoletos.size();i++){
            suma = suma + getValor_elemento_obsoleto(elementos_obsoletos.get(i));
        }
        return suma;
    }



    @Override
    public int getAntiguedad() {
        return tiempo_util;
    }



    @Override
    public ArrayList<Producto_Empresa> buscar_productos(Condicion c) {
        ArrayList<Producto_Empresa> salida = new ArrayList<Producto_Empresa>();
        for (Elementos_Empresa elemento : elementos_obsoletos) {
             salida.addAll(elemento.buscar_productos(c));  
        }
        return salida;
    }   

    

}
