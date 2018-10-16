/**
 * 
 *
 * @author Iván Pérez
 */

public class Ejercicio10 {
    
  public static void main(String[] args) {
        
    System.out.println("Por favor, vaya introduciendo números para hacer su media y pulsando INTRO.");
    System.out.println("Para terminar, introduzca un número negativo.");
    
    int numeroIntroducido = 0;
    int cuentaNumeros = 0;
    int suma = 0;
    int media =0;
        
    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      cuentaNumeros++; // Incrementa en uno la variable
      suma += numeroIntroducido; // Equivale a suma = suma + NumeroIntroducido
    }
    
    System.out.println("Has introducido " + (cuentaNumeros - 1) + " números positivos.");
    media=(suma - numeroIntroducido)/ (cuentaNumeros - 1);
    System.out.println("La media total de ellos es " + media);
  }
}
