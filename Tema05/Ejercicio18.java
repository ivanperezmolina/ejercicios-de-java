/**
*	Programa que obtenga los números enteros comprendidos entre
	dos números introducidos por teclado y validados como distintos, el programa
	debe empezar por el menor de los enteros introducidos e ir incrementando de
	7 en 7.
*
* @author Iván Pérez Molina
*/

public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL PROGRAMA PARA OBTENER LOS NUMEROS COMPRENDIDOS ");
    
    //Pido el primer numero
    String linea;
    System.out.println("Introduce el primer numero ");
    System.out.println("............................");
    linea = System.console().readLine();
    int primernumero;
    primernumero = Integer.parseInt( linea );
    
    //Pido el segundo numero
    String lineados;
    System.out.println("Introduce el segundo numero ");
    System.out.println("............................");
    lineados = System.console().readLine();
    int segundonumero;
    segundonumero = Integer.parseInt( lineados );
    
    //Comprueblo que los numero sean distintos
    if (primernumero==segundonumero){
		System.out.println("Introduce numeros distintos!");
		System.out.println("............................");
		}
    
    //Si el primer numero es mayor que el segundo los intercambio
    if (primernumero > segundonumero){
		int comodin = 0;
		comodin = primernumero;
		primernumero = segundonumero;
		segundonumero = comodin;
		}	
		
	//Calculos los numeros
		for (int i = primernumero; i <= segundonumero; i=i+7){
			 System.out.println("----");
			 System.out.println(i );
			}
	

		
		
    

}
}


