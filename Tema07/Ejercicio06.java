/**
 * Tema 7 --> Ejercicio 6
 * 
 * @author Iván Pérez Molina
 */

public class Ejercicio06 {
  public static void main(String[] args) {
	  
		//Creo el array
		
		int[] miArray = new int[15];
		
		//Lee los datos
		
		for(int i = 0; i<=14;i++){
			System.out.print("Introduce un numero: ");
			String linea = System.console().readLine();		
			miArray[i]= Integer.parseInt( linea ); 		
			
		}
		System.out.println("-----------------------");
		
		System.out.print("Indice original : ");
		for(int i = 0; i<=14;i++){
			System.out.printf("|%3d ", i);
		}
		
		System.out.println("  ");			
		System.out.print("Valor original:   ");
		
		for(int i = 0; i<=14;i++){
			System.out.printf("|%3d ", miArray[i]);
		}
		
		System.out.println("  ");
		System.out.println("  ");
		
		//Guardo el ultimo valor
		int guardado = miArray[14];
		
		
		//Convierto el array de la posición a en la posicion a+1
		for(int i=14;i>=1;i--){
			miArray[i]=miArray[i-1];
		}
				
		//Muestro los resultados	
		//Antes aclaro que el miArray[0] es el guardado
		miArray[0] = guardado;			
		
		
		System.out.print("Indice : ");
		for(int i = 0; i<=14;i++){
			System.out.printf("|%3d ", i);
				
		}
		System.out.println("  ");			
		System.out.print("Valor:   ");		
		for(int i = 0; i<=14;i++){
			System.out.printf("|%3d ", miArray[i]);
		}
  }
}
