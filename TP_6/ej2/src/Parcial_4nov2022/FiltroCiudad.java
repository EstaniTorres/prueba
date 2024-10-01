package Parcial_4nov2022;

public class FiltroCiudad implements Filtro {
    private String ciudad;
    

    public FiltroCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    @Override
    public boolean cumple(Envio envio) {
        return envio.getDestinatario().getDireccion().getCiudad().equals(ciudad);
    }
    
    
}
