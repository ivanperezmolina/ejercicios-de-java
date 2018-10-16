/**
 * Ejercicio11
 *
 * @author Iván Pérez Molina
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    //Pido el numero
    String linea;
    System.out.println("Introduce el numero ");
    linea = System.console().readLine();
    int numero;
    numero = Integer.parseInt( linea );
        
    for (int i = 0; i <=5; i++) {
      int cuadrado;
      cuadrado=(numero*numero)*i;
      int cubo;
      cubo=(numero*numero*numero)*i;
      System.out.println("Cuadrado= " + cuadrado);
      System.out.println("Cubo    = " + cuadrado);
     
    }
  }
}
