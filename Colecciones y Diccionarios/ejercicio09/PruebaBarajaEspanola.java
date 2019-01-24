package ejercicio09;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Iván Pérez Molina
 */
public class PruebaBarajaEspanola {

  public static void main(String[] args) {
    //Creo las cartas
    ArrayList<BarajaEspanola> cartas = new ArrayList<>();//Le tengo que decir en <> que cosa le voy a meter

    cartas.add(new BarajaEspanola("Oros", 1));
    cartas.add(new BarajaEspanola("Oros", 2));
    cartas.add(new BarajaEspanola("Oros", 3));
    cartas.add(new BarajaEspanola("Oros", 4));
    cartas.add(new BarajaEspanola("Oros", 5));
    cartas.add(new BarajaEspanola("Oros", 6));
    cartas.add(new BarajaEspanola("Oros", 7));
    cartas.add(new BarajaEspanola("Oros", 10));
    cartas.add(new BarajaEspanola("Oros", 11));
    cartas.add(new BarajaEspanola("Oros", 12));

    cartas.add(new BarajaEspanola("Copas", 1));
    cartas.add(new BarajaEspanola("Copas", 2));
    cartas.add(new BarajaEspanola("Copas", 3));
    cartas.add(new BarajaEspanola("Copas", 4));
    cartas.add(new BarajaEspanola("Copas", 5));
    cartas.add(new BarajaEspanola("Copas", 6));
    cartas.add(new BarajaEspanola("Copas", 7));
    cartas.add(new BarajaEspanola("Copas", 10));
    cartas.add(new BarajaEspanola("Copas", 11));
    cartas.add(new BarajaEspanola("Copas", 12));

    cartas.add(new BarajaEspanola("Bastos", 1));
    cartas.add(new BarajaEspanola("Bastos", 2));
    cartas.add(new BarajaEspanola("Bastos", 3));
    cartas.add(new BarajaEspanola("Bastos", 4));
    cartas.add(new BarajaEspanola("Bastos", 5));
    cartas.add(new BarajaEspanola("Bastos", 6));
    cartas.add(new BarajaEspanola("Bastos", 7));
    cartas.add(new BarajaEspanola("Bastos", 10));
    cartas.add(new BarajaEspanola("Bastos", 11));
    cartas.add(new BarajaEspanola("Bastos", 12));

    JOptionPane.showMessageDialog(null, "10 CARTAS DE LA BARAJA ESPAÑOLA AL AZAR");

    BarajaEspanola aux;
    for (int i = 0; i < 10; i++) {
      aux = cartas.get((int) (Math.random() * cartas.size()));
      //System.out.println(aux);
    }

    //Ordeno los valores -->
    Collections.sort(cartas.get(palo));

    //Muestro el ArrayList ordenado -->
    System.out.println(a);

  }

}
