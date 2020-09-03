
/**
 * Un empresa de trenes de trasporte necesita un programa 
 * para determinar el costo de un boleto de un pasaje teniendo 
 * en cuenta que el costo de 0 a 10 kilometros es de 150 pesos
 * a partir del kilometro 11  en adelante son cobrados 12.5 pesos 
 * por kilometro extra
 * Elabore un programa que resuelva el problema planteado
 */
public class Pasajero
{
    private String nombre;
    
    public Pasajero(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
}
