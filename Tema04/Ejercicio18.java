/**
* Ejercicio que me dice la primera cifra del numero
*
* @author Iván Pérez Molina
*/

public class Ejercicio18 {
  public static void main(String[] args) {

    //Pedir el valor del numero
    System.out.println("BINVENIDO AL PROGRAMA PARA MOSTRAR LA PRIMERA CIFRA");
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
    
    
    //Vamos comparando los valores para decir el primero
      if ((n < 10)){
        System.out.println("La primera cifra de su numero es: ");
        System.out.println(n);      
      } else if (n < 100){
        System.out.println("La primera cifra de su numero es: ");
        System.out.println(n/10);        
      } else if (n < 1000) {
        System.out.println("La primera cifra de su numero es: ");
        System.out.println(n/100);
      } else if (n < 10000){
        System.out.println("La primera cifra de su numero es: ");
        System.out.println(n/1000);
      } else if (n < 100000) {
        System.out.println("La primera cifra de su numero es: ");
        System.out.println(n/10000);
      } else {                                        
        System.out.println("INTRODUCE UN NUMERO VALIDO ");                              
        }
  }
}















