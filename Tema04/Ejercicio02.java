/**
 * Operadores lógicos Ejercicio 2
 *
 * @author Iván P
 */

public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Introduce la hora actual");
    
    String linea = System.console().readLine();
    int n = Integer.parseInt( linea );

    if ((n >= 6) && (n <= 12)) {
      System.out.println("HOLA SEÑOR/A");
      System.out.print("Buenos días!!!");
      
    }
    
    else {
       
      if ((n >= 13) && (n <= 20)) {
      System.out.println("HOLA SEÑOR/A");
      System.out.print("Buenas tardes!!!");
    }
    else {
      
    
    
        if ((n >= 21) && (n <= 23)) {
      System.out.println("HOLA SEÑOR/A");
      System.out.print("Buenas noches!!!");
    }
    
    else
    {
      if ((n >= 0) && (n <= 5)){
      System.out.println("HOLA SEÑOR/A");
      System.out.print("Buenas noches!!!");
        }
      }
    }
    
  }
      
    
    
  }
}
