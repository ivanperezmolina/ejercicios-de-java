/**
 * Tema 7 --> Ejercicio 4
 * 
 * @author Luis José Sánchez
 */

public class Ejercicio04 {
  public static void main(String[] args) {
	  
	//Creo los tres arrays
	int[] numero = new int[20];
	int[] cuadrado = new int[20];
	int[] cubo = new int[20];
	///////////////////////
	
	//Para el array numeros hago un bucle que almacene datos aleatorios
	for(int i = 0; i <=19;i++){
		numero[i] = (int)(Math.random()*100);
		System.out.println("El numero generado en el hueco "+i+" es: "+numero[i]);
	}
	///////////////////////
	
	System.out.println("--------------------------------------------------------");
	
	//Para el array cuadrado cojo el array numeros 
	for(int j = 0; j <=19;j++){
		cuadrado[j] = numero[j]*numero[j];
		System.out.println("El cuadrado del numero del hueco "+j+" es: "+cuadrado[j]);
	}
	//////////////////////
	
	System.out.println("--------------------------------------------------------");
	
	//Para el array cubo cojo el array numeros 
	for(int k = 0; k <=19;k++){
		cubo[k] = numero[k]*numero[k]*numero[k];
		System.out.println("El cubo del numero del hueco "+k+" es: "+cuadrado[k]);
	}
	//////////////////////
	
	

  }
}
