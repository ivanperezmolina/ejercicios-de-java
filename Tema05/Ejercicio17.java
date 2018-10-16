/**
* Sume los 100 números siguientes a un número entero y positivo introducido por teclado.
*
* @author Iván Pérez Molina
*/

public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL PROGRAMA PARA SUMAR LOS 100 NUMEROS SIGUIENTES A TU NUMERO ");
    
    //Pido el numero
    String linea;
    System.out.println("Introduce un número para comprobar ");
    linea = System.console().readLine();
    double numero;
    numero = Integer.parseInt( linea );
    
    //Compruebo que el número es positivo
    if (numero < 0){
		System.out.println ("El número debe ser mayor que 0 ");
		}	
	
	
	double comodin = numero + 100;
	
	for (double i = numero; i<comodin; i++){
		
		//System.out.println(i);
		
		double suma = 1;
		suma=suma+i;
		
		System.out.println(suma);
		

		
		
		}
		
		
    

}
}


