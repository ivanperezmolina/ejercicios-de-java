/**
* Ejercicio 5
*
* @author Iván Pérez Molina
*/

public class Ejercicio05 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Por favor, introduce el valor de a : ");
    linea = System.console().readLine();
    double a;
    a = Double.parseDouble( linea );
    
    String lineados;
    System.out.print("Introduce el valor de b:");
    lineados = System.console().readLine();
    double b;
    b = Double.parseDouble( lineados );

    if (a == 0.0){
      System.out.print("ERROR FATAL!");
    }
    
    else {
    double total;
    total = -b / a;

    System.out.print("El primer número introducido es " + a);
    System.out.println(" y el segundo es " + b);
    System.out.print("El resultado de su operacion es :");
    System.out.print(total);   
    }
  } 
}
