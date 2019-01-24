package ejercicio03;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Iván Pérez Molina
 */
public class Ejercicio03 {

  public static void main(String[] args) {

    JOptionPane.showMessageDialog(null, "A continuación, introduzca 10 números para que \n sean ordenados");

    ArrayList<Integer> a = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      a.add(Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número:")));
    }

    System.out.println("Sus numeros ordenados son los siguientes");

    //Ordeno los valores -->
    Collections.sort(a);

    //Muestro el ArrayList ordenado -->
    System.out.println(a);
  }

}
