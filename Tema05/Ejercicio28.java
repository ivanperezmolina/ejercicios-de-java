/**
Escribe un programa que calcule el factorial de un número entero leído por
teclado.
 * 
 * @author Iván Pérez Molina
 */
 
import java.util.Scanner;
public class Ejercicio28 {

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
      factorial = numero* (numero-1);
      numero--;
      System.out.println("Numero vale: "+numero);
      System.out.println("El factorial es: "+factorial);
      }
      
    System.out.println("El factorial es: "+factorial);
    System.out.println("NUmero vale: "+numero);

	} 
}
  

