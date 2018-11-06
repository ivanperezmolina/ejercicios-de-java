/**
 * Tema 7 --> Ejercicio 3
 * 
 * @author Luis José Sánchez
 */

public class Ejercicio03 {
  public static void main(String[] args) {
	  
	//Pido numeros
	
	int[] miarray = new int[10];
	
	for(int i = 0; i<=9;i++){
		String linea;
		System.out.println("Introduce el numero ");
		linea = System.console().readLine();		
		miarray[i]= Integer.parseInt( linea ); 		
		
	}
	System.out.println("-----------------------");
	
	for(int j = 9; j>=0;j--){
		System.out.println("En el hueco "+j+" tengo el numero "+miarray[j]);
	}
    /////////////////

  }
}
