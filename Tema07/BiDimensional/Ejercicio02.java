package arraybidimensional;

import java.util.Scanner;

/**
 *
 * @author Iván Pérez Molina
 */
public class Ejercicio02 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    //Defino un array de 4 filas por 5 columnas
    int[][] miArray = new int[4][5];

    //VARIABLES
    int fila;
    int columna = 0;
    int sumafila;
    int sumacolumna;

    //Voy pidiendo numeros para almacenarlos
    System.out.print("Introduce un numero: ");
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        miArray[fila][columna] = Integer.parseInt(s.nextLine());
      }
    }

    //Construyo la tabla 
    System.out.print("Array num ");
    for (int i = 0; i < 5; i++) {
      System.out.print("|");
      System.out.printf("Columna" + "%5d", i);
    }

    System.out.println("  ");

    for (fila = 0; fila < 4; fila++) {
      System.out.printf("Fila" + "%5d", fila);
      System.out.print(" |");
      sumafila = 0;
      for (columna = 0; columna < 5; columna++) {
        System.out.printf("%11d ", miArray[fila][columna]);
        System.out.print("|");
        sumafila = sumafila + miArray[fila][columna];
      }
      System.out.print("SUMA= " + sumafila);
      System.out.println("  ");
    }

    for (columna = 0; columna < 5; columna++) {
      System.out.print("----------------");
    }
    
    System.out.println("----------------");
    System.out.print("SumaCol   ");

    int sumaColumna;
    int sumaTotal = 0;
    for (columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila < 4; fila++) {
        sumaColumna += miArray[fila][columna];
      }
      sumaTotal += sumaColumna;
      System.out.printf("|%12d", sumaColumna);
    }
    System.out.printf("|TOTAL=" + "%3d", sumaTotal);
    System.out.println("");

  }
}
