/**
 * Ejercicio8
 *
 * @author Iván Pérez Molina
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    //Pido el numero
    String linea;
    System.out.println("Introduce el numero para mostrar su tabla de multiplicar");
    linea = System.console().readLine();
    int numero;
    numero = Integer.parseInt( linea );
        
    for (int i = 0; i <=10; i++) {
      int resultado;
      resultado=numero*i;
      System.out.printf("%2d x %2d = %3d\n" ,numero, i ,resultado);
    }
  }
}
