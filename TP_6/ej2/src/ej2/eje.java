package ej2;

public class eje {
    public static void main(String[] args) {
        Sistema sistema =new Sistema("stim");
        Archivo arch = new Archivo("hola", 10, 20, 40);
        Archivo arch2 = new Archivo("hola", 10, 20, 40);
        Archivo arch3 = new Archivo("hola", 10, 20, 90);

        Link l = new Link("LINK", 10);
        Link l2 = new Link("LINK", 10);
        
        
        Directorio dir = new Directorio("pepe", 20);
        Directorio dir2 = new Directorio("pepito", 22);

        dir.addElementos(arch);
        dir.addElementos(arch2);
        dir.addElementos(l);
        dir.addElementos(arch3);
        dir.addElementos(dir2);

        dir2.addElementos(l2);
        //dir.addElementos(dir2);

        sistema.addElementos_sistema(dir);
        sistema.addElementos_sistema(dir2);

        //System.out.println("el tamaño del archivo "+ arch.getTamaño());
        System.out.println("tamaño del directorio "+ sistema.getTamaño(dir2));
        
        //System.out.println(sistema.getCantidad_elementos(dir));
        //System.out.println(sistema.get_tamañoDirectorio(dir));
    }
}
