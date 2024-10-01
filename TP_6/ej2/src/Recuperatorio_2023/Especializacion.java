package Recuperatorio_2023;

import java.util.ArrayList;

public class Especializacion extends Elemento_Curso {
    protected ArrayList<Elemento_Curso> lista_elementos;
    protected double precio_alumno;

    public Especializacion(String nombre) {
        super(nombre);
        lista_elementos = new ArrayList<Elemento_Curso>();
        precio_alumno=0;
    }

    public void addLista_Elementos(Elemento_Curso curso){
        if(!lista_elementos.contains(curso)){
            lista_elementos.add(curso);
        }
    }

    @Override
    public double getPrecio() {
      double suma =0;  
        for (Elemento_Curso elemento : lista_elementos) {
            suma = suma + elemento.getPrecio();
        }
        return suma;
    }

    public ArrayList<Elemento_Curso> getLista_elemento(){
        return lista_elementos;
    }


    @Override
    public ArrayList<String> getPalabras_Claves() {//union de las palabras claves de sus elementos sin  repeticion
        ArrayList<String> salida=new ArrayList<String>();
        for(int i=0; i<lista_elementos.size();i++){
            ArrayList<String> aux = lista_elementos.get(i).getPalabras_Claves();
                for(int t=0;t<aux.size();t++){
                    if(!salida.contains(aux.get(t))){
                        salida.add(aux.get(t));
                    }
                }
        }
        return salida;

    }


    public double precio_mayor(){
       double mayor = -1; 
        for(int i=0; i< lista_elementos.size();i++){
            double aux = lista_elementos.get(i).getPrecio();
            if(mayor < aux){
                mayor=aux;
            }
        }
       
       return mayor;
    }


    @Override
    public int getCantidad_Horas() {
      int suma =0;  
        for (Elemento_Curso elemento : lista_elementos) {
            suma = suma + elemento.getCantidad_Horas();
        }
        return suma;
    }
    
    

    public boolean getAlumno_Aprobo_curso(Alumno alumno){ 
        for(int i=0; i < lista_elementos.size();i++){
            if(!alumno.Aprobo_curso(this.getLista_elemento().get(i))){
                return false;
            }
        }
        return true;
    }
  
public double get_precio_alumno(Alumno alumno){
   double suma=0; 
    for(int i=0; i < lista_elementos.size();i++){
        if(alumno.Aprobo_curso(this.getLista_elemento().get(i))){
            suma = suma + getLista_elemento().get(i).getPrecio();
        }
    }
    return suma;
}

public ArrayList<Elemento_Curso> get_Lista(Condicion condicion){
    
    ArrayList<Elemento_Curso> aux = new ArrayList<Elemento_Curso>();
    for (Elemento_Curso elemento_Curso : lista_elementos) {
        if(condicion.cumple(elemento_Curso)){
            aux.add(elemento_Curso);
        }
    }
    return aux;
}




}
