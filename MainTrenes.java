

public class MainTrenes
{
    public static void main(String args[]){
        Taquilla taquilla = new Taquilla("Taquilla A");
        Pasajero pasajero = new Pasajero("Adrian");
        
        double costoBoleto = taquilla.obtenerCostoDelBoleto(pasajero,12);
        
        Boleto boleto = new Boleto("Mexico","Puebla",costoBoleto,pasajero.getNombre());
        
        System.out.println("El precio del boleto es: "+boleto.getPrecio());
    }
}
