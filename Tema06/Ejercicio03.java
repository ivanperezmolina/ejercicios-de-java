/**
 * Tema 6 Ejercicio 3
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("TIRADA DE LA BARAJA ESPAÑOLA");    
    
    //Palos
    int numeroPalo = (int)(Math.random()*4) + 1;
    
    String nombrePalo="";
    
    switch(numeroPalo) {
      case 1:
      nombrePalo = "Oros";
      break;
      
      case 2:
      nombrePalo = "Copas";      
      break;
      
      case 3:
      nombrePalo = "Espadas";
      break;
      
      case 4:
      nombrePalo = "Bastos";
      break;
      
      default:
    
    }    
    //////////////////////////////
    
    //Numeral
    int numeroCarta = (int)(Math.random()*10) + 1;
    
    String nombreCarta="";
    
    switch(numeroCarta) {
      case 1:
      nombreCarta = "As";
      break;
      
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      nombreCarta=String.valueOf(numeroCarta);
      break;
      
      case 8:
      nombreCarta = "Sota";
      break;
      
      case 9:
      nombreCarta = "Caballo";
      break;

      case 13:
      nombreCarta = "Rey";
      break;
      
      default:
    
    } 
    ////////////////////////
    
    //Mostrar
    System.out.println("Ha salido: "+nombreCarta+ " de "+nombrePalo);
    /////////////////////// 
  
  
  }
}

