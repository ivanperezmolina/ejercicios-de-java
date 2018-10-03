/**
 * Sentencia if Ejercicio 1
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio01 {
  public static void main(String[] args) {   
    System.out.println("Conoce que asignatura tienes a 1º Hora");
    System.out.println("Por favor, introduzca el día de la semana");
    String respuesta = System.console().readLine();
    respuesta = respuesta.toUpperCase();
  
    if (respuesta.equals("LUNES")) {
      System.out.println("Tienes Entornos de Desarrollo con Pilar");
    } 
    else {
      if (respuesta.equals("MARTES")){
        System.out.println("Tienes Sistemas Informaticos con Juan Carlos");
      }
        else
        {
          if  (respuesta.equals("MIERCOLES")) {
            System.out.println("Tienes Programación con Luis");
            }
            else {
                if  (respuesta.equals("JUEVES")) {
                System.out.println("Tienes Programación con Luis 2º");
              }
              else {
                  if  (respuesta.equals("VIERNES")) {
                  System.out.println("Tienes Sistemas Informaticos con Juan Carlos 2ª");
              }
                    else
                    {System.out.println("ERROR FATAL!");}
          
        }
        
      
    }
  }

}
}
}
