
public class Persona
{
    private String nombre;
    private char genero;
    private int anioNacimiento;
    private boolean estaVivo;
    
    //              "Adrian",       'M',         24
    public Persona(String miNombre,char miGenero, int miAnioNacimiento,boolean miEstaVivo)
    {
        nombre = miNombre;
        genero = miGenero;
        anioNacimiento = miAnioNacimiento;
        estaVivo = miEstaVivo;
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
    
    public int decirEdad(){
        return 2020 - anioNacimiento;
    }
}
