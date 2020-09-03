
public class Pajaro
{
    private String nombre;
    private String color;
    private int edad;
    
    public Pajaro(String nombre, String color, int edad){
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public String comer(){
       String mensaje = "";
       if(edad < 1){
        mensaje = "esta siendo alimentado por su madre"; 
       }else{
           mensaje = "esta comiendo una alpiste";
       }
       return mensaje;
    }
    
    public String domir(){
        String mensaje = "";
        if(edad < 1){
        mensaje = "esta durmiendo con su madre"; 
       }else{
           mensaje = "esta durmiendo solo solin solito";
       }
        return mensaje;
    }
    
    public String volar(){
         String mensaje = "";
        if(edad < 1){
            mensaje = "ta chiquito todavia no vuela"; 
       }else{
            mensaje = "esta volando por los aires";
       }
        return mensaje;
    }
    
    public void cambiarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public String getNombre(){
        return nombre;
    }
}
