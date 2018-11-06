/**
 * Tema 6 Ejercicio 18
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio18 {
  public static void main(String[] args) {
	  
	   do {
      numerocolor1 = (int)(Math.random() * 6)+1;
      numerocolor2 = (int)(Math.random() * 6)+1;
      numerocolor3 = (int)(Math.random() * 6)+1;
    } while ((numerocolor1 == numerocolor2) || (numerocolor1 == numerocolor3) || (numerocolor2 == numerocolor3));
    
	//1    
    String nombreColor1="";
    
    switch(numeroColor1) {
      case 1:
		nombreColor1 = "Rojo";
      break;
      
      case 2:
		nombreColor1 = "Azul";      
      break;
      
      case 3:
		nombreColor1 = "Verde";
      break;
      
      case 4:
		nombreColor1 = "Amarillo";
      break;
      
      case 5:
		nombreColor1 = "Violeta";
      break;
      
      case 6:
		nombreColor1 = "Naraja";
      break;
      
      default:
    }
    
    
    
    
    //2
   
    String nombreColor2="";
    
    switch(numeroColor2) {
      case 1:
		nombreColor2 = "Rojo";
      break;
      
      case 2:
		nombreColor2 = "Azul";      
      break;
      
      case 3:
		nombreColor2 = "Verde";
      break;
      
      case 4:
		nombreColor2 = "Amarillo";
      break;
      
      case 5:
		nombreColor2 = "Violeta";
      break;
      
      case 6:
		nombreColor2 = "Naraja";
      break;
      
      default:
    }
    
    
    
    //3

    String nombreColor3="";
    
    switch(numeroColor3) {
      case 1:
		nombreColor3 = "Rojo";
      break;
      
      case 2:
		nombreColor3 = "Azul";      
      break;
      
      case 3:
		nombreColor3 = "Verde";
      break;
      
      case 4:
		nombreColor3 = "Amarillo";
      break;
      
      case 5:
		nombreColor3 = "Violeta";
      break;
      
      case 6:
		nombreColor3 = "Naraja";
      break;
      
      default:
    }
    
    System.out.println("Pinta la habitacion 1 de color "+nombreColor1);
    System.out.println("Pinta la habitacion 2 de color "+nombreColor2);
    System.out.println("Pinta la habitacion 3 de color "+nombreColor3);
    
    
  }
}

