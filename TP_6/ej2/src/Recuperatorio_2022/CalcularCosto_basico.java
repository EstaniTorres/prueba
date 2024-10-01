package Recuperatorio_2022;

public class CalcularCosto_basico implements CalcularCosto { //Tambien funciona para autopartes complejas
    private String palabra;
    private double aumento;

    public CalcularCosto_basico(String palabra){
        this.palabra=palabra;
        aumento=0;
    }

    
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    @Override
    public double Calcular_costo(Autoparte_Basica basico){
        return basico.getPrecio_fijo() + (basico.getPeso() * aumento);
    }




}
