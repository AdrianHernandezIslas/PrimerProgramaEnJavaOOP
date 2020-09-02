
public class MainInteracionObjeto
{
    public static void main(String []args){
        Caballo unCaballo = new Caballo("Veloz",'H',true,false,'G');
        Caballo otroCaballo = new Caballo("Chido",'H',true,false,'G');  
        System.out.println(unCaballo.aparearse(otroCaballo));
    }
}
