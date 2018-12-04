package funciones;


/**
 *
 * @author ivanp
 */
public class Ejercicio15 {

  public static void main(String[] args) {

    //UTILIZO FUNCION esPrimo
    System.out.println("Números primos entre 1 y 1000");

    for (int i = 1; i < 1000; i++) {
      if (esPrimo(i) == true) {
        System.out.print(i + "  ");
      }
    }

  }
  //////////////////////////////////////////////////////////////////////////////

  /**
   * esPrimo: Devuelve verdadero si el número que se pasa como parámetro es
   * primo y falso en caso contrario.
   *
   * @param n
   * @return Si el numero es primo o no
   */
  public static boolean esPrimo(int n) {

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
