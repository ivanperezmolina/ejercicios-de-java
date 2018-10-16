/**
* Calcular si un número es primo o no
*
* @author Iván Pérez Molina
*/

public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL PROGRAMA PARA SABER SI UN NUMERO ES PRIMO ");
    
    //Pido el numero
    String linea;
    System.out.println("Introduce un número para comprobar ");
    linea = System.console().readLine();
    double numero;
    numero = Integer.parseInt( linea );
    
    //Voy haciendo las divisiones y viendo que si me sale 0 es porque eso es un divisor y tengo que añadirlo al contador
    int contador = 0;
    
    for (int i = 1 ; i <=numero; i++){
		  if((numero % i) == 0){
			  contador ++;
			   }		  
		 } 
		 
		 
	//Ya he contado los divisores de el numero, si los divisores son <= a 2 significa que ese número tiene como divisores:
	//A el mismo y a uno
	
		if(contador<=2){
			System.out.println ("El número es primo");
			} else {
			System.out.println ("El número no es primo");	
				}
				
				
				
	//Multiplos de 2
	for (int i=0; i<=100;i++){
	int resto;
    int numero1 = i;
    int numero2 = 2;
     
    resto = numero1%numero2;
     
    if (resto==0)
    
      System.out.println(numero1 + " es múltiplo de " + numero2);
    else
      System.out.println(numero1 + " NO es múltiplo de " + numero2);
      
      
     int restodetres;
    int numero1paratres = i;
    int numero2paratres = 3;
     
    resto = numero1%numero2;
     
    if (resto==0)
    
      System.out.println(numero1paratres + " es múltiplo de " + numero2paratres);
    else
      System.out.println(numero1paratres + " NO es múltiplo de " + numero2paratres);
      
      
      
  }
				
				
				
				

}
}


