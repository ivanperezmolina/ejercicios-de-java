/**
* Ejercicio 6 del Tema 3
*
* @author Iván Pérez Molina
*/

public class Ejercicio6 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Por favor, introduce la base del triangulo: ");
    linea = System.console().readLine();
    double base;
    base = Double.parseDouble( linea );

    System.out.print("Por favor, introduce la altura del triangulo: ");
    linea = System.console().readLine();
    double altura;
    altura = Double.parseDouble( linea );

    double area;
    area = ((base) * (altura)) / 2;

    System.out.println("La base del triangulo es: " + base);
    System.out.println("La altura del tringulo es: " + altura);
    System.out.println("El área de su triangulo es: " + area);   
  } 
}
