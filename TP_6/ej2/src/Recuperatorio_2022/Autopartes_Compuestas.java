package Recuperatorio_2022;

import java.util.ArrayList;

public class Autopartes_Compuestas extends AUTOPARTE {
    private ArrayList<AUTOPARTE> autopartes_utilizadas;
    private Condicion condicion;


    
    public Autopartes_Compuestas(String marca) {
        super(marca);
        autopartes_utilizadas=new ArrayList<AUTOPARTE>();
    }


    public void addAutopartes_utilizadas(AUTOPARTE autoparte){
        Condicion condicion1 = new CondicionHuella(getHuellas());
        Condicion condicion2 = new CondicionMarca("Contaminador");
        condicion = new CondicionAND(condicion1, condicion2);
        if(condicion.cumple(autoparte)){
            autopartes_utilizadas.add(autoparte);
        }
    }



    @Override
    public double getPeso() {//peso que es la suma de los pesos de las autopartes que la componen
        double suma =0;
        for (AUTOPARTE autoparte : autopartes_utilizadas) {
            suma = suma + autoparte.getPeso();
        }
        return suma; 
    }



    @Override
    public double getHuellas() {

        double mayor1=-1;
        double mayor2=-1;
       for (AUTOPARTE autoparte : autopartes_utilizadas) {
            if (autoparte.getHuellas() > mayor1) {
                mayor2 = mayor1;
                mayor1 = autoparte.getHuellas();
            } else if (autoparte.getHuellas() > mayor2) {
                mayor2 = autoparte.getHuellas();
            }
       }
       return mayor1+mayor2;
    }


    @Override
    public ArrayList<String> getMateriales(){
		ArrayList<String> salida = new ArrayList<String>();
		for(int i = 0; i < autopartes_utilizadas.size(); i++) {
			ArrayList<String> aux = autopartes_utilizadas.get(i).getMateriales();
			for(int j = 0; j<aux.size(); j++) {
		        if(! salida.contains(aux.get(j)))
		        	salida.add(aux.get(j));
		    }
		}
		return salida;
	}



    public double getCosto() {
       double suma =0; 
        for (AUTOPARTE autoparte : autopartes_utilizadas) {
            suma = suma + autoparte.getCosto();
        }
        return suma;
    }


    @Override
    public ArrayList<Autoparte_Basica> buscar(Condicion c) {
        ArrayList<Autoparte_Basica> salida = new ArrayList<Autoparte_Basica>(); 
        for (AUTOPARTE autoparte : autopartes_utilizadas) {
                salida.addAll(autoparte.buscar(c));
        }
        return salida;
    }


    
    
    
}
