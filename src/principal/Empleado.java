
package principal;


public class Empleado extends Persona  {
    private double salario;

    public Empleado(double salario, String nombre, int edad) {
        super(nombre, edad);
        this.salario = salario;
    }
    public String mostarEmpleado (){
       return getNombre() + "\nedad" +getEdad() + "\nsalario" + salario;
   }
 
    
}
