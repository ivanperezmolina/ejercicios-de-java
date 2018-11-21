package arraybidimensional;

/**
 *
 * @author Iván Pérez Molina
 */
public class Ejercicio01 {

  public static void main(String[] args) {

    //Defino un array de 3 filas por 2 columnas
    int[][] num = new int[3][6];

    //Le asigno valores
    num[0][0] = 0;
    num[1][0] = 75;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;

    //Muestro por pantalla
    System.out.print("Array num ");
    for (int i = 0; i <= 5; i++) {
      System.out.print("|");
      System.out.printf("Columna" + "%5d", i);
    }

    System.out.println("  ");

    int fila;
    int columna;

    for (fila = 0; fila <= 2; fila++) {
      System.out.printf("Fila" + "%5d", fila);
      System.out.print(" |");
      for (columna = 0; columna <= 5; columna++) {
        System.out.printf("%11d ", num[fila][columna]);
        System.out.print("|");
      }
      System.out.println("  ");
    }
  }
}
