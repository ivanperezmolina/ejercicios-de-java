package tema07;

import java.util.Scanner;

/**
 * @author ivanp
 */
public class Ejercicio08 {

  public static void main(String[] args) {
    //Scanner de numeros
    Scanner s = new Scanner(System.in);

    //Creo el array y pido datos
    int[] miArray = new int[12];

    for (int i = 0; i <= 11; i++) {
      int auxiliar = i + 1;
      System.out.print("Introduce la temperatura del " + auxiliar + "º mes: ");
      miArray[i] = Integer.parseInt(s.nextLine());

    }
    System.out.print("--------------------------------------------");
    System.out.println("");

    //Voy pintando mes a mes
    for (int j = 0; j <= 11; j++) {

      int auxiliar = j + 1;
      System.out.print("\033[34m");
      System.out.print("Mes ");
      System.out.printf("%2d ", auxiliar);
      System.out.print("||");

      for (int i = 0; i < miArray[j]; i++) {
        System.out.print("\033[31m");
        System.out.print("█");
      }
       System.out.print("\033[35m");
      System.out.println(" " + j + "ºC");

    }

  }
}
