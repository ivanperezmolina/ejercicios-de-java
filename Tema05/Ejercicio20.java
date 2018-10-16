/**
*	Realiza un programa que pinte una pirámide por pantalla. La altura se debe
	pedir por teclado. El carácter con el que se pinta la pirámide también se debe
	pedir por teclado.
*
* @author Iván Pérez Molina
*/

public class Ejercicio20 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL PROGRAMA PINTAPIRAMIDE.EXE ");
    
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduza la altura de la piramide");     
    int h = Interger.parseInt(s.nextLine());
    int espacios = h;
    
    for (int pisos = 0; pisos  < h; pisos++){ 
				for (int e=0; e< espacios;e++){
					System.out.print(" ");
				}
		
		System.out.println("**"); 
    
		espacios--;
	}
	
	
	
	
}
    
    
}



