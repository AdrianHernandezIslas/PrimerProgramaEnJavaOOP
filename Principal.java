
/**
 * Un empresa necesita un programa para calcular el sueldo de sus empleados
 * en base su salario diario y la cantidad de dias laborados el programa debera
 * determiar el sueldo a pagar por empleado.
 * Del empleado se requieren nombre completo, salario diario, cantidad de dias
 * laborados
 * Recuerde que el salario del empleado puede ser modicado posteriormente
 * 
 * Clase: Empleado
 * Atributos:
 *  -salarioDiario
 *  -diasLaborados
 *  -nombre
 * Metodos:
 *  +setSalarioDiario()
 *  +setDiasLaborados()
 *  +getSalarioDiario()
 *  +getDiasLaborados()
 *  
 *  Clase: Empresa
 *    -nombre
 *  Metodos:
 *   +calcularSueldoEmpleado(Empleado)
 */


public class Principal
{
    public static void main(String args[]){
        Empresa empresaChida = new Empresa("Somos Chidos S.A. de C.V.");
        
        Empleado empleadoUno = new Empleado("Adrian Hdz. Islas",0,123.5);
        Empleado empleadoDos = new Empleado("Marisol Altamirano",0,1000.0);
        
        empleadoUno.setDiasLaborados(15);
        empleadoDos.setDiasLaborados(-5);
       
        
        System.out.println("\t\t"+empresaChida.getNombre());
        
        System.out.println("El sueldo de "+empleadoUno.getNombre()+" se le pagara: "+ 
                            empresaChida.calcularSueldoEmpleado(empleadoUno));
        System.out.println("El sueldo de "+empleadoDos.getNombre()+" se le pagara: "+ 
                            empresaChida.calcularSueldoEmpleado(empleadoDos));
    }
}
