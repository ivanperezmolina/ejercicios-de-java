/*
 * 4. Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con el carácter #. La
 * anchura del sendero siempre es la misma, los dos caracteres del borde más cuatro caracteres en
 * medio, en total 6 caracteres (incluyendo espacios). A cada metro, el sendero puede continuar recto,
 * girar un carácter a la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria. Por
 * cada metro de sendero – representado por una línea – puede que haya un obstáculo o puede que no,
 * la probabilidad es del 50%. La posición del obstáculo es aleatoria y puede estar entre el primer y el
 * cuarto carácter dentro de la línea. En caso de existir un obstáculo en un metro de sendero (en una
 * línea), puede ser una planta (carácter *) o una piedra (carácter O), la probabilidad de que salga uno u
 * otro es la misma. Recuerda que nunca habrá más de un obstáculo por metro de sendero, habrá uno o
 * ninguno.
 */
package prog_2016_2017_t1c2c;

import java.util.Scanner;

/**
 *
 * @author ivanp
 */
public class Ex17ipm4 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca longitud del sendero en metros: ");
    int longitud = Integer.parseInt(s.nextLine());
    
    int margen = 14;
    
    for (int i = 0; i < longitud; i++) {
      margen += aleatorio(-1, 1);
      System.out.print(repite(" ", margen));
      
      if (aleatorio(0, 1) == 0) {
        System.out.println("#    #");
      } else { // Hay obstáculo
        int posicionObstaculo = aleatorio(1, 4);
        System.out.print("#");
        for (int j = 1; j <= 4; j++) {
          if (j == posicionObstaculo) {
            if (aleatorio(0, 1) == 0) {
              System.out.print("*");
            } else {
              System.out.print("O");
            }
            
          } else {
            System.out.print(" ");
          }
        }
        System.out.println("#");
      }
      
    }
  }

  

  public static int aleatorio(int inicio, int fin) {
    return (int) (Math.random() * (fin - inicio + 1)) + inicio;
  }

  public static String repite(String cadena, int repeticiones) {
    String resultado = "";
    for (int i = 0; i < repeticiones; i++) {
      resultado += cadena;
    }
    return resultado;
  }
}
