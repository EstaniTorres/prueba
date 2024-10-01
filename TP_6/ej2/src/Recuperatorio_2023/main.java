package Recuperatorio_2023;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
    Especializacion espe = new Especializacion("POO");
        Curso curso = new Curso("java", 2000, 4, 40);
        Curso curso2 = new Curso("algebra", 10000, 4, 45);
        Curso curso3 = new Curso("matematica", 1000, 4, 55);
       
        espe.addLista_Elementos(curso);
        espe.addLista_Elementos(curso2);
        espe.addLista_Elementos(curso3);
        


        
        Nota nota = new Nota(curso, LocalDate.of(2023, 5, 20), 9);
        Nota nota2 = new Nota(curso2, LocalDate.of(2023, 5, 20), 9);
        Nota nota3 = new Nota(curso3, LocalDate.of(2023, 5, 20), 9);
        
        Alumno alumno = new Alumno("juan", "pedro");

        alumno.addNotas(nota);
        alumno.addNotas(nota2);
        alumno.addNotas(nota3);
        
        
        Servicio ser = new Servicio("xd");
        CondicionPrecio cond = new CondicionPrecio(4000);
        ser.setCondicion(cond);


        System.out.println(espe.getAlumno_Aprobo_curso(alumno));
        //System.out.println(espe.getLista_elemento());

        
    }
}
