package Recuperatorio_2023;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private ArrayList<Nota> cursos_aprobados;

    


    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        cursos_aprobados = new ArrayList<Nota>();
    }

    public void addNotas(Nota nota){
        if(!cursos_aprobados.contains(nota)){
            cursos_aprobados.add(nota);
        }
    }

    public boolean Aprobo_curso(Elemento_Curso curso){
        for(int i =0; i< cursos_aprobados.size();i++){
            if(cursos_aprobados.get(i).getCurso().equals(curso)){
                return true;
        }
    }
    return false;
}


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", cursos_aprobados=" + cursos_aprobados + "]";
    }

    

}
