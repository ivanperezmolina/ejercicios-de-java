/**
Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero.
 * 
 * @author Iván Pérez Molina
 */
 
import java.util.Scanner;
public class Ejercicio30 {

	public static void main(String[] args) {
	  
		System.out.println("BIENVENIDO AL PROGRAMA PARA CALCULAR EL FACTORIAL DE UN NUMERO");
		
		Scanner s = new Scanner (System.in);
		
		//Pido el número
		System.out.print("Por favor, introduzca un número: ");
		int numero = Integer.parseInt(s.nextLine());
		
		System.out.println("Has introducido el número: " +numero);
		System.out.println("---------------------------------------");
    
    //Calculo el factorial
    int factorial = 0;
    
    while (numero!=2){
      factorial = factorial*numero;
      numero--;
      System.out.println("Numero vale: "+numero);
      System.out.println("El factorial es: "+factorial);
      }
      
    System.out.println("El factorial es: "+factorial);
    System.out.println("NUmero vale: "+numero);

	} 
}
  

