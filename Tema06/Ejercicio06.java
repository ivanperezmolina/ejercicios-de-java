/**
 * Tema 6 Ejercicio 6
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("EJERCICIO 6 ");
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
		
		//Para no hacer uso de un break habria que utilizar un do while por ejemplo
		
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
	//Decir el numero secreto
	if (numero != azar){
		System.out.println("El numero que estaba pensando era: "+azar);
		}
	
	/////////////////////////
  }
}

