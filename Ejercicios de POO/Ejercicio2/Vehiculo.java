package Ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan Perez Molina
 */
public class Vehiculo {
  //Atributos

  private static int kilometrosTotales;
  private int kilometrosRecorridos;

  //Metodos
  //Getter y Setter
  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

//  public static void setKilometrosTotales(int kilometrosTotales) {
//    Vehiculo.kilometrosTotales = kilometrosTotales;
//  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }

  
  
  
  //Hacer que cualquier vehículo ande
  public String anda(int a) {
    String andara = "";
    this.kilometrosRecorridos+=a;
    Vehiculo.kilometrosTotales+=a;

    for (int i = 0; i < a; i++) {
      andara+="Run!";
    }

    return andara;

  }


}
