

public class Empresa
{
    private String nombre;
    
    public Empresa(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

  
    public double calcularSueldoEmpleado(Empleado unEmpleado){
        double sueldo = 0;
        sueldo = calculaSueldo(unEmpleado);
        return sueldo;
    }
    
    private double calculaSueldo(Empleado variable){
        int dias = variable.getDiasLaborados();
        double salario =  variable.getSalarioDiario();
        double otroSueldo = 0;
        if(dias >= 0){
            otroSueldo = salario * dias;
        }
        return  otroSueldo;
    }
}
