
public class Perro
{
    private String nombre;
    private int edad;
    private boolean estaVivo;
    private char sexo;
    
    public Perro(String nombre,int edad, boolean estaVivo, char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.estaVivo = estaVivo;
        this.sexo = sexo;
    }

    public String obtenerNombre(){
        return nombre;
    }
}
