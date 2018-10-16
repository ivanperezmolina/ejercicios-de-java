/**
* Indentificar numeros negativos y positivos
*
* @author Iván Pérez Molina
*/

public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL PROGRAMA PARA IDENTIFICAR + Y -");
    
    //Hago un for para que repita la acción de repetir que introduzca un numero
    
    for (int i = 1; i < 11; i++){
	String linea;
    System.out.println("Introduce un número para saber si es positivo o negativo ");
    linea = System.console().readLine();
    i= Integer.parseInt( linea );
    //System.out.println(i);
		if (i > 0){
			System.out.println("Su número es positivo ");
			} else if (i<0){
				System.out.println("Su número es negativo ");
				} else if (i==0){
					System.out.println("Su número no es negativo ni positivo; es 0 ");
					}
		}
   
}
}


