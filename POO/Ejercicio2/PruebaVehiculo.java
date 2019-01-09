
package Ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan Perez Molina
 */
public class PruebaVehiculo {

  public static void main(String[] args) {    
    //Creo una persona y un coche       
    Bicicleta bici = new Bicicleta("Cube","8746T",654);
    
    Coche coche = new Coche(837,"Audi","1.9TDI");
    
    //MENU
    System.out.println("VEHÍCULOS");
    System.out.println("===========");
    System.out.println("1. Andar con la bicicleta");
    System.out.println("2. Haz el caballito con la bicicleta");
    System.out.println("3. Anda con el coche");
    System.out.println("4. Quema rueda con el coche");
    System.out.println("5. Ver kilometraje de la bicicleta");
    System.out.println("6. Ver kilometraje del coche");
    System.out.println("7. Ver kilometraje total");
    System.out.println("8. Salir");
    
    int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:"));
    
      switch(opcion){
      case 1:
        bici.andarBici();
      break;
      
      case 2:
         bici.caballitoBici();
      break;
      
      case 3:
        coche.andarCoche();
      break;
      
      case 4:
        coche.quemarRueda();
      break;
      
      case 5:
        bici.mostrarDatosBici();
      break;
      
      case 6:
        coche.mostrarDatosCoche();
      break;
      
      case 7:
        //System.out.println("Los kilometros de todos los vehiculos es de: "+contador);
      break;
      
      case 8:
        System.out.println("ADIOS!!");
      break;
      
      default:
        System.out.println("Introduzca un numero valido");
      break;
        
      
      }
  }
      
  
}
