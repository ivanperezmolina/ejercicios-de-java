/**
*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
*
* @author Iván Pérez Molina
*/

public class Ejercicio31 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL PROGRAMA");
    
    String linea;
    System.out.println("Introduzca la altura de la L");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt( linea );


	for (int contaraltura=1; contaraltura<altura; contaraltura++){
	System.out.println("*");
	}
	
	
	for (int palo =0; palo< (altura/2 +1); palo++){
	System.out.print("* ");
	}
}
}


