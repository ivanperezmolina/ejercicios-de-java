/**
* Ejercicio 5 del Tema 3
*
* @author Iván Pérez Molina
*/

public class Ejercicio5 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Por favor, introduce la base del rectángulo: ");
    linea = System.console().readLine();
    double base;
    base = Double.parseDouble( linea );

    System.out.print("Por favor, introduce la altura del rectangulo: ");
    linea = System.console().readLine();
    double altura;
    altura = Double.parseDouble( linea );

    double area;
    area = (base) * (altura);

    System.out.println("La base del rectangulo es: " + base);
    System.out.println("La altura del rectangulo es: " + altura);
    System.out.println("El área de su rectangulo es: " + area);   
  } 
}
