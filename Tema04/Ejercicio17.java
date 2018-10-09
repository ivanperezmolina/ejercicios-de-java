/**
* Ejercicio que me calcula la ultima cifra
*
* @author Iván Pérez Molina
*/

public class Ejercicio17 {
  public static void main(String[] args) {

    //Pedir los valores de la hora y minutos
    System.out.println("BINVENIDO AL PROGRAMA PARA INDICAR LA ULTIMA CIFRA DEL NUMERO");
    String linea;
    System.out.println("Introduce un numero: ");
    linea = System.console().readLine();
    int numero;
    numero = Integer.parseInt( linea );
    
    int ultima;
    ultima = (numero % 10);
    
    System.out.println("La ultima cifra de su numero es: ");
    System.out.println(ultima);
         
    //%10 de cualquier numero da la ultima cifra
    
  }
}















