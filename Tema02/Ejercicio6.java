/**
 * Uso de variables enteras
 *
 * @author Luis J. Sánchez
 */
 
public class Ejercicio6 {
  public static void main(String[] args) {
    double precioBase;
    double IVA;
    double precioTotal;
    
    precioBase = 1.50;
    IVA = (precioBase * 21) / 100;
    precioTotal = precioBase + IVA; 

    
  System.out.println("BIENVENIDO A CAJA 3");
  System.out.println("PRECIO SIN IVA: " + precioBase);
  System.out.println("SE LE APLICARA UN IVA DEL 21%, QUE SUMA A SU CUENTA: " +IVA);
  System.out.println("PRECIO TOTAL: " + precioTotal);
  }
}
