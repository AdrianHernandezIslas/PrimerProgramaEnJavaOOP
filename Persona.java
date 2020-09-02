
public class Persona
{
    private String nombre;
    private char genero;
    private int anioNacimiento;
    private boolean estaVivo;
    //private int miID;
    //private static int identificador = 1;
    
    //              "Adrian",       'M',         24
    public Persona(String miNombre,char miGenero, int miAnioNacimiento,boolean miEstaVivo)
    {
        nombre = miNombre;
        genero = miGenero;
        anioNacimiento = miAnioNacimiento;
        estaVivo = miEstaVivo;
        //miID = identificador;
        //identificador = identificador + 1;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerGenero(){
        String generoCompleto = "";
        
        if(genero == 'M'){
            generoCompleto = "Masculino";
        }else{
            generoCompleto = "Femenino";
        }
        
        return generoCompleto;
    }
    
    public String decirSiEstaVivo(){
        String mensaje = "";
        if(estaVivo){
            mensaje = "Ta vivit@";
        }else{
            mensaje = "Esta morid@";
        }
        return mensaje;
    }
    
    public int obtenerAnioNacimiento(){
        return anioNacimiento;
    }
    
    public boolean obtenerEstaVivo(){
        return estaVivo;
    }
    
    public void morir(){
        estaVivo = false;
    }
    
    public void revivi(){
        estaVivo = true;
    }
    
    public int decirEdad(){
        return 2020 - anioNacimiento;
    }
    
    public String montar(Caballo unCaballo){
        String mensaje = "";
        if(!unCaballo.getEstaMontado()){
            if(unCaballo.getEstaVivo()){
                mensaje = this.nombre + " esta montando a "+unCaballo.getNombre();
                unCaballo.setEstaMontado(true);
            }else{
                mensaje = this.nombre + " no te pases de lanza el caballo ta morido";
            }
        }else{
            mensaje = "No puedes usar el caballo "+unCaballo.getNombre();
        }
        
        return mensaje;
    }  
}
