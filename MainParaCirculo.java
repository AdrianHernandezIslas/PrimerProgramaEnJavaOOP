
public class MainParaCirculo
{
    public static void main(String args[]){
        Circulo unCirculo = new Circulo(5,3,2);
        Circulo otroCirculo = new Circulo(10,10,50);
        Circulo otroCirculoMas = new Circulo(45,0,0);
        
        System.out.println("El area de unCircilo es "+unCirculo.getArea());
        System.out.println("El area de unCircilo es "+unCirculo.getAreaUsuario());
        System.out.println("El perimetro de unCircilo es "+unCirculo.getPerimetro());
        
        System.out.println("El area de otroCircilo es "+otroCirculo.getArea());
        System.out.println("El area de otroCircilo es "+otroCirculo.getAreaUsuario());
    }
}
