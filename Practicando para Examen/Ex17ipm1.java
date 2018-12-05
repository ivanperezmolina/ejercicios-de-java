/*
 * 1. Escribe un programa que pida al usuario introducir sus 5 números favoritos. Estos números se deben 
 * guardar en un array. A continuación, se mostrarán todos los números del 1 al 100 junto con “ME
 * GUSTA” o “no me gusta” según si el número en cuestión está o no está el el array de favoritos tal y
 * como se muestra en el ejemplo. Nótese que “ME GUSTA” está en mayúsculas para que se pueda
 * distinguir bien. Por cada 5 números mostrados hay un salto de línea.
 */
package prog_2016_2017_t1c2c;

import java.util.Scanner;

/**
 *
 * @author Ivan Pérez Molina
 */
public class Ex17ipm1 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    //Creo un array y la variable para el numero
    int[] miArray = new int[5];
    int numero = 0;

    //Pido los cinco números y los meto en el array
    System.out.println("Por favor, introduzca sus 5 números favoritos:");

    for (int i = 0; i < 5; i++) {
      numero = Integer.parseInt(s.nextLine());
      miArray[i] = numero;
    }
    System.out.println("-----------------------------------------------------");

    //Voy del 0 al 100 con una variable booleana que me diga si coincide con el 
    //numero que tiene el array o no.
    for (int j = 1; j <= 100; j++) {
      boolean esFavorito = false;
      for (int i : miArray) {
        if (i == j) {
          esFavorito = true;
        }
      }
    //Pinto me gusta o no segun el resultado de la booleana sea true o false
      if (esFavorito == true) { //Para hacerlo mas optimo se debe pomer if(esFavorito){}
        System.out.print(j + " ME GUSTA, ");
      } else {
        System.out.print(j + " no me gusta, ");
      }
    
    //Para cumplir la condición del salto de linea cada 5 numeros. Compruebo si 
    //el numero es multiplo de 5 o no. Si lo es añado un salto de linea 
      if (j % 5 == 0) {
        System.out.println("");
      }

    }

  }
}
