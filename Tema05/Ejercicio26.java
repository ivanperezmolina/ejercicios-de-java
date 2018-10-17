/**
Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.
 * 
 * @author Iván Pérez Molina
 */
 
 import java.util.Scanner;
public class Ejercicio26 {

  public static void main(String[] args) {
	  
    System.out.println("BIENVENIDO AL PROGRAMA PARA VOLTEAR EL NÚMERO");
	
	Scanner s = new Scanner (System.in);
	
	//Pido el número
	System.out.println("Por favor, introduzca un número.");
 	int numeroIntroducido = Integer.parseInt(s.nextLine());
 	
 	//Pido el dí
 	
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
  

