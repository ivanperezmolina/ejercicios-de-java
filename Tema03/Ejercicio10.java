/**
* Relación de ejercicios del tema 3 -->Convertor MB - KB
*
* @author Iván Pérez Molina
*/

public class Ejercicio10 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Por favor, introduce la cantidad de MB  a tranformar: ");
    linea = System.console().readLine();
    double mb;
    mb = Double.parseDouble( linea );

    double total;
    total = (mb) * (1000.0);

    System.out.println("El numero de MB a transformar es: " + mb);
    System.out.println("y tengamos en cuenta que 1 Mb son 1000 Kb ");
    System.out.println("El resultado de la transformación es:");
    System.out.print(total);   
  } 
}
