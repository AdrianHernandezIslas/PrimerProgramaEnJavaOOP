
public class Circulo
{
    private double radio;
    private int coordenadaX;
    private int coordenadaY;
    
    public Circulo(double radio,int coordenadaX, int coordenadaY)
    {
        this.radio = radio;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public int getCoordenadaX(){
        return coordenadaX;
    }
    
    public void setCoordenadaX(int coordenadaX){
        this.coordenadaX = coordenadaX;
    }

     public int getCoordenadaY(){
        return coordenadaY;
    }
    
    public void setCoordenadaY(int coordenadaY){
        this.coordenadaY = coordenadaY;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(radio,2);
    }
    
    public double getAreaUsuario(){
        return 3.1416 * radio * radio;
    }
    
    public double getPerimetro(){
        return  Math.PI * 2 * radio;
    }
    
}
