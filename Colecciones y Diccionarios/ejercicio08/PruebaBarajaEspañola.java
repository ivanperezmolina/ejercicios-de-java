package ejercicio08;

import ejercicio09.BarajaEspanola;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import javax.swing.JOptionPane;

/**
 *
 * @author Iván Pérez Molina
 */
public class PruebaBarajaEspañola {

  public static void main(String[] args) {
    //Creo las cartas
    ArrayList<BarajaEspañola> cartas = new ArrayList<>();//Le tengo que decir en <> que cosa le voy a meter

    cartas.add(new BarajaEspañola(1, "Oros"));
    cartas.add(new BarajaEspañola(2, "Oros"));
    cartas.add(new BarajaEspañola(3, "Oros"));
    cartas.add(new BarajaEspañola(4, "Oros"));
    cartas.add(new BarajaEspañola(5, "Oros"));
    cartas.add(new BarajaEspañola(6, "Oros"));
    cartas.add(new BarajaEspañola(7, "Oros"));
    cartas.add(new BarajaEspañola(10, "Oros -->Sota"));
    cartas.add(new BarajaEspañola(11, "Oros -->Caballo"));
    cartas.add(new BarajaEspañola(12, "Oros -->Rey"));

    cartas.add(new BarajaEspañola(1, "Copas"));
    cartas.add(new BarajaEspañola(2, "Copas"));
    cartas.add(new BarajaEspañola(3, "Copas"));
    cartas.add(new BarajaEspañola(4, "Copas"));
    cartas.add(new BarajaEspañola(5, "Copas"));
    cartas.add(new BarajaEspañola(6, "Copas"));
    cartas.add(new BarajaEspañola(7, "Copas"));
    cartas.add(new BarajaEspañola(10, "Copas -->Sota"));
    cartas.add(new BarajaEspañola(11, "Copas -->Caballo"));
    cartas.add(new BarajaEspañola(12, "Copas -->Rey"));

    cartas.add(new BarajaEspañola(1, "Espadas"));
    cartas.add(new BarajaEspañola(2, "Espadas"));
    cartas.add(new BarajaEspañola(3, "Espadas"));
    cartas.add(new BarajaEspañola(4, "Espadas"));
    cartas.add(new BarajaEspañola(5, "Espadas"));
    cartas.add(new BarajaEspañola(6, "Espadas"));
    cartas.add(new BarajaEspañola(7, "Espadas"));
    cartas.add(new BarajaEspañola(10, "Espadas -->Sota"));
    cartas.add(new BarajaEspañola(11, "Espadas -->Caballo"));
    cartas.add(new BarajaEspañola(12, "Espadas -->Rey"));

    cartas.add(new BarajaEspañola(1, "Bastos"));
    cartas.add(new BarajaEspañola(2, "Bastos"));
    cartas.add(new BarajaEspañola(3, "Bastos"));
    cartas.add(new BarajaEspañola(4, "Bastos"));
    cartas.add(new BarajaEspañola(5, "Bastos"));
    cartas.add(new BarajaEspañola(6, "Bastos"));
    cartas.add(new BarajaEspañola(7, "Bastos"));
    cartas.add(new BarajaEspañola(10, "Bastos -->Sota"));
    cartas.add(new BarajaEspañola(11, "Bastos -->Caballo"));
    cartas.add(new BarajaEspañola(12, "Bastos -->Rey"));

    JOptionPane.showMessageDialog(null, "10 CARTAS DE LA BARAJA ESPAÑOLA AL AZAR");
    BarajaEspañola aux;
    for (int i = 0; i < 10; i++) {
      aux = cartas.get((int) (Math.random() * cartas.size()));
      System.out.println(aux);


  }

}
}
