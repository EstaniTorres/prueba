package Recuperatorio_2023;

import java.time.LocalDate;

public class Nota {
    private Curso curso;
    private LocalDate fecha_finalizado;
    private double nota;
    
    public Nota(Curso curso, LocalDate fecha_finalizado, double nota) {
        this.curso = curso;
        this.fecha_finalizado = fecha_finalizado;
        this.nota = nota;
    }

    public Curso getCurso() {
        return curso;
    }

    public LocalDate getFecha_finalizado() {
        return fecha_finalizado;
    }

    public double getNota() {
        return nota;
    }

    public boolean equals(Nota n){
        return curso.equals(n.getCurso());
    }

    @Override
    public String toString() {
        return "Nota [nombre_curso=" + curso + ", fecha_finalizado=" + fecha_finalizado + ", nota=" + nota + "]";
    }

    
}
