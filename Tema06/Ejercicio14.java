/**
 * Tema 6 Ejercicio 14
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("EJERCICIO 14 ");
    
    int intervalo = 101;
    int minumero = 18;
    
    for (int i = 5; i >= 0; i--){
    
    //Hago que el sistema piense un número y lo muestre por pantalla
		int numpensado = (int)(Math.random()*intervalo) ;
		System.out.println("He pensado el numero "+numpensado );
    //////////////////////////////////////
    
    //El sistema me pregunta si el número es mayor o menor
		System.out.println("¿Tu numero es mayor o menor?");
		System.out.println("Responde con un + o -");
    //////////////////////////////////////
    
    //Le digo si es mayor o menor
		if (numpensado < minumero){
			System.out.println("El numero es mas grande");
		} else if(numpensado > minumero){
			System.out.println("El numero es mas pequeno");
			} else if (numpensado == minumero){
				System.out.println("Has acertado!!!");
			}
    //////////////////////////////////////
    
    
    
    
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

