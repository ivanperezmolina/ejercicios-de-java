/**
*	Realiza un programa que vaya pidiendo números hasta que se introduzca un
	numero negativo y nos diga cuantos números se han introducido, la media de
	los impares y el mayor de los pares. El número negativo sólo se utiliza para
	indicar el final de la introducción de datos pero no se incluye en el cómputo
*
* @author Iván Pérez Molina
*/

public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL PROGRAMA");
    
    System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
	System.out.println("Para terminar, introduzca un número negativo.");

	
	int numeroIntroducido = 0;
	int cuentaNumeros = 0;
	int suma = 0;
	
	
	
	while (numeroIntroducido >= 0) {
	numeroIntroducido = Integer.parseInt(System.console().readLine());
	
	int contadorpares = 0;
	int contadorimpares = 0;
	
	if (numeroIntroducido % 2 == 0) {
	System.out.println("PAR");
	contadorpares++;
	} else {
	System.out.println("IMPAR");
	contadorimpares++;
	}

	

	
	cuentaNumeros++; // Incrementa en uno la variable
	
	}
	System.out.println("Has introducido " + (cuentaNumeros - 1) + " números positivos.");
	

		


    
    //CALCULAR LOS NUMEROS IMPARES

	

}
}


