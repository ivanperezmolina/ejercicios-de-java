
package Ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanp
 */
public class PruebaOperacion {

  public static void main(String[] args) {
   int opcion=0;
    //Pido numeros
    int numerador = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numerador"));
    int denominador = Integer.parseInt(JOptionPane.showInputDialog("Introduce el demominador"));
    
    //Creo objeto
    Fraccion op = new Fraccion();



    
    //MENU
    System.out.println("FRACCIÓN");
    System.out.println("==========");
    System.out.println("La fraccion es: "+numerador+"/"+denominador);
    System.out.println("¿Que quiere hacer?");
    System.out.println("1. Invertir");
    System.out.println("2. Simplificar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("5. Salir");
    
        while (opcion != 8) {
      opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:"));

      switch (opcion) {
        case 1:
          System.out.println("Si invierto la fracción me queda: "+op.invierte(numerador,denominador));
          System.out.println("");          
          break;
          
        case 2:
          System.out.println("?????");
          break;
          
        case 3:
          int numeroMultiplicar=Integer.parseInt(JOptionPane.showInputDialog("Elige un numero para multiplicar"));
          
    
   // 
      }
        }
  }
}

