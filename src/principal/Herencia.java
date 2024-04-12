
package principal;


public class Herencia {
    private String nombre, direccion;
    private int edad;
    private double salario;

    public Herencia(String nombre, String direccion, int edad, double salario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
