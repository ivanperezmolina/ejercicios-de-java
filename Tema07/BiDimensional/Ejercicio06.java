package arraybidimensional;

import java.util.Scanner;

/**
 *
 * @author ivanp
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Defino un array de 4 filas por 5 columnas
    int[][] miArray = new int[6][10];

    //VARIABLES
    int fila;
    int columna = 0;
    int maximo = 0;
    int minimo = 1000;
    int auxiliar = 0;

    /////////////////
    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {
        miArray[fila][columna] = (int) (Math.random() * 1000);

        if (miArray[fila][columna] < minimo) {
          minimo = miArray[fila][columna];
        }

        if (miArray[fila][columna] > maximo) {
          maximo = miArray[fila][columna];
        }
        
        if (auxiliar=miArray[fila][columna]){
        miArray[fila][columna] = (int) (Math.random() * 1000);
        }
        
        int auxiliar=miArray[fila][columna];
        
        

      }
    }

    //Construyo la tabla 
    System.out.print("Array num ");
    for (int i = 0; i < 10; i++) {
      System.out.print("|");
      System.out.printf("Columna" + "%5d", i);

    }

    System.out.println("  ");

    for (fila = 0; fila < 6; fila++) {
      System.out.printf("Fila" + "%5d", fila);
      System.out.print(" |");

      for (columna = 0; columna < 10; columna++) {
        System.out.printf("%11d ", miArray[fila][columna]);
        System.out.print("|");
      }
      System.out.println("");

    }

    // Muestra el resultado maximo
    System.out.println("El numero maximo es "+maximo+" que esta en la posicion:");

    // Muestra el resultado minimo
    System.out.println("El numero minimo es "+minimo+" que esta en la posicion:");

  }

}
