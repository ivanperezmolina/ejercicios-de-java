
package Personas;

/**
 *
 * @author Ivan Perez
 */
public class Persona {
  //Atributos
  String nombre;
  int edad;
  
  //Metodos
  
  //constructores

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }



  public void mostrarDatos(){
    System.out.println("El nombre es: "+nombre);
    System.out.println(nombre+" tiene "+edad+" años");
  }
  
  
}
