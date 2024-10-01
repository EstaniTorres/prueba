package Recuperatorio_2022;

public class CondicionMarca implements Condicion {
    private String marca;

    public CondicionMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean cumple(AUTOPARTE autoparte) {
        return marca.equals(autoparte.getMarca());
    }

    
}
