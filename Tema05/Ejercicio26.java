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
	  
		System.out.println("BIENVENIDO AL PROGRAMA PARA ENCONTRAR SU DIGITO EN UN NUMERO");
		
		Scanner s = new Scanner (System.in);
		
		//Pido el número
		System.out.print("Por favor, introduzca un número: ");
		int numero = Integer.parseInt(s.nextLine());
		
		//Pido el dígito
		System.out.print("Por favor, introduzca el dígito para buscar: ");
		int digito = Integer.parseInt(s.nextLine());
		
		System.out.println("Has introducido el número: " +numero);
		System.out.println("En ese numero buscas el digito "+digito);
		System.out.println("---------------------------------------");
		
		//Utilizo el ejercicio 25 para girar el numero
		 	int numeroFinal = 0;
			int ultimoNumero = 0;
			int mul10 = 0;
			
			while (numero > 0 ){
				//Calculo la ultima cifra
				ultimoNumero = numero % 10;
				//System.out.print("d" + ultimoNumero);

				//El numero que me queda
				numeroFinal= numeroFinal * 10 + ultimoNumero; 
				
				//Decrecer
				numero=numero/10;		
			}
			
			System.out.println("El numero girado resulta ser: "+numeroFinal);
				
        
        
      //Voy sacando la ultima cifra del nuevo numero y comprobando cada vez.
      int FinPrograma = 0;
      int ultimoNumeroCaso2 = 0;
      int contador = 0;
      
      while (numeroFinal > 0){
        ultimoNumeroCaso2 = numeroFinal % 10;
        numeroFinal=numeroFinal/10;
        contador++;
        if (ultimoNumeroCaso2 == digito){
            System.out.println("Encontrado en la posición " + contador);
          } else {
            System.out.println("No encontrado en la posición "+contador);
            }
        }
	} 
}
  

