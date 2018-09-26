/**
* Relación de ejercicios del tema 3
*
* @author Iván Pérez Molina
*/

public class Ejercicio1 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Por favor, introduce un número entero: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );

    System.out.print("introduce otro número entero, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );

    int total;
    total = (primerNumero) * (segundoNumero);

    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.print("El resultado de su multiplicación es:");
    System.out.print(total);   
  } 
}
