/**
 * Nombre: Adrian Hernandez Islas
 * Grupo: ISC-F-SP
 * Tema: Pseudocodigo
*/

//Declaracion de la clase Perro
public class Perro
{//Llave que indica el inicio de la clase
    private String nombre;//Definicion del atributo nombre como tipo String
    private int edad;//Definicion del atributo edad como tipo entero
    private boolean estaVivo;
    private char sexo;
    
    //Defincion del contructor para la clase Perro con parametros(String,entero,booleano,caracter)
    public Perro(String nombre,int edad, boolean estaVivo, char sexo)
    {//Llave que indica el inicio del cuerpo del constructor
        this.nombre = nombre;//Asignacion de valor al atributo nombre 
        this.edad = edad;
        this.estaVivo = estaVivo;
        this.sexo = sexo;
    }//Lavve.....

    //Definicion de metodo con retorno de valor de tipo String retornando la variable nombre
    public String obtenerNombre(){
        return nombre;
    }
   
    
    //Definicion de metodo sin retorno de valor que altera(cambia) el valor de la variable nombre
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
}//Llave que indica el cierre de la clase
