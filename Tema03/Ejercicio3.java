/**
* Relación de ejercicios del tema 3 -->Convertor euros-pesetas
*
* @author Iván Pérez Molina
*/

public class Ejercicio3 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Por favor, introduce la cantidad de pesetas a tranformar: ");
    linea = System.console().readLine();
    double pesetas;
    pesetas = Double.parseDouble( linea );

    double total;
    total = (pesetas) * (0.006);

    System.out.print("El numero de pesetas a transformar es: " + pesetas);
    System.out.println("y tengamos en cuenta que 166 pesetas es 1 €");
    System.out.print("El resultado de la transformación es:");
    System.out.print(total);   
  } 
}
