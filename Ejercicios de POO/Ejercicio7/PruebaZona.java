package Ejercicio7;

import javax.swing.JOptionPane;

public class PruebaZona {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int opcion = 0;
    //Creo las zonas
    Zona salaPrincipal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    //Menu
    System.out.println("EXPOCOCHES CAMPANILLAS");
    System.out.println("=======================");
    System.out.println("Bienvenido al sistema de comprar entradas de Expocoches Campanillas");
    System.out.println("Opciones:");
    System.out.println("1. Mostrar número de entradas libres.");
    System.out.println("2. Vender entradas");
    System.out.println("3. Salir");
    System.out.println("======================================================================");

    while (opcion != 3) {
      opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:"));

      switch (opcion) {
        case 1:
          System.out.println("Entradas disponibles:");
          System.out.println("Sala Principal: " + salaPrincipal.getEntradasPorVender());
          System.out.println("Zona de Compra Venta: " + compraVenta.getEntradasPorVender());
          System.out.println("Zona VIP: " + vip.getEntradasPorVender());
          System.out.println("======================================================================");
          break;

        case 2:
         
          System.out.println("ZONAS:");
          System.out.println("1. Sala Principal");
          System.out.println("2. Zona de Compra-Venta");
          System.out.println("3. Zona VIP");
           int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Elige una sala para comprar entradas:"));
          System.out.println("======================================================================");

          switch (opcion2) {
            case 1:
              int aComprarCase1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas entradas quieres?"));
              salaPrincipal.vender(aComprarCase1);
              break;

            case 2:
              int aComprarCase2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas entradas quieres?"));
              compraVenta.vender(aComprarCase2);
              break;

            case 3:
              int aComprarCase3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas entradas quieres?"));
              vip.vender(aComprarCase3);
              break;
              
            default:
              System.out.println("Introduce un sitio lógico");
              break;

          }
          
        case 3:
          System.out.println("ADIOS!!!");
          break;
          
        default: 
          System.out.println("Introduce una opcion correcta");
          break;
          

      }

    }
  }
}
