
public class Caballo
{
    private String nombre;
    private char sexo;
    private boolean estaVivo;
    private boolean esSangrePura;
    private char tamanio;
    private boolean estaMontado;

    public Caballo(String nombre,char sexo, boolean estaVivo, boolean esSangrePura, char tamanio)
    {
        this.nombre = nombre;
        this.sexo = sexo;
        this.estaVivo = estaVivo;
        this.esSangrePura = esSangrePura;
        this.tamanio = tamanio;
        this.estaMontado = false;
    }

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    } 

    public char getSexo(){
        return sexo;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public boolean getEstaVivo(){
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo){
        this.estaVivo = estaVivo;
    }
    
    public boolean getEstaMontado(){
        return estaMontado;
    }
    
    public void setEstaMontado(boolean variable){
        estaMontado = variable;
    }

    public String aparearse(Caballo otroCaballo){
        String mensaje = "";
        
        if(this.getSexo() == otroCaballo.getSexo()){
                mensaje = this.getNombre() + " se esta peleando con "+otroCaballo.getNombre();
        }else{
                 mensaje = this.getNombre() + " esta haciendo cositas con "+otroCaballo.getNombre();
        }
        
        
        return mensaje;
    }
}
