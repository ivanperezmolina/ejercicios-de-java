/**
 * Tema 6 Ejercicio 12
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Codigo Ascii");   
    
    
    for(int i=0; i<80000;i++){
	//Para almacenarlo en una variable hay que crearlo con un String
	
	System.out.print((char)(Math.random()*(126 - 32 + 1) + 32));
	
	}
	
  }
}

