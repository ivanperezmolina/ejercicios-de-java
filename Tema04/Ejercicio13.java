/**
* Ejercicio que me ordena los numeros de menor a mayor
*
* @author Iván Pérez Molina
*/

public class Ejercicio13 {
  public static void main(String[] args) {

    //Pedir los valores de los tres numeros
    System.out.println("BINVENIDO AL PROGRAMA PARA ORDENAR SUS TRES NUMEROS DE MENOR A MAYOR");
    //System.out.println("PORFAVOR, NO REPITAS LOS NUMEROS");
    String linea;
    System.out.println("Introduce el primer numero: ");
    linea = System.console().readLine();
    int a;
    a = Integer.parseInt( linea );
    
    String lineados;
    System.out.println("Introduce el segundo numero: ");
    lineados = System.console().readLine();
    int b;
    b = Integer.parseInt( lineados );
        
    String lineatres;
    System.out.println("Introduce el tercer numero: ");
    lineatres = System.console().readLine();
    int c;
    c = Integer.parseInt( lineatres );
    
    //Vamos comparando los valores para hacer el orden
      if ((a >= b) && (a >= c) && (b >= c)){
        System.out.println("He ordenado los numeros y:  ");
        System.out.println("El primer valor es el: " + a );
        System.out.println("El segundo valor es el: " + b);
        System.out.println("El tercer valor es el: " + c );
      
      } else { if ((b >= a) && (b >= c) && (a >= c)){
               System.out.println("He ordenado los numeros y:  ");
               System.out.println("El primer valor es el: " + b );
               System.out.println("El segundo valor es el: " + a);
               System.out.println("El tercer valor es el: " + c );
             } else { if ((c >= a) && (c >= b) && (a >= b)) {
                          System.out.println("He ordenado los numeros y:  ");
                          System.out.println("El primer valor es el: " + c );
                          System.out.println("El segundo valor es el: " + a);
                          System.out.println("El tercer valor es el: " + b );
                      } else { if ((c >= a) && (c >= b) && (b >= a)){
                                  System.out.println("He ordenado los numeros y:  ");
                                  System.out.println("El primer valor es el: " + c );
                                  System.out.println("El segundo valor es el: " + b);
                                  System.out.println("El tercer valor es el: " + a );
                              } else { if ((a >= c) && (a >= b) && (c >= b)) {
                                        System.out.println("He ordenado los numeros y:  ");
                                        System.out.println("El primer valor es el: " + a );
                                        System.out.println("El segundo valor es el: " + c);
                                        System.out.println("El tercer valor es el: " + b );
                                      } else { if ((b >= a) && (b >= a) && (c >= a)) {
                                                System.out.println("He ordenado los numeros y:  ");
                                                System.out.println("El primer valor es el: " + b );
                                                System.out.println("El segundo valor es el: " + c);
                                                System.out.println("El tercer valor es el: " + a );
                                              }
                                        
                                        
                                        
                                        
                                        }
                                }
                        }
               }
        }
  }
}















