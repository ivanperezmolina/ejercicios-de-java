package funciones;

import funciones.funcionesnumericas.FuncionesNumericas;



import java.util.Scanner;

/**
 *
 * @author Ivan Pérez Molina
 */
public class Ejemplo01 {

  public static void main(String[] args) {
    //UTILIZO FUNCION tiraDado
    System.out.println("Juego de la Oca Version 3.0");
    System.out.println("Dado 1: " + FuncionesNumericas.tiraDado());
    System.out.println("Dado 2: " + FuncionesNumericas.tiraDado());

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
      System.out.print(FuncionesNumericas.aleatorio(minimo, maximo) + "  ");
    }

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION voltea
    System.out.println("Voltea un numero");
    System.out.println("Introduzca un numero:");
    int num = Integer.parseInt(s.nextLine());
    System.out.println("Si le doy la vuelta a " + num + " me queda el numero " + FuncionesNumericas.voltea(num));

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION esCapicua
    System.out.println("¿Es capicua el numero?");
    System.out.println("Introduzca un numero:");
    int numeroIntroducido = Integer.parseInt(s.nextLine());

    if (FuncionesNumericas.esCapicua(numeroIntroducido)) {
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

    if (FuncionesNumericas.esPrimo(numeroIntroducidoParaPrimo)) {
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

    System.out.println("El siguiente primo de " + numeroIntroducidoParaSiguientePrimo + " es: " + FuncionesNumericas.siguientePrimo(numeroIntroducidoParaSiguientePrimo));

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION potencia
    System.out.println("Calcula la potencia");
    System.out.println("Introduzca la base:");
    int base = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca la exponente:");
    int exponente = Integer.parseInt(s.nextLine());

    System.out.println("El resultado de esta potencia es " + FuncionesNumericas.potencia(base, exponente));

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION digitos
    System.out.println("¿Cuantos dígitos tiene tu número?");
    System.out.println("Introduzca un numero para contar sus dígitos:");
    int numerodigitos = Integer.parseInt(s.nextLine());

    System.out.println("El número " + numerodigitos + " tiene " + FuncionesNumericas.digitos(numerodigitos) + " dígito/s");

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION juntaNumeros
    System.out.println("Unir dos numeros");
    System.out.println("Introduzca el primer numero");
    int numerounojuntar = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca el segundo numero");
    int numerodosjuntar = Integer.parseInt(s.nextLine());

    System.out.println("El número " + numerounojuntar + " unido al número " + numerodosjuntar + " nos da el numero " + FuncionesNumericas.juntaNumeros(numerounojuntar, numerodosjuntar));

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION pegaPorDetras
    System.out.println("Pega a tu numero otro por detras");
    System.out.println("Introduzca el numero original :");
    int numerooriginalparaunirendetras = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca el numero a unir ");
    int numeroaunirpordetras = Integer.parseInt(s.nextLine());

    System.out.println("Si cogemos el numero " + numerooriginalparaunirendetras + " y le añadimos por detras el número " + numeroaunirpordetras + " nos da el numero " + FuncionesNumericas.pegaPorDetras(numerooriginalparaunirendetras, numeroaunirpordetras));

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION pegaPorDelante
    System.out.println("Pega a tu numero otro por delante");
    System.out.println("Introduzca el numero original :");
    int numerooriginalparaunirendelante = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca el numero a unir ");
    int numeroaunirpordelante = Integer.parseInt(s.nextLine());

    System.out.println("Si cogemos el numero " + numerooriginalparaunirendelante + " y le añadimos por detras el número " + numeroaunirpordelante + " nos da el numero " + FuncionesNumericas.pegaPorDelante(numerooriginalparaunirendelante, numeroaunirpordelante));

    System.out.println("");
    System.out.println("-----------------");

    //UTILIZO FUNCION quitaPorDetras
    System.out.println("Le quito n digitos a tu numero por detras ");
    System.out.println("Introduzca el numero :");
    int numeroparaquitarpordetras = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca cuantos digitos quitar:");
    int aquitar = Integer.parseInt(s.nextLine());

    System.out.println("Si cogemos el numero " + numeroparaquitarpordetras + " y le quitamos "+aquitar+" digitos nos queda " + FuncionesNumericas.quitaPorDetras(numeroparaquitarpordetras,aquitar));

    System.out.println("");
    System.out.println("-----------------");


    //UTILIZO FUNCION quitaPorDelante
    System.out.println("Le quito n digitos a tu numero por delante ");
    System.out.println("Introduzca el numero :");
    int numeroparaquitarpordelante = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca cuantos digitos quitar:");
    int aquitarpordelante = Integer.parseInt(s.nextLine());

    System.out.println("Si cogemos el numero " + numeroparaquitarpordelante + " y le quitamos "+aquitarpordelante+" digitos nos queda " + FuncionesNumericas.quitaPorDelante(numeroparaquitarpordelante,aquitarpordelante));

    System.out.println("");
    System.out.println("-----------------");
    
    //UTILIZO FUNCION trozoDeNumero
    System.out.println("Te devuelvo un cacho de tu numero");
    System.out.println("Introduzca el numero :");
    int numeroentero = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca la posicion incial:");
    int posicionuno = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca la posicion final:");
    int posiciondos = Integer.parseInt(s.nextLine());

    System.out.println("El número que obtengo es "+FuncionesNumericas.trozoDeNumero(numeroentero,posicionuno,posiciondos));

    System.out.println("");
    System.out.println("-----------------");
    
        
    //UTILIZO FUNCION digitoN
    System.out.println("Te devuelvo una posición de un numero");
    System.out.println("Introduzca el numero :");
    int numeroenterodigitoN = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca la posicion que quieres saber:");
    int posicionasaber = Integer.parseInt(s.nextLine());


    System.out.println("El número que esta en la posición "+posicionasaber+" es el "+FuncionesNumericas.digitoN(numeroenterodigitoN, posicionasaber));

    System.out.println("");
    System.out.println("-----------------");
    
    
  }

 
}


