/**
 * Tema 6 Ejercicio 16
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio16 {
  public static void main(String[] args) {
	
	//Figuras		  
		  
    int numeroFigura1 = (int)(Math.random()*5) + 1;
    int numeroFigura2 = (int)(Math.random()*5) + 1;
    int numeroFigura3 = (int)(Math.random()*5) + 1;
    
    String nombreFigura1="";
    String nombreFigura2="";
    String nombreFigura3="";
    
    switch(numeroFigura1) {
      case 1:
		nombreFigura1 = "corazon";
      break;
      
      case 2:
		nombreFigura1 = "diamante";      
      break;
      
      case 3:
		nombreFigura1 = "herradura";
      break;
      
      case 4:
		nombreFigura1 = "campana";
      break;
      
      case 5:
		nombreFigura1= "limon";
      break;
      
      default:
		}
		
		
	  switch(numeroFigura2) {
      case 1:
		nombreFigura2 = "corazon";
      break;
      
      case 2:
		nombreFigura2 = "diamante";      
      break;
      
      case 3:
		nombreFigura2 = "herradura";
      break;
      
      case 4:
		nombreFigura2 = "campana";
      break;
      
      case 5:
		nombreFigura2= "limon";
      break;
      
      default:
		}
		
		
	  switch(numeroFigura3) {
      case 1:
		nombreFigura3 = "corazon";
      break;
      
      case 2:
		nombreFigura3 = "diamante";      
      break;
      
      case 3:
		nombreFigura3 = "herradura";
      break;
      
      case 4:
		nombreFigura3 = "campana";
      break;
      
      case 5:
		nombreFigura3= "limon";
      break;
      
      default:
		}
		
    System.out.println(nombreFigura1+"    "+nombreFigura2+"    "+nombreFigura3);
    System.out.println("--------------------------------------");

    
    
    
    //Comprueblo
    if ((numeroFigura1 != numeroFigura2)&&(numeroFigura1!= numeroFigura3)&&(numeroFigura2 != numeroFigura3)){
		System.out.println("Lo siento, ha perdido");		
		}
    ///////////
    
     
  }
}


