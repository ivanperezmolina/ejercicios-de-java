/**
 * Tema 07 --> Ejercicio 1
 * 
 * @author Iván Pérez Molina
 */

public class Ejercicio01 {
  public static void main(String[] args) {
	  
    //Defino el array 
	int[] num; 
    /////////////////
    
    //Reservo espacios en el array
	num = new int[11]; 
    /////////////////
    
    //Defino los huecos del array
	num[0] = 39;
	num[1] = -2;
	num[4] = 0;
	num[6] = 14;
	num[8] = 5;
	num[9] = 120;		
    /////////////////
    
    //Muestro por pantalla utilizando un bucle for
	for(int i = 0 ; i < 11; i++){
		System.out.print(num[i]+"  ");
	}
    /////////////////

  }
}
