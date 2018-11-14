/**
 * Tema 7 --> Ejercicio 7
 * 
 * @author Luis José Sánchez
 */

public class Ejercicio07 {
  public static void main(String[] args) {
	  
	//Creo el array
	int[] miArray = new int[100];

	
	//Para el array  hago un bucle que almacene datos aleatorios
	for(int i = 0; i <=99;i++){
		miArray[i] = (int)(Math.random()*20);
		System.out.print(+miArray[i]+"  ");
	}
	System.out.println("");
	System.out.println("");
		
		//Pido el primer valor
		String linea;
		System.out.print("Introduce el numero a buscar: " );
		linea = System.console().readLine();
		int numero1;
		numero1 = Integer.parseInt( linea );
		
		//Pido el segundo valor
		String linea2;
		System.out.print("Introduce el numero por el que lo sustituyo: ");
		linea2 = System.console().readLine();
		int numero2;
		numero2 = Integer.parseInt( linea2 );
			
		System.out.println("-----------------------");
		
	//Conversion
	for(int i = 0; i <=99;i++){
		if(miArray[i]==numero1){
			miArray[i]= numero2;			
			System.out.print("\"" + miArray[i] + "\"  ");
		} else {
			System.out.print(miArray[i] + "  ");
			}
	}	
	
  }
}
