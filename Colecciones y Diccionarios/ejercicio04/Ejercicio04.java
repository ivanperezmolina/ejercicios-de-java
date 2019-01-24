package ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Iván Pérez Molina
 */
public class Ejercicio04 {

  public static void main(String[] args) {

    JOptionPane.showMessageDialog(null, "A continuación, introduzca 10 palabras para que \n sean ordenados");

    ArrayList<String> a = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      a.add(JOptionPane.showInputDialog("Introduzca una palabra"));
    }

    System.out.println("Sus palabras ordenados son los siguientes");

    //Ordeno los valores -->
    Collections.sort(a);

    //Muestro el ArrayList ordenado -->
    System.out.println(a);
  }

}
