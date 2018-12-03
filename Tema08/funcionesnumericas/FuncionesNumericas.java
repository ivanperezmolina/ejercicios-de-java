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
public class FuncionesNumericas {
  ////FUNCIONES////

  /**
   * Ejemplo -->Devuelve un numero entero entre 1 y 6 que se corresponde con la
   * tirada de un dado tradicional
   *
   * @return Un numero aleatorio entre 1 y 6
   */
  public static int tiraDado() {
    //int numeroAleatorio = (int) (Math.random() * 6) + 1;
    return aleatorio(1, 6);
  }

  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejemplo -->Genera un numero aleatorio entre un valor minimo introducido y
   * un valor maximo introducido
   *
   * @param min
   * @param max
   * @return Un numero aleatorio entre un min y un max
   */
  public static int aleatorio(int min, int max) {
    int n = (int) (Math.random() * (max - min + 1)) + min;
    return n;
  }

  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejercicio 01-->esCapicua Devuelve verdadero si el número que se pasa como
   * parámetro es capicúa y falso en caso contrario.
   *
   * @param n
   * @return Si el numero es Capicua o no
   */
  public static boolean esCapicua(int n) {

    int auxiliar = voltea(n);

    if (auxiliar == n) {
      return true;
    } else {
      return false;
    }
  }

  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejercicio 02-->esPrimo: Devuelve verdadero si el número que se pasa como
   * parámetro es primo y falso en caso contrario.
   *
   * @param n
   * @return Si el numero es primo o no
   */
  public static boolean esPrimo(int n) {

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejercicio 03-->siguientePrimo: Devuelve el menor primo que es mayor al
   * número que se pasa como parámetro.
   *
   * @param n
   * @return El siguiente primo al numero que yo introduzca
   */
  public static int siguientePrimo(int n) {
    do {
      n++;
    } while (!esPrimo(n));
    return n;
  }

  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejercicio 04-->potencia: Dada una base y un exponente devuelve la potencia.
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
   * Ejercicio 05-->digitos: Cuenta el número de dígitos de un número entero.
   *
   *
   * @param x
   * @return El numero de digitos que tiene el número
   */
  public static int digitos(int x) {
    int cuentadigitos = 0;
    cuentadigitos = Integer.toString(x).length();

    return cuentadigitos;
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

  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejercicio 07-->digitos: Devuelve el dígito que está en la posición n de un
   * número entero. Se empieza contando por el 0 y de izquierda a derecha.
   *
   *
   * @param x
   * @return El numero de digitos que tiene el número
   */
//  public static int digitoN(int x) {
//
//    return a;
//  }
  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejercicio 14-->juntaNumeros: Pega dos números para formar uno.
   *
   *
   * @param x
   * @param y
   * @return Un numero compuesto por dos numeros
   */
  public static String juntaNumeros(int x, int y) {
    String cadenauno = Integer.toString(x);
    String cadenados = Integer.toString(y);

    String cadenayajuntos = (x + "" + y);

    return cadenayajuntos;
  }

  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejercicio 11-->pegaPorDetras: Añade un dígito a un número por detrás.
   *
   *
   * @param x
   * @param y
   * @return Un numero compuesto por dos numeros
   */
  public static String pegaPorDetras(int x, int y) {
    String numerooriginal = Integer.toString(x);
    String paraañadir = Integer.toString(y);

    String cadenayajuntospordetras = (x + "" + y);

    return cadenayajuntospordetras;
  }

  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejercicio 12-->pegaPorDelante: Añade un dígito a un número por delante.
   *
   *
   * @param x
   * @param y
   * @return Un numero compuesto por dos numeros
   */
  public static String pegaPorDelante(int x, int y) {
    String numerooriginaldelante = Integer.toString(x);
    String paraañadirdelante = Integer.toString(y);

    String cadenayajuntospordelante = (y + "" + x);

    return cadenayajuntospordelante;

  }

  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejercicio 9-->quitaPorDetras: Le quita a un número n dígitos por detrás
   * (por la derecha).
   *
   *
   * @param x
   * @param veces
   * @return Un numero con n digito menos por detras
   */
  public static int quitaPorDetras(int x, int veces) {
    int comodin = x;
    for (int i = 1; i <= veces; i++) {
      comodin = comodin / 10;
    }

    return comodin;

  }

  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejercicio 9-->quitaPorDelante: Le quita a un número n dígitos por delante
   * (por la izquierda)
   *
   *
   * @param x
   * @param veces
   * @return Un numero con un digito menos por delante
   */
  public static int quitaPorDelante(int x, int veces) {
    int gironumero = 0;
    int yagiradoyconnumeroquitado = 0;
    int volveracomoestaba = 0;

    gironumero = voltea(x);

    for (int i = 1; i <= veces; i++) {
      yagiradoyconnumeroquitado = quitaPorDetras(gironumero, veces);
    }

    volveracomoestaba = voltea(yagiradoyconnumeroquitado);

    return volveracomoestaba;
  }

  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejercicio 13-->trozoDeNumero: Toma como parámetros las posiciones inicial y
   * final dentro de un número y devuelve el trozo correspondiente.
   *
   *
   * @param n
   * @param pos1
   * @param pos2
   * @return Un numero con un digito menos por detras
   */
  public static int trozoDeNumero(int n, int pos1, int pos2) {
    int longitud = digitos(n);
    n = quitaPorDelante(n, pos1);
    n = quitaPorDetras(n, longitud - pos2 - 1);

    return n;
  }

  //////////////////////////////////////////////////////////////////////////////
  /**
   * Ejercicio 7-->digitoN: Devuelve el dígito que está en la posición n de un
   * número entero. Se empieza contando por el 0 y de izquierda a derecha.
   *
   *
   * @param x
   * @param n
   * @return La posición de un número
   */
  public static int digitoN(int x, int n) {


    return digitoN((int)(long)x, n);
  }

}
