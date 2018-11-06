/**
 * Tema 6 Ejercicio 19
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio19 {
  public static void main(String[] args) {
	  
	for(int i = 1; i <= 50; i++){ 
	  
	int azar = (int)(Math.random()*300) + (-100);
	
	int maxpares = 0;
	int minimpares = 0;
	
	if (azar%2==0){
	maxpares=maxpares+azar;	
	}else{
	minimpares=minimpares+azar;
	}
	
	System.out.print(azar+"   ");
	System.out.println(maxpares);
	System.out.println(minimpares);
	
	}
  }
}

