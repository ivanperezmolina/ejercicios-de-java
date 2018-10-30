/**
 * Tema 6 Ejercicio 8
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("EJERCICIO 8 ");
    //Pensar numero     
    int azar = (int)(Math.random()*100) ;
    ///////////////
    
    for (int i = 5; i >= 0; i--) {
		//Pido un numero
		String linea;
		System.out.println("Introduce el numero: ");
		linea = System.console().readLine();
		int numero;
		numero= Integer.parseInt( linea );
		////////////////
		
		
		
		if(numero==azar){
			System.out.println("Enhorabuena, has acertado");
			break;
		} else{
			System.out.println("Te quedan "+i+" intento(s)");	
			
			if(numero<azar){
				System.out.println("El numero pensado es mayor");
				} else{
				System.out.println("El numero pensado es menor");
					}					
			}	
	} 
  }
}

