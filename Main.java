

public class Main
{
 public static void main(String[] args){
    //tipoDato nombreVarible = new tipoDato();
    Persona personaA = new Persona("Adrian",'M',1996,false);
    Persona personaB = new Persona("Biaani",'F',2002,true);
    Persona personaC = new Persona("Mariana",'F',2000,true);
    
    //Sentencia de impresion en consola 
    //System.out.println("El nombre de personaA es "+personaA.obtenerNombre());
    //System.out.println("El genero de personaA es "+personaA.obtenerGenero());
    //System.out.println("El anio de personaA es "+personaA.obtenerAnioNacimiento());
    
                        
    System.out.println("La edad de "+personaB.obtenerNombre()+ " es "+
                        personaB.decirEdad()+ " anio(s) "+"con genero "+personaB.obtenerGenero()+" "+
                        personaB.decirSiEstaVivo());
    personaB.morir();
    
    System.out.println("La edad de "+personaB.obtenerNombre()+ " es "+
                        personaB.decirEdad()+ " anio(s) "+"con genero "+personaB.obtenerGenero()+" "+
                        personaB.decirSiEstaVivo());
                        
    personaB.revivi();
    
    System.out.println("La edad de "+personaB.obtenerNombre()+ " es "+
                        personaB.decirEdad()+ " anio(s) "+"con genero "+personaB.obtenerGenero()+" "+
                        personaB.decirSiEstaVivo());
  }   
}
