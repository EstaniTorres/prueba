package Recuperatorio_2023;

public class CondicionHoras extends Condicion {
    private int horas;

    public CondicionHoras(int horas) {
        this.horas = horas;
    }
    
    public boolean cumple(Elemento_Curso elemento){
        return elemento.getCantidad_Horas() >= horas;
    }

}
