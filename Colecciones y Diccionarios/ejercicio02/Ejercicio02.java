package ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author Iván Pérez Molina
 */
public class Ejercicio02 {

  public static void main(String[] args) {

    ArrayList<Integer> n = new ArrayList<>();

    //Genera el ArrayList
    for (int i = 0; i < aleatorio(10, 20); i++) {
      int numero = aleatorio(0, 100); //Lo meto en una variable
      n.add(numero);
    }

    //Calcula la suma; el minimo y el maximo
    int suma = 0;
    int min = n.get(0);
    int max = n.get(0);

    for (Integer numero : n) {
      suma += numero;
      if (numero > max) {
        max = numero;
      }

      //Una forma de expresar un if es --> max = numero > max ? numero : max;
      if (numero < min) {
        min = numero;
      }

      //Una forma de expresar este if es --> min = numero < min ? numero : min;
    }

    System.out.println(n);
    System.out.println("MÁXIMO: " + max);
    System.out.println("MÍNIMO: " + min);
    System.out.println("SUMA: " + suma);
  }

  public static int aleatorio(int min, int max) {
    return (int) (Math.random() * (max - min + 1)) + min;
  }
}
