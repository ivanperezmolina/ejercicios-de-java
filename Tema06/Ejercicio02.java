/**
 * Tema 6 Ejercicio 2
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("TIRADA DE LA BARAJA FRANCESA");    
    
    //Palos
    int numeroPalo = (int)(Math.random()*4) + 1;
    
    String nombrePalo="";
    
    switch(numeroPalo) {
      case 1:
      nombrePalo = "diamantes";
      break;
      
      case 2:
      nombrePalo = "tréboles";      
      break;
      
      case 3:
      nombrePalo = "picas";
      break;
      
      case 4:
      nombrePalo = "corazones";
      break;
      
      default:
    
    }    
    //////////////////////////////
    
    //Numeral
    int numeroCarta = (int)(Math.random()*13) + 1;
    
    String nombreCarta="";
    
    switch(numeroCarta) {
      case 1:
      nombreCarta = "A";
      break;
      
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      nombreCarta=String.valueOf(numeroCarta);
      break;
      
      case 11:
      nombreCarta = "J";
      break;
      
      case 12:
      nombreCarta = "Q";
      break;

      case 13:
      nombreCarta = "K";
      break;
      
      default:
    
    } 
    ////////////////////////
    
    //Mostrar
    System.out.println("Ha salido: "+nombreCarta+ " de "+nombrePalo);
    /////////////////////// 
  
  
  }
}

