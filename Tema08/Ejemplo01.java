package funciones;

import java.util.Scanner;

/**
 *
 * @author Ivan Pérez Molina
 */
public class Ejemplo01 {

  public static void main(String[] args) {
    //UTILIZO FUNCION tiraDado
    System.out.println("Juego de la Oca Version 3.0");
    System.out.println("Dado 1: " + tiraDado());
    System.out.println("Dado 2: " + tiraDado());

    System.out.println("");
    System.out.println("-----------------");

    Scanner s = new Scanner(System.in);

    //UTILIZO FUNCION aleatorio
    System.out.println("Aleatorios entre dos numeros");
    System.out.print("Introduzca el minimo:");
    int minimo = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el maximo:");
    int maximo = Integer.parseInt(s.nextLine());

    for (int i = 0; i < 20; i++) {
      System.out.print(aleatorio(minimo, maximo) + "  ");
    }

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION voltea
    System.out.println("Voltea un numero");
    System.out.println("Introduzca un numero:");
    int num = Integer.parseInt(s.nextLine());
    System.out.println("Si le doy la vuelta a " + num + " me queda el numero " + voltea(num));

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION esCapicua
    System.out.println("¿Es capicua el numero?");
    System.out.println("Introduzca un numero:");
    int numeroIntroducido = Integer.parseInt(s.nextLine());

    if (esCapicua(numeroIntroducido)) {
      System.out.println("El numero es capicua");
    } else {
      System.out.println("El numero no es capicua");
    }

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION esPrimo
    System.out.println("¿Es primo el numero?");
    System.out.println("Introduzca un numero:");
    int numeroIntroducidoParaPrimo = Integer.parseInt(s.nextLine());

    if (esPrimo(numeroIntroducidoParaPrimo)) {
      System.out.println("El numero es primo");
    } else {
      System.out.println("El numero no es primo");
    }

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION siguientePrimo
    System.out.println("¿Cual es el primo siguiente?");
    System.out.println("Introduzca un numero:");
    int numeroIntroducidoParaSiguientePrimo = Integer.parseInt(s.nextLine());

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION potencia
    System.out.println("Calcula la potencia");
    System.out.println("Introduzca la base:");
    int base = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca la exponente:");
    int exponente = Integer.parseInt(s.nextLine());

    System.out.println("El resultado de esta potencia es " + potencia(base, exponente));

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION digitos
    System.out.println("¿Cuantos dígitos tiene tu número?");
    System.out.println("Introduzca un numero para contar sus dígitos:");
    int numerodigitos = Integer.parseInt(s.nextLine());

    System.out.println("El número " + numerodigitos + " tiene " + digitos(numerodigitos) + " dígito/s");

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION juntaNumeros
    System.out.println("Unir dos numeros");
    System.out.println("Introduzca el primer numero");
    int numerounojuntar = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca el segundo numero");
    int numerodosjuntar = Integer.parseInt(s.nextLine());

    System.out.println("El número " + numerounojuntar + " unido al número " + numerodosjuntar + " nos da el numero " + juntaNumeros(numerounojuntar, numerodosjuntar));

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION pegaPorDetras
    System.out.println("Pega a tu numero otro por detras");
    System.out.println("Introduzca el numero original :");
    int numerooriginalparaunirendetras = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca el numero a unir ");
    int numeroaunirpordetras = Integer.parseInt(s.nextLine());

    System.out.println("Si cogemos el numero " + numerooriginalparaunirendetras + " y le añadimos por detras el número " + numeroaunirpordetras + " nos da el numero " + pegaPorDetras(numerooriginalparaunirendetras, numeroaunirpordetras));

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION pegaPorDelante
    System.out.println("Pega a tu numero otro por delante");
    System.out.println("Introduzca el numero original :");
    int numerooriginalparaunirendelante = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca el numero a unir ");
    int numeroaunirpordelante = Integer.parseInt(s.nextLine());

    System.out.println("Si cogemos el numero " + numerooriginalparaunirendelante + " y le añadimos por detras el número " + numeroaunirpordelante + " nos da el numero " + pegaPorDelante(numerooriginalparaunirendelante, numeroaunirpordelante));

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION quitaPorDetras
    System.out.println("Le quito el ultimo digito a tu numero");
    System.out.println("Introduzca el numero :");
    int numeroparaquitarpordetras = Integer.parseInt(s.nextLine());


    System.out.println("Si cogemos el numero " + numeroparaquitarpordetras + " y le quitamos el ultimo numero nos queda " + quitaPorDetras(numeroparaquitarpordetras));

    System.out.println("");
    System.out.println("-----------------");
  }

  
  
  
  
  
  
  
  
  
  
  ////FUNCIONES////
  /**
   * Ejemplo Devuelve un numero entero entre 1 y 6 que se corresponde con la
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
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    } while (n =);

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
  public static int digitoN(int x) {

    return a;
  }

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
   * Ejercicio 9-->quitaPorDetras: Le quita a un número n dígitos por 
   * detrás (por la derecha).
   *
   *
   * @param x
   * @return Un numero con un digito menos por detras
   */
  public static int quitaPorDetras(int x) {
    int comodin=0;
    
    comodin = x/10;
    


    return comodin;

  }
  
  
  
}
