package Parcial_2022_computadorasTandil;

public class CondicionDescripcion implements Condicion {
private String palabra;
    

    public CondicionDescripcion(String palabra) {
    this.palabra = palabra;
}


    @Override
    public boolean cumple(Producto_Empresa e) {
        return e.getDescripcion().contains(palabra);
    }

}
