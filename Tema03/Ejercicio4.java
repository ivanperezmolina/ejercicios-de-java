/**
* Relación de ejercicios Tema 3
*
* @author Iván Pérez Molina
*/

public class Ejercicio4 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    double primerNumero;
    primerNumero = Double.parseDouble( linea );

    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    double segundoNumero;
    segundoNumero = Double.parseDouble( linea );

    double suma;
    suma = (primerNumero) + (segundoNumero);
    
    double resta;
    resta = (primerNumero) - (segundoNumero);
    
    double multi;
    multi = (primerNumero ) * (segundoNumero);
    
    double division;
    division = (primerNumero) / (segundoNumero);
    
    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    
    System.out.println("Si sumo los numeros el resultado es " + suma);
    System.out.println("Si resto los numeros el resultado es " + resta);
    System.out.println("Si multiplico los numeros el resultado es " + multi);
    System.out.println("Si divido los numeros el resultado es " + division);


 
  } 
}
