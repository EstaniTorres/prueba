package Parcial_2023_yo;

public class CondicionEmpleado extends Condicion {
    private int empleados;

    public CondicionEmpleado(int empleados){
        this.empleados=empleados;
    }

    @Override
    public boolean cumple(Elemento_Abst e) {
        return (e.getEmpleados() < empleados);
    }
    
}
