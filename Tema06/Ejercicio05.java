/**
 * Tema 6 Ejercicio 5
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("EJERCICIO 5 ");
        
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int media = 0;
    
    for (int i = 1; i <= 50; i++) {
      int azar = (int)(Math.random()*100)+100 ;
      System.out.print(azar+"  ");
      
      //MÁXIMO
      if(azar>maximo){
          maximo=azar;
      }

      //MÍNIMO
      if(azar<minimo){
          minimo=azar;
      }
      
      //MEDIA
      suma = suma + azar;
      media = suma / 50;
    }
    
    

    System.out.println("");
    System.out.println("El máximo de los números es el: "+maximo);
    System.out.println("El mínimo de los números es el: "+minimo);
    System.out.println("La media de los números es de: "+media);
  
  
  
  }
}

