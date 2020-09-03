
public class MainParaPajaro
{
    public static void main(String args[]){
        Pajaro pajaroA = new Pajaro("Loco","Rojo",2);
        Pajaro pajaroB = new Pajaro("Piolin","Amarillo",0);
        
        System.out.println(pajaroA.getNombre()+" "+pajaroA.comer());
        System.out.println(pajaroB.getNombre()+" "+pajaroB.comer());
        
        System.out.println(pajaroA.getNombre()+" "+pajaroA.domir());
        System.out.println(pajaroB.getNombre()+" "+pajaroB.domir());
        
        pajaroA.cambiarNombre("Bonito");
 
        System.out.println(pajaroA.getNombre()+" "+pajaroA.volar());
        System.out.println(pajaroB.getNombre()+" "+pajaroB.volar());
        
    }
}
