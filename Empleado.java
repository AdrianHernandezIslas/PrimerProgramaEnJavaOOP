
public class Empleado
{
   private String nombre;
   private int diasLaborados;
   private double salarioDiario;
   
   public Empleado(String nombre, int diasLaborados, double salarioDiario){
       this.nombre = nombre;
       this.diasLaborados = diasLaborados;
       this.salarioDiario = salarioDiario;
   }
   
   public String getNombre(){
       return nombre;
   }
   
   public void setSalarioDiario(double salarioDiario){
       this.salarioDiario = salarioDiario;
   }
   
   public void setDiasLaborados(int diasLaborados){
       this.diasLaborados = diasLaborados;
   }
   
   public int getDiasLaborados(){
       return diasLaborados;
   }
   
   public double getSalarioDiario(){
       return salarioDiario;
   }
}
