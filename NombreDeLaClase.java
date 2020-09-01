/*
 Esta es la estructura de una clase en Java
 para los alumnos del grupo ISC-F
 */

//Este es un comentario de una sola linea

/**
 * Modificadores de Alcance
 * publico - public
 * privado - private
 * protegido - protected
*/
public class NombreDeLaClase{
    //Declaracion de atributos
    //modificadorDeAlcance tipoDeDato nombreVariable;
    //modificadorDeAlcance tipoDeDato nombreVariable = valorAAsignar;
    private short numeroPequenio;
    private int numero;
    private long numeroGrande;
    private boolean estaVivo;
    private char letra;
    private float estatura;
    private double kilometros;
    
    //Metodo costructor
    public NombreDeLaClase(){
    }
    
    //Metodos con retorno de valor
    //modificadorAlcance tipoDeDatoARetornar nombreMetodo(){ return 1;}
    public int obtenerNumero(){
        return 1;
    }
    
    //3+3+3 = 9
    //3+3+3.0=9.0
    
    public double sumaTresNumeros(int numeroA,int numeroB,double numeroC){
        return numeroA + numeroB + numeroC;
    }
    
    //Sobre carga de metodo
    public double restarNumero(){
        return 5-2;
    }
    
    public double restarNumero(double numeroA,double numeroB){
        return numeroA - numeroB;
    }
    
    //Metodos sin retorno de valor
    //modificadorAlcance void nombreMetodo(){}
    public void asignarValorANumero(){
        numero = 10;
    }

}