
package principal;

public class Cliente extends Persona  {
   private  String direccion;

    public Cliente(String direccion, String nombre, int edad) {
        super(nombre, edad);
        this.direccion = direccion;
    }
   public String mostarCliente (){
       
       return getNombre() + "\nedad" +getEdad() + "\ndireccion" + direccion;
   }

    
    
    
    
}
