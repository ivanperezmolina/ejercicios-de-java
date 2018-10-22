/**
Realiza un conversor del sistema decimal al sistema de “palotes”.
*
* @author Iván P
*/

public class Ejercicio37 {
  public static void main(String[] args) {

    //Pido las notas de los dos examenes
    String linea;
    System.out.print("Introduce un número: ");
    linea = System.console().readLine();
    int numero;
    numero = Integer.parseInt( linea );
    
    switch (numero){
          case 0:
          System.out.print("");
          break;
          
          case 1:
          System.out.print("|");
          break;
          
          case 2:
          System.out.print("| |");
          break;
          
          case 3:
          System.out.print("| | |");
          break;
          
          case 4:
          System.out.print("| | | | ");
          break;
          
          case 5:
          System.out.print("| | | | | ");
          break;
          
          case 6:
          System.out.print("| | | | | | ");
          break;
          
          case 7:
          System.out.print("| | | | | | | ");
          break;
          
          case 8:
          System.out.print("| | | | | | | | ");
          break;
          
          case 9: 
          System.out.print("| | | | | | | | | ");
          break;
      }
          
          
          }


    
     
  } 
