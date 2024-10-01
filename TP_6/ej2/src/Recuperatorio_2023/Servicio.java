package Recuperatorio_2023;

import java.util.ArrayList;

public class Servicio {
    private Condicion c;

    private String nombre;

    public Servicio(String nombre) {
        this.nombre = nombre;
    }

    public void setCondicion(Condicion condicion){
        c=condicion;
    }
     
    public double calcular_precio(Elemento_Curso elemento){
        return elemento.getPrecio();
    }

    public double precio_mayor_especialidad(Especializacion elemento){
        return elemento.precio_mayor();
    }

    public double calcular_precio_alumno(Elemento_Curso elemento_Curso,Alumno alumno){
        return elemento_Curso.get_precio_alumno(alumno);
    }

    public ArrayList<Elemento_Curso> get_Lista(Elemento_Curso curso){
        return curso.get_Lista(c);
    }

}
