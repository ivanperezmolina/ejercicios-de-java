
package funciones;

import static funciones.funcionesnumericas.FuncionesNumericas.voltea;



/**
 *
 * @author ivanp
 */
public class Ejercicio16 {

  public static void main(String[] args) {
    
    //UTILIZO FUNCION esCapicua
    System.out.println("Números capicúa entre 1 y 99999");

    for (int i = 1; i < 99999; i++) {
      if (esCapicua(i) == true) {
        System.out.println(i + "  ");
      }
    }
  }
  
  
    //////////////////////////////////////////////////////////////////////////////
  /**
   * esCapicua Devuelve verdadero si el número que se pasa como
   * parámetro es capicúa y falso en caso contrario.
   *
   * @param n
   * @return Si el numero es Capicua o no
   */
  public static boolean esCapicua(int n) {

    int auxiliar = voltea(n);

    if (auxiliar == n) {
      return true;
    } else {
      return false;
    }
  }
}
