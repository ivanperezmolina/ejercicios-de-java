/**
* Relación de ejercicios del tema 3 -->Convertor KB - MB
*
* @author Iván Pérez Molina
*/

public class Ejercicio11 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Por favor, introduce la cantidad de KB  a tranformar: ");
    linea = System.console().readLine();
    double kb;
    kb = Double.parseDouble( linea );

    double total;
    total = (kb) * (0.001);

    System.out.println("El numero de KB a transformar es: " + kb);
    System.out.println("y tengamos en cuenta que 1 Mb son 1000 Kb ");
    System.out.println("El resultado de la transformación es:");
    System.out.print(total);   
  } 
}
