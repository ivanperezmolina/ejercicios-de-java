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
    //Pido la longitud del sendero
    System.out.print("Introduzca longitud del sendero en metros: ");
    int longitud = Integer.parseInt(s.nextLine());
    
    //Le dejare un margen por delante para que al desplazar a la izquierda no
    //se salga de la consola
    int margen = 14;
    
    for (int i = 0; i < longitud; i++) {//Hace esto segun la long. del sendero
      margen += aleatorio(-1, 1);//Genero un aleatorio entre -1 y uno para decidir si se mueve a la izquierda, centro o derecha
      System.out.print(repite(" ", margen));//Le meto a la funcion el caracter y cuantos espacios quiero que pinte
      
      if (aleatorio(0, 1) == 0) {//Genero un numero para saber si en el camino me encontrare un obtaculo o no. 
        System.out.println("#    #");//Si el if es cero; pinto el camino sin obtaculos
      } else { // Si no es 0; significa que hay obtaculos
        
        int posicionObstaculo = aleatorio(1, 4);//Genero un numero entre el 1 y el 4 para saber en que posicion esta el obtaculo
        System.out.print("#");//Abro el camino; este es el borde inicial
        for (int j = 1; j <= 4; j++) {//Controlo en que hueco lo voy a poner
          if (j == posicionObstaculo) {//Si coinciden el aleatorio generado con el valor de la j pinto. 
            if (aleatorio(0, 1) == 0) {//Aqui decido si es un arbusto o una piedra
              System.out.print("*");//Arbusto
            } else {
              System.out.print("O");//Piedra
            }
            
          } else {
            System.out.print(" ");//Si no hay obtaculo, pinto un espacio
          }
        }
        System.out.println("#");//Cierro el camino, este es el borde final
      }
      
    }
  }

  
  /**
   * aleatorio-->Genera un numero aleatorio entre un valor minimo 
   * introducido(inicio) y un valor maximo introducido(fin)
   *
   * @param inicio
   * @param fin
   * @return Un numero aleatorio entre un min y un max
   */
  public static int aleatorio(int inicio, int fin) {
    return (int) (Math.random() * (fin - inicio + 1)) + inicio;
  }
  
  /////////////////////////////////////////////////////////////////////////////
  /**
   * repite-->Le paso un caracter(String) y un numero de veces para que me lo
   * repita 
   *
   * @param cadena
   * @param repeticiones
   * @return Una cadena repetida "n" veces
   */

  public static String repite(String cadena, int repeticiones) {
    String resultado = "";
    for (int i = 0; i < repeticiones; i++) {
      resultado += cadena;
    }
    return resultado;
  }
}
