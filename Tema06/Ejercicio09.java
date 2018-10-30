/**
 * Tema 6 Ejercicio 9
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("EJERCICIO 9 ");
    
    int espar = 0;
    
    do{
		int azar = (int)(Math.random()*101) ;
		System.out.println("Azar="+azar);
				
		if (azar%2==0){
			espar = azar;
			System.out.println("Par="+espar);
		}
	} 
	while (espar != 24);
	
    
	
	} 
  }


