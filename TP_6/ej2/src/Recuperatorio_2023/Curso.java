package Recuperatorio_2023;

import java.util.ArrayList;

public class Curso extends Elemento_Curso {
    private double precio;
    private double nota_minima;
    private int cantidad_Horas;
    protected ArrayList<String> palabras_claves;
    

    public Curso(String nombre, double precio, double nota_minima, int cantidad_Horas) {
        super(nombre);
        this.precio = precio;
        this.nota_minima = nota_minima;
        this.cantidad_Horas = cantidad_Horas;
        palabras_claves = new ArrayList<String>();
    }


    public void addPalabras_Claves(String palabra){
        if(!palabras_claves.contains(palabra.toUpperCase())){
            palabras_claves.add(palabra.toUpperCase());
        }
    }


    
    public double getNota_minima() {
        return nota_minima;
    }


    @Override
    public double getPrecio() {
        return precio;
    }


    @Override
    public ArrayList<String> getPalabras_Claves() {
        ArrayList<String> aux = new ArrayList<String>();
        aux.addAll(palabras_claves);
        return aux;
    }


    @Override
    public int getCantidad_Horas() {
       return cantidad_Horas;
    }



    
    public boolean equals(Curso curso){
        return this.nombre.equals(curso.getNombre());


    }


    public boolean getAlumno_Aprobo_curso(Alumno alumno){
        if(alumno.Aprobo_curso(this)){
            return true;
        }
        return false;
    }


    public double get_precio_alumno(Alumno alumno){
        double suma=0;
        if(!alumno.Aprobo_curso(this)){
            suma = suma + this.getPrecio();
        }
        return suma;
     }


     public ArrayList<Elemento_Curso> get_Lista(Condicion condicion){
        ArrayList<Elemento_Curso> salida = new ArrayList<Elemento_Curso>();
        if(condicion.cumple(this)){
            salida.add(this);
        }
        return salida;
    }

    @Override
    public String toString() {
        return "Curso=" + this.nombre+" [precio=" + precio + ", nota_minima=" + nota_minima + ", cantidad_Horas=" + cantidad_Horas
                + ", palabras_claves=" + palabras_claves + "]";
    }

    
}
