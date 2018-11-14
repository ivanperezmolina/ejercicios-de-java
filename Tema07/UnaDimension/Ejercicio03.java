/**
 * Tema 7 --> Ejercicio 3
 * 
 * @author Luis José Sánchez
 */

public class Ejercicio03 {
  public static void main(String[] args) {
	  
	//Creo los tres arrays
	
	int[] miArray = new int[11];
	
	for(int i = 0; i<=10;i++){
		String linea;
    int auxiliar = i+1;
		System.out.println("Introduce la temperatura del "+auxiliar+"º mes: ");
		linea = System.console().readLine();		
		miArray[i]= Integer.parseInt( linea ); 		
		
	}

  }
}
