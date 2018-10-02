/**
* Ejercicio 8
*
* @author Iván Pérez Molina
*/

public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO; ESTO ES EL CALCULADOR DE MEDIAS DE LAS NOTAS DEL CURSO ");
    String linea;
    System.out.print("Por favor, introduce que sacaste en el primer examen");
    linea = System.console().readLine();
    double primeraNota;
    primeraNota = Double.parseDouble( linea );
    
    String linea2;
    System.out.print("Por favor, introduce que sacaste en el segundo examen");
    linea2 = System.console().readLine();
    double segundaNota;
    segundaNota = Double.parseDouble( linea2 );
    
    String linea3;
    System.out.print("Por favor, introduce que sacaste en el tercer examen");
    linea3 = System.console().readLine();
    double terceraNota;
    terceraNota = Double.parseDouble( linea3 );
    

    double total;
    total = (primeraNota + segundaNota + terceraNota) / 3;

    
    System.out.print("La media de tus notas es un: " + total);
    
    if (total <5) {
      System.out.print("No has estudiado lo suficiente. NO ENTRAS EN LA UNIVERSIDAD");
      }
      else  if (total ){}
     
    }
  } 

