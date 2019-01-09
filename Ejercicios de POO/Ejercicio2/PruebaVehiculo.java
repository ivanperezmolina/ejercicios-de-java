package Ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan Perez Molina
 */
public class PruebaVehiculo {

  public static void main(String[] args) {

    int opcion = 0;
    //Creo una persona y un coche       
    Bicicleta bici = new Bicicleta("Cube", "8746T");

    Coche coche = new Coche("Audi", "1.9TDI");

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
    System.out.println("");
    System.out.println("");
    
    while (opcion != 8) {
      opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:"));

      switch (opcion) {
        case 1:
          int kilometrajeParaAndarBici = Integer.parseInt(JOptionPane.showInputDialog("Indique cuanto quiere andar:"));
          System.out.println(bici.anda(kilometrajeParaAndarBici));
          
          break;

        case 2:
          System.out.println(bici.caballitoBici());
          break;

        case 3:
          int kilometrajeParaAndarCoche = Integer.parseInt(JOptionPane.showInputDialog("Indique cuanto quiere andar:"));
          System.out.println(coche.anda(kilometrajeParaAndarCoche));
          break;

        case 4:
          System.out.println(coche.quemarRueda());
          break;

        case 5:
          System.out.println("La bici tiene "+bici.getKilometrosRecorridos()+" kilometros");
          break;

        case 6:
          System.out.println("El coche tiene "+coche.getKilometrosRecorridos()+ " kilometros");
          break;

        case 7:
          System.out.println("Los kilometros de todos los vehiculos es de: " + Vehiculo.getKilometrosTotales());
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

}
