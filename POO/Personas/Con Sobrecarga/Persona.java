
package Personas;

/**
 *
 * @author Ivan Perez
 */
public class Persona {
  //Atributos
  String nombre;
  int edad;
  int dni;
  
  //Metodos
  
  //constructores

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public Persona(int dni) {
    this.dni = dni;
  } 
  

 public void correr(){
   System.out.println("Run! Run! Run!");
 }
 
 public void correr(int km){
   System.out.println("He corrido "+km+" km");
 }

  public void mostrarDatos(){
    System.out.println("El nombre es: "+nombre);
    System.out.println(nombre+" tiene "+edad+" años");
  }
  
  
}
