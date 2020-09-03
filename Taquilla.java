

public class Taquilla
{
    private String nombre;
    
    public Taquilla(String nombre)
    {
      this.nombre= nombre; 
    }

    public double obtenerCostoDelBoleto(Pasajero pasajero,double cantidadKm){
        double costoBoleto = 150;
        if(cantidadKm > 10){
            costoBoleto = ((cantidadKm - 10) * 12.5) + costoBoleto;
        }
        
        return costoBoleto;
    } 
}
