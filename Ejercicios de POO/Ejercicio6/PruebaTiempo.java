package Ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanp
 */
public class PruebaTiempo {

  public static void main(String[] args) {
    int opcion = 0;

    //Pido al usuario los tiempos
    int horas1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de horas del 1º tiempo"));
    int minutos1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de minutos del 1º tiempo"));
    int segundos1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de segundos del 1º tiempo"));

    int horas2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de horas del 2º tiempo"));
    int minutos2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de minutos del 2º tiempo"));
    int segundos2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de segundos del 2º tiempo"));

    //Paso para que me den los datos correctos
    if (segundos1 >= 60) {
      minutos1 = minutos1 + 1;
      segundos1 = segundos1 - 60;
    }

    if (minutos1 >= 60) {
      horas1 = horas1 + 1;
      minutos1 = minutos1 - 60;
    }

    if (segundos2 >= 60) {
      minutos2 = minutos2 + 1;
      segundos2 = segundos2 - 60;
    }

    if (minutos2 >= 60) {
      horas2 = horas2 + 1;
      minutos2 = minutos2 - 60;
    }

    Tiempo t1 = new Tiempo(horas1, minutos1, segundos1);
    Tiempo t2 = new Tiempo(horas2, minutos2, segundos2);

    System.out.println("Ejercicio 6: Tiempo");
    System.out.println("======================");
    System.out.println("La primera hora introducida es: " + t1);
    System.out.println("La segunda hora introducida es: " + t2);
    System.out.println("¿Que quiere hacer?");
    System.out.println("1. Sumar las horas ");
    System.out.println("2. Resta las horas ");
    System.out.println("3. Salir");

    System.out.println("------------------------------------------");

    while (opcion != 3) {
      opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:"));

      switch (opcion) {
        case 1:
          System.out.println("La suma de las horas es: " + t1.suma(t2));
          System.out.println("");
          break;

        case 2:
          System.out.println("La resta de las horas es: " + t1.resta(t2));
          System.out.println("");
          break;

        case 3:
          System.out.println("ADIOS!!");
          System.out.println("");
          break;

        default:
          System.out.println("Introduce una opcion valida");
          break;

      }
    }

  }
}
