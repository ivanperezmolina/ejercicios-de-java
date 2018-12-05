/*
 * 2. Muestra por pantalla una secuencia aleatoria de 10 números múltiplos de 11 comprendidos entre el
 * 330 y el 550 ambos incluidos.
 * Ejemplo:
 * 517 440 385 374 550 517 484 462 363 418
 */
package prog_2016_2017_t1c2c;

/**
 *
 * @author ivanp
 */
public class Ex17ipm2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int azar = 0;
    int multiplos = 0;
    int contador=0;
    do{//Como hago para que genere 10 de 11
      azar = (int) (Math.random() * 220) + 330;
      if (multiplo11(azar)) {
        multiplos = azar;
        System.out.print(multiplos + " ");
        contador++;
      }

    } while(contador<10);
  }


  public static boolean multiplo11(int n) {
    int dividir = 0;
    dividir = n / 11;
    if (dividir % 11 == 0) {
      return true;
    } else {
      return false;
    }

  }
}
