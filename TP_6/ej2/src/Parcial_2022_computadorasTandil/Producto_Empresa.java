package Parcial_2022_computadorasTandil;

import java.util.ArrayList;

public abstract class Producto_Empresa extends Elementos_Empresa {
    private String descripcion;
    private int antiguedad;
    private double valor;
    private String nombre;


    public Producto_Empresa(int id_codigo, String nombre, String descripcion, int antiguedad, double valor) {
        super(id_codigo);
        this.nombre=nombre;
        this.descripcion = descripcion;
        this.antiguedad = antiguedad;
        this.valor = valor;
    }

    

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public int getAntiguedad() {
        return antiguedad;
    }

    public String getDescripcion(){
        return descripcion;
    }


    public String getNombre() {
        return nombre;
    }

    public ArrayList<Producto_Empresa> buscar_productos(Condicion c){
        ArrayList<Producto_Empresa> salida = new ArrayList<Producto_Empresa>();
        if(c.cumple(this)){
            salida.add(this);
        }
        return salida;
    }  


    public void addElemento_a_Objeto_obsoleto(Objetos_obsoleto o){
        if(antiguedad >= o.getAntiguedad()){
            o.addElementos_obsoletos(this);
        }
    }


}
