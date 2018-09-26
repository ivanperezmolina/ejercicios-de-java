/**
* Ejercicio 8 del Tema 3
*
* @author Iván Pérez Molina
*/

public class Ejercicio8 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Por favor, introduce las horas trabajadas: ");
    linea = System.console().readLine();
    double horas;
    horas = Double.parseDouble( linea );

    double total;
    total = (horas) * 12;

    System.out.println("Usted ha dado " + horas + " horas");
    System.out.println("En esta empresa pagamos 12 euros la hora");
    System.out.println("Usted cobrara " + total + " €");   
  } 
}
