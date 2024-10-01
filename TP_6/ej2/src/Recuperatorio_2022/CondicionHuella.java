package Recuperatorio_2022;

public class CondicionHuella implements Condicion {
    private double huella;
    

    public CondicionHuella(double huella) {
        this.huella = huella;
    }


    @Override
    public boolean cumple(AUTOPARTE autoparte) {
        return autoparte.getHuellas() < huella;
    }
    

}
