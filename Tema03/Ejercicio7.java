/**
* Ejercicio 7 del Tema 3
*
* @author Iván Pérez Molina
*/

public class Ejercicio7 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Por favor, introduce la base imponible de su producto: ");
    linea = System.console().readLine();
    double baseImponible;
    baseImponible = Double.parseDouble( linea );
    
    double IVA;
    IVA = (baseImponible * 21) / 100;

    double total;
    total = baseImponible + IVA;

    System.out.println("La base imponible del producto es: " + baseImponible);
    System.out.println("Se le aplicara un IVA de: " + IVA);
    System.out.println("El total de su producto es: " + total);   
  } 
}
