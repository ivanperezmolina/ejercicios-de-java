/**
 * Tema 6 Ejercicio 10
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("EJERCICIO 10 ");
    

		//Genero caracter
		int generarcaracter = (int)(Math.random()*6) ;
		
		String caracter = "";
		
		switch (generarcaracter){
		  case 0:
		  caracter = "@";
		  break;
		  
		  case 1:
		  caracter = "*";      
		  break;
		  
		  case 2:
		  caracter = "-";
		  break;
		  
		  case 3:
		  caracter = "=";
		  break;
		  
		  case 4:
		  caracter = ".";
		  break;
		  
		  case 5:
		  caracter = "|";
		  break;
		  
		  default:
		}
		/////////////////
		
		//Genero longitud
		int generarlongitud = (int)(Math.random()*40)+1 ;
		/////////////////

	    for (int i = 1; i <=10; i++){
			for (int j = 0; j<=generarlongitud; j++){
				System.out.print(caracter);
				}
		System.out.println("");
		}
		
	
	} 
  }


