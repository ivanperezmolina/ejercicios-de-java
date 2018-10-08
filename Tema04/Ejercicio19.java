/**
* Ejercicio que me dice las cifras del número
*
* @author Iván Pérez Molina
*/

public class Ejercicio19 {
  public static void main(String[] args) {

    //Pedir el valor del numero
    System.out.println("BINVENIDO AL PROGRAMA PARA MOSTRAR CUANTOS DIGITOS TIENE SU NUMERO");
    System.out.println("EL NUMERO MAXIMO A RESOLVER ES DE 5 CIFRAS");
    String linea;
    System.out.println("Introduce el numero: ");
    linea = System.console().readLine();
    int n;
     n= Integer.parseInt( linea );
     
     //Por si me introducen numeros negativos. Hago un if multiplicando por *0
     if (n < 0){
       n = (n * (-1));
     }
     
     //Creo una variable para los digitos
     int digitos;
     
    
    
    //Vamos comparando los valores para decir el primero
      if ((n < 10)){
        digitos=1;
        System.out.println("Su número tiene " +digitos+ " digitos");    
      } else if (n < 100){
        digitos=2;
        System.out.println("Su número tiene " +digitos+ " digitos");
      } else if (n < 1000) {
        digitos=3;
        System.out.println("Su número tiene " +digitos+ " digitos");
      } else if (n < 10000){
        digitos=4;
        System.out.println("Su número tiene " +digitos+ " digitos");
      } else if (n < 100000) {
        digitos=5;
        System.out.println("Su número tiene " +digitos+ " digitos");
      } else {                                        
        System.out.println("INTRODUCE UN NUMERO VALIDO ");                              
        }
        
        
  }
}















