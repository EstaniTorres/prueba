package Parcial_2023_yo;

public class main {
    public static void main(String[] args) {

        Tareas_basicas t1 = new Tareas_basicas("tota", 0, 1, 3);
        Tareas_basicas t2 = new Tareas_basicas("POO", 100,3, 300);
        CondicionEmpleado con1 = new CondicionEmpleado(2); 
        t1.addMateriales("mano");
        t2.addMateriales("compu");
        t2.addMateriales("idle");

        Presupuesto_Urgente p1 = new Presupuesto_Urgente("nose");
        p1.addListaelemento(t1);
        p1.addListaelemento(t2);

        
        System.out.println(p1.buscar(con1));
    }
}
