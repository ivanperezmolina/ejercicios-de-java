/**
Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
 * 
 * @author Iván Pérez Molina
 */
 
 import java.util.Scanner;
public class Ejercicio25 {

  public static void main(String[] args) {
	  
    System.out.println("BIENVENIDO AL PROGRAMA PARA VOLTEAR EL NÚMERO");
	
	Scanner s = new Scanner (System.in);
	
	//Pido el número
	System.out.println("Por favor, introduzca un número.");
 	int numeroIntroducido = Integer.parseInt(s.nextLine());
 	
 	int numeroFinal = 0;
 	int ultimoNumero = 0;
 	int mul10 = 0;
 	
 	while (numeroIntroducido > 0 ){
		//Calculo la ultima cifra
		ultimoNumero = numeroIntroducido % 10;
		//System.out.print("d" + ultimoNumero);

		//El numero que me queda
		numeroFinal= numeroFinal * 10 + ultimoNumero; 
		
		//Decrecer
		numeroIntroducido=numeroIntroducido/10;		
	}
 	
 	System.out.println(numeroFinal);
 } 
  
 }
  

