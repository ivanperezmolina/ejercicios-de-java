/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones.funcionesnumericas;

/**
 *
 * @author ivanp
 */
public class FuncionesBiDe {
  //////////////////////////////////////////////////////////////////////////////

  /**
   * digitos: Cuenta el número de dígitos de un número entero.
   *
   *
   * @param x
   * @return El numero de digitos que tiene el número
   */
  public static int digitos(int x) {
    return digitos((long) x);
  }

  public static int digitos(long x) {

    int cuentadigitos = Long.toString(x).length();

    return cuentadigitos;
  }

  //////////////////////////////////////////////////////////////////////////////
  /**
   * potencia: Dada una base y un exponente devuelve la potencia.
   *
   *
   * @param x
   * @param z
   * @return Un numero elevado a una potencia
   */
  public static int potencia(int x, int z) {//x es base y z es exponente
    int calculapotencia = 0;
    calculapotencia = (int) Math.pow(z, x);

    return calculapotencia;
  }

  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejercicio 06-->Voltea Invierte un numero (le da la vuelta). Por ejemplo:
   * 3456 quedaria 6543
   *
   * @param n Numero entero que se quiere invertir
   * @return Numero invertido
   */
  public static int voltea(int n) {
    int numero = n;
    int volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while

    return volteado;
  }

  /////////////////////////////////////////////////////////////////////////////
  public static int[] numberToArray(long n) {
    int longitud = FuncionesBiDe.digitos(n);
    int[] digits = new int[longitud];

    for (int i = longitud - 1; i >= 0; i--) {
      digits[i] = (int)(n % 10);
      n=n/10;
    }

    return digits;
  }
}
