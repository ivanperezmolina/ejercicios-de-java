/**
Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
 * 
 * @author Iván Pérez Molina
 */
 
 import java.util.Scanner;
public class Ejercicio23 {

  public static void main(String[] args) {
	  
    System.out.println("BIENVENIDO AL PROGRAMA");
	
	Scanner s = new Scanner (System.in);
	
	System.out.println("Por favor, introduzca una serie de números.");
    System.out.println("Para deternelo introduzca un numero negativo");
    
    int cuentaNumeros = 0;
    int suma = 0;
    int media = 0;
    
    do {
	//Pido numeros
	int numeroIntroducido = Integer.parseInt(s.nextLine());

  
	//Sumo los numeros
    suma+=numeroIntroducido;
    
    //Cuento los numeros
    cuentaNumeros++;
    
    //Hago la media
    media = suma / cuentaNumeros;
    
    } while (suma < 100);
    
    System.out.println("Has llegado al límite.");
    System.out.println("Has introducido " +cuentaNumeros);
    System.out.println("La suma de esos " + cuentaNumeros + " numeros es igual a " +suma);
    System.out.println("La media resultante es igual a: " + media);
 } 
  
 }
  

