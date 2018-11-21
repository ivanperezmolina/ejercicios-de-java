package arraybidimensional;

import java.util.Scanner;

/**
 *
 * @author ivanp
 */
public class Ejercicio11 {

  public static void main(String[] args) {
    
    //Generalizar
    int numerofila = 10;
    int numerocolumna = 10;

    Scanner s = new Scanner(System.in);
    //Defino un array de 12 filas por 12 columnas
    int[][] miArray = new int[numerofila][numerocolumna];

    //VARIABLES
    int fila;
    int columna = 0;

    /////////////////


    for (fila = 0; fila < numerofila; fila++) {
      for (columna = 0; columna < numerocolumna; columna++) {
        miArray[fila][columna] = (int) (Math.random() * 100) ;
       
      }
    }

    //Construyo la tabla 
    System.out.print("Array num ");
    for (int i = 0; i < numerocolumna; i++) {
      System.out.print("|");
      System.out.printf("Columna" + "%5d", i);

    }

    System.out.println("  ");

    for (fila = 0; fila < numerofila; fila++) {
      System.out.printf("Fila" + "%5d", fila);
      System.out.print(" |");

      for (columna = 0; columna < numerocolumna; columna++) {
        
        System.out.printf("%11d ", miArray[fila][columna]);
        
        System.out.print("|");

      }

      System.out.println("  ");
    }

    for (columna = 0; columna < numerocolumna; columna++) {
      System.out.print("----------------");
    }

    for (columna = 0; columna < numerocolumna; columna++) {

    }

    System.out.println("");
    
    
    
    

   
   
  }

}
