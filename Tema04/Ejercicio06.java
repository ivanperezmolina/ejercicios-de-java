/**
* Ejercicio 6
*
* @author Iván Pérez Molina
*/

public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Calcule el tiempo que tarda en caer un objeto introduciendo la altura ");
    String linea;
    System.out.print("Por favor, introduce el valor de h (altura) : ");
    linea = System.console().readLine();
    double h;
    h = Double.parseDouble( linea );
    

    if (h <= 0.0){
      System.out.print("ERROR FATAL!");
    }
    
    else {
    double total;
    total = Math.sqrt ((2*h)/(9.81));

    System.out.print("El valor de la altura es de: " + h);
    System.out.print("El objeto tardara en caer  " + total + "  segundos");
     
    }
  } 
}
