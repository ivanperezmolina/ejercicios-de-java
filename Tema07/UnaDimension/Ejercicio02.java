/**
 * Tema 7 --> Ejercicio 2
 * 
 * @author Luis José Sánchez
 */

public class Ejercicio02 {
  public static void main(String[] args) {
	  
	//Defino el array 
	char[] simbolo; 
    /////////////////
    
    //Reservo espacios en el array
	simbolo = new char[9]; 
    /////////////////
      
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = '.';
    simbolo[7] = '.';
    simbolo[8] = 'Q';
    
    System.out.println("El array caracter contiene los siguientes elementos:");
    
    for (int i = 0; i < 9; i++) {
      System.out.println(simbolo[i]);
    }
  }
}
