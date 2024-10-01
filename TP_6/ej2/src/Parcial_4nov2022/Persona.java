package Parcial_4nov2022;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private Direccion direccion;

    
    public Persona(int dni, String nombre, String apellido, Direccion direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }


    public int getDni() {
        return dni;
    }


    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public Direccion getDireccion() {
        return direccion;
    }

    


}
