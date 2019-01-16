package Ejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanp
 */
public class PruebaAmeba {

  public static void main(String[] args) {
    int opcion = 0;
    Ameba a1 = new Ameba();
    Ameba a2 = new Ameba();
    System.out.println("Soy la ameba 1 y peso: " + a1.getPeso() + " microgramos");
    System.out.println("Soy la ameba 2 y peso: " + a2.getPeso() + " microgramos");
    System.out.println("");

    a1.come(2);
    System.out.println("La ameba 1 ha comido 2mg y ahora pesa "+a1.getPeso()+" microgramos");
    System.out.println("");
    
    a2.come(4);
    System.out.println("La ameba 2 ha comido 4mg y ahora pesa "+a2.getPeso()+ " microgramos");
    System.out.println("");
    
    a1.come(a2);
    System.out.println("OH NO! La ameba 1 se ha comido a la 2 y ahora pesan cada una: ");
    System.out.println("Ameba 1: "+a1.getPeso()+" microgramos");
    System.out.println("Ameba 2: "+a2.getPeso()+" microgramos");
    System.out.println("");
    
    a2.come(3);
    System.out.println("La ameba 2 ha comido 3mg y ahora pesa "+a2.getPeso()+" microgramos");
    System.out.println("");
  }

}
