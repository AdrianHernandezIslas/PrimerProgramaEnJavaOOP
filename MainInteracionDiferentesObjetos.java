
public class MainInteracionDiferentesObjetos
{
   public static void main(String args[]){
        Persona personaA = new Persona("Adrian",'M',1996,false);
        Persona personaB = new Persona("Biaani",'F',2002,true);
        Persona personaC = new Persona("Mariana",'F',2000,true);
        
        Caballo unCaballo = new Caballo("Veloz",'H',false,false,'G');
        Caballo otroCaballo = new Caballo("Chido",'H',true,false,'G');
        
        System.out.println(personaA.montar(unCaballo));
        System.out.println(personaB.montar(otroCaballo));
        System.out.println(personaC.montar(otroCaballo));
   }
}
