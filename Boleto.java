

public class Boleto
{
    private String origen;
    private String destino;
    private double precio;
    private String nombrePasajero;
    
    public Boleto(String origen, String destino, double precio,String nombrePasajero)
    {
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
        this.nombrePasajero = nombrePasajero;
    }
    
    public double getPrecio(){
        return precio;
    }
}
