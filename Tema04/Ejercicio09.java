/**
* Ejercicio 9
*
* @author Iván Pérez Molina
*/

public class Ejercicio09 {
  public static void main(String[] args) {

    String linea;
    System.out.println("BINVENIDO AL PROGRAMA PARA CONSULTAR SU HOROSCOPO");
    System.out.println("Introduce el día en el que naciste: ");
    linea = System.console().readLine();
    int dia;
    dia = Integer.parseInt( linea );
    
    String lineados;
    System.out.print("Introduce el valor de b:");
    lineados = System.console().readLine();
    double b;
    b = Double.parseDouble( lineados );
    
    String lineatres;
    System.out.print("Introduce el valor de c:");
    lineatres = System.console().readLine();
    double c;
    c = Double.parseDouble( lineatres );

    if (a == 0.0){
      System.out.print("ERROR FATAL!");
    }
    
    else {
    double total1;
    total1 = (-b + Math.sqrt ((b*b)-(4*a*c))) / 2*a ;
    
    double total2;
    total2 = (-b - Math.sqrt ((b*b)-(4*a*c))) / 2*a ;

    System.out.println("El primer número introducido es " + a);
    System.out.println("El segundo numero introducido es  " + b);
    System.out.println("El tercer numero introducido es  " + c);
    System.out.println("El resultado de su operacion al hacer la formula en positivo es  :" + total1);
    System.out.println("El resultado de su operacion al hacer la formula en negativo es  :" + total2);
    }
  } 
}
