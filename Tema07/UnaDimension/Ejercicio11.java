/**
 * Tema 7 --> Ejercicio 11
 * 
 * @author Iván Pérez Molina
 */

public class Ejercicio11 {
  public static void main(String[] args) {
	  
		//Creo el array
		
		int[] miArray = new int[10];
		int[] miArrayPrimo = new int [10];
		
		//Lee los datos
		
		for(int i = 0; i<=9;i++){
			System.out.print("Introduce un numero: ");
			String linea = System.console().readLine();		
			miArray[i]= Integer.parseInt( linea ); 		
			
		}
		System.out.println("-----------------------");
		
		System.out.print("Indice original : ");
		for(int i = 0; i<=9;i++){
			System.out.printf("|%3d ", i);
		}
		
		System.out.println("  ");			
		System.out.print("Valor original:   ");
		
		for(int i = 0; i<=9;i++){
			System.out.printf("|%3d ", miArray[i]);
		}
		
		System.out.println("  ");
		System.out.println("  ");
		
		//Averiguo si el numero es primo y lo meto en un array
		int contador = 0;
		
		for(int i = 0; i<=9;i++){
		for(int j = 1; j <= miArray[i]; j++){
            if((miArray[i] % j) == 0){
               contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
            miArrayPrimo[i]=miArray[i];
        }else{
            System.out.println("El numero no es primo");
        }
	}
	
	System.out.print("Indice nuevo : ");
		for(int i = 0; i<=9;i++){
			System.out.printf("|%3d ", i);
		}
		
		System.out.println("  ");			
		System.out.print("Valor nuevo:   ");
		
		for(int i = 0; i<=9;i++){
			System.out.printf("|%3d ", miArrayPrimo[i]);
		}
		
		System.out.println("  ");
		System.out.println("  ");
		

  }
}
