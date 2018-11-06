/**
 * Tema 6 Ejercicio 13
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Ejercicio 13");
    
    int azar1 = 0;
    int azar2 = 0;
    
    do{   
    azar1 = (int)(Math.random()*6) + 1;
	azar2 = (int)(Math.random()*6) + 1;
	
	System.out.println("El dado 1 ha obtenido "+azar1);
	System.out.println("El dado 2 ha obtenido "+azar2);
	System.out.println("----------------------------");
	}
	while(azar1 != azar2);
    

  }
}

