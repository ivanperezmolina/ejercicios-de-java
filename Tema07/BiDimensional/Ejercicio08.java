package arraybidimensional;

import java.util.Scanner;

/**
 *
 * @author ivanp
 */
public class Ejercicio08 {

  public static void main(String[] args) {
    
    //Generalizar
    int numerofila = 8;
    int numerocolumna = 8;

    Scanner s = new Scanner(System.in);
    //Defino un array de 12 filas por 12 columnas
    int[][] miArray = new int[numerofila][numerocolumna];

    //VARIABLES
    int fila;
    int columna = 0;

    /////////////////


    for (fila = 0; fila < numerofila; fila++) {
      for (columna = 0; columna < numerocolumna; columna++) {
        miArray[fila][columna] = (int) (Math.random() * 10) ;
       
      }
    }

    //Construyo la tabla 
    System.out.print("Array ");
    for (int i = 0; i < numerocolumna; i++) {
      System.out.print("|");
      System.out.printf("%12d", i);
    }

    System.out.println("  ");

    for (fila = 0; fila < numerofila; fila++) {
      System.out.printf("%5d", fila);
      System.out.print(" |");

      for (columna = 0; columna < numerocolumna; columna++) {
        
        System.out.printf("%11d ", miArray[fila][columna]);
        
        System.out.print("|");

      }

      System.out.println("  ");
    }


    System.out.println("");
    
    for (int i = 0; i < numerocolumna; i++) {
      System.out.print("|");
      System.out.printf("%12d", i);
    }  
  }

}
