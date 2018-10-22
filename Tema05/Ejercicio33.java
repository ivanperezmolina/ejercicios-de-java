/**
Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
*
* @author Iván Pérez Molina
*/

public class Ejercicio33 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL PROGRAMA");
    
    String linea;
    System.out.println("Introduzca la altura de la U");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt( linea );


	for (int contaraltura=1; contaraltura<altura; contaraltura++){
	System.out.println("*      *");
	
	}
	
	
	for (int palo =0; palo< (altura/2 -1); palo++){
	System.out.print("  *");
	}
}
}


