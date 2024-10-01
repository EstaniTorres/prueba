package Recuperatorio_2023;

public class Especializacion_optativa  extends Especializacion{

    public Especializacion_optativa(String nombre) {
        super(nombre);
    }

    @Override
    public boolean getAlumno_Aprobo_curso(Alumno alumno) {
        int cont =0;
        for(int i=0; i < lista_elementos.size();i++){
            if(alumno.Aprobo_curso(this.getLista_elemento().get(i))){
                cont++;
            }
        }
        if (cont > (lista_elementos.size()/2)){
            return true;
        }else{return false;}
        
    }

}
