/**
 * Tema 6 Ejercicio 1
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("TIRADA DE TRES DADOS Y SUMA");
        
    int suma = 0;
    
    for (int i = 1; i <= 3; i++) {
      int azar = (int)(Math.random()*6) + 1;
      System.out.println("El dado "+i+" ha salido "+azar );
      suma = suma + azar;          
    }
    System.out.println("");
    
    System.out.println("La suma de los tres dados es: "+suma);
    
    System.out.println();
  
  
  
  }
}

