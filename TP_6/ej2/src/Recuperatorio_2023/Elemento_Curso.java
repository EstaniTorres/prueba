package Recuperatorio_2023;

import java.util.ArrayList;

public abstract class Elemento_Curso {

protected String nombre;

    public Elemento_Curso(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

   public abstract double getPrecio();
   public abstract ArrayList<String> getPalabras_Claves();
   public abstract int getCantidad_Horas();
   public abstract boolean getAlumno_Aprobo_curso(Alumno alumno);
   public abstract double get_precio_alumno(Alumno alumno);
   public abstract ArrayList<Elemento_Curso> get_Lista(Condicion condicion);
}
