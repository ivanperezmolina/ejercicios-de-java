
package ejercicio12;


import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Iván Pérez Molina
 */
public class PruebaCartas {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Creo el HashMap
    HashMap<String, Integer> carta = new HashMap<String, Integer>();

    //Meto valores en una especie de Diccionario
    carta.put("as",11);
    carta.put("tres",10);
    carta.put("sota",2);
    carta.put("caballo",3);
    carta.put("rey",4);
    
    //Creo las cartas
        ArrayList<Cartas> cartas = new ArrayList<>();//Le tengo que decir en <> que cosa le voy a meter

    cartas.add(new Cartas(1, "Oros"));
    cartas.add(new Cartas(2, "Oros"));
    cartas.add(new Cartas(3, "Oros"));
    cartas.add(new Cartas(4, "Oros"));
    cartas.add(new Cartas(5, "Oros"));
    cartas.add(new Cartas(6, "Oros"));
    cartas.add(new Cartas(7, "Oros"));
    cartas.add(new Cartas(10, "Oros -->Sota"));
    cartas.add(new Cartas(11, "Oros -->Caballo"));
    cartas.add(new Cartas(12, "Oros -->Rey"));

    cartas.add(new Cartas(1, "Copas"));
    cartas.add(new Cartas(2, "Copas"));
    cartas.add(new Cartas(3, "Copas"));
    cartas.add(new Cartas(4, "Copas"));
    cartas.add(new Cartas(5, "Copas"));
    cartas.add(new Cartas(6, "Copas"));
    cartas.add(new Cartas(7, "Copas"));
    cartas.add(new Cartas(10, "Copas -->Sota"));
    cartas.add(new Cartas(11, "Copas -->Caballo"));
    cartas.add(new Cartas(12, "Copas -->Rey"));

    cartas.add(new Cartas(1, "Espadas"));
    cartas.add(new Cartas(2, "Espadas"));
    cartas.add(new Cartas(3, "Espadas"));
    cartas.add(new Cartas(4, "Espadas"));
    cartas.add(new Cartas(5, "Espadas"));
    cartas.add(new Cartas(6, "Espadas"));
    cartas.add(new Cartas(7, "Espadas"));
    cartas.add(new Cartas(10, "Espadas -->Sota"));
    cartas.add(new Cartas(11, "Espadas -->Caballo"));
    cartas.add(new Cartas(12, "Espadas -->Rey"));

    cartas.add(new Cartas(1, "Bastos"));
    cartas.add(new Cartas(2, "Bastos"));
    cartas.add(new Cartas(3, "Bastos"));
    cartas.add(new Cartas(4, "Bastos"));
    cartas.add(new Cartas(5, "Bastos"));
    cartas.add(new Cartas(6, "Bastos"));
    cartas.add(new Cartas(7, "Bastos"));
    cartas.add(new Cartas(10, "Bastos -->Sota"));
    cartas.add(new Cartas(11, "Bastos -->Caballo"));
    cartas.add(new Cartas(12, "Bastos -->Rey"));
  
    //Genero 5 cartas aleatorias
    JOptionPane.showMessageDialog(null, "Juego de la brisca.");
    Cartas aux;
    for (int i = 0; i < 5; i++) {
      aux = cartas.get((int) (Math.random() * cartas.size()));
      
      if(cartas.containsKey(aux)) {
        System.out.println(aux);
      } else {
      }
  }
  
}
}
