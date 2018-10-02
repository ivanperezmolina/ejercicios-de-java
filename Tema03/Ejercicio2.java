/**
* Relación de ejercicios del tema 3 -->Convertor euros-pesetas
*
* @author Iván Pérez Molina
*/

public class Ejercicio2 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Por favor, introduce un la cantidad de euros a tranformar: ");
    linea = System.console().readLine();
    int euros;
    euros = Integer.parseInt( linea );

    /**System.out.print("introduce otro número entero, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );*/

    int total;
    total = (int)(euros * 166,386);

    System.out.print("El numero de euros a transformar es: " + euros);
    System.out.println("y tengamos en cuenta que 166 pesetas es 1 €");
    System.out.print("El resultado de la transformación es:");
    System.out.print(total);   
	//printf ("½.2f son ")
  } 

}
