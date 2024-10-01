package Recuperatorio_2022;

public class Autoparte_Compleja  extends Autoparte_Basica{




    public Autoparte_Compleja(String marca, double peso, double huella_carbono_produccion, int precio_fijo) {
        super(marca, peso, huella_carbono_produccion, precio_fijo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getHuellas() {
        // TODO Auto-generated method stub
        return super.getHuellas()+(this.peso / materiales_utilizados.size());
    }

    
    

}
