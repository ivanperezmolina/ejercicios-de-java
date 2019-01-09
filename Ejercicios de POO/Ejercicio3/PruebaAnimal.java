package Ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanp
 */
public class PruebaAnimal {

  public static void main(String[] args) {
    int opcion = 0;

    // Voy a crear a un gato, perro, pinguino, canario, y lagarto
    Gato miGato = new Gato("Largas", "Siames", 15, "Negro", "Garfield");
    Perro miPerro = new Perro("Fuerte", "Dalmata", 12, "Blanco", "Tana");
    Pinguino miPinguino = new Pinguino("Atlantica", "Adelia", 5, "Blanco y Negro", "Pingu");
    Canario miCanario = new Canario("Flojo", "Mucha pluma", 1, "Negro", "Pios");
    Lagarto miLagarto = new Lagarto("Rugosa", 1, "Verde", "LagartoJaen");

    //Muestro un menu
    System.out.println("ANIMALES");
    System.out.println("==========");
    System.out.println("1. Mostrar info del gato");
    System.out.println("2. Mostrar info del perro");
    System.out.println("3. Mostrar info del Pinguino");
    System.out.println("4. Mostrar info del canario");
    System.out.println("5. Mostrar info del Lagarto");
    System.out.println("--------------------------------");
    System.out.println("6. Haz que el gato arañe al perro ");
    System.out.println("7. Pon al gato a una pata");
    System.out.println("8. Pon al gato a comer");
    System.out.println("9. Haz que el perro ladre al gato");
    System.out.println("10. Pon al perro a una pata");
    System.out.println("11. Pon al perro a comer");
    System.out.println("12. Haz que el pinguino se bañe");
    System.out.println("13. Pon al pinguino a una pata");
    System.out.println("14. Pon al pinguino a comer");
    System.out.println("15. Pon al canario a piar");
    System.out.println("16. Haz que el canario vuele un poco");
    System.out.println("17. Pon al canario a comer");
    System.out.println("18. Pon el lagarto al sol");
    System.out.println("19. Pon el lagarto a comer");
    System.out.println("20. Salir");
    System.out.println("========================================================");

    //Ejecucion
    while (opcion != 20) {
      opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:"));

      switch (opcion) {
        case 1:
          System.out.println("El nombre del gato es :" + miGato.getNombre());
          System.out.println("El color del gato es: " + miGato.getColor());
          System.out.println("El peso del gato es de " + miGato.getPeso() + " kg");
          System.out.println("La raza del gato es " + miGato.getRaza());
          System.out.println("El tipo de uñas del gato son: " + miGato.getTipoUñas());
          System.out.println("---------------------------------------------------");
          System.out.println("");
          break;

        case 2:
          System.out.println("El nombre del perro es :" + miPerro.getNombre());
          System.out.println("El color del perro es: " + miPerro.getColor());
          System.out.println("El peso del perro es de " + miPerro.getPeso() + " kg");
          System.out.println("La raza del perro es " + miPerro.getRaza());
          System.out.println("El tipo de ladrido del perro es: " + miPerro.getTipoLadrido());
          System.out.println("---------------------------------------------------");
          System.out.println("");
          break;

        case 3:
          System.out.println("El nombre del pinguino es :" + miPinguino.getNombre());
          System.out.println("El color del pinguino es: " + miPinguino.getColor());
          System.out.println("El peso del pinguino es de " + miPinguino.getPeso() + " kg");
          System.out.println("La raza del Pinguino es " + miPinguino.getRaza());
          System.out.println("El pinguino vive en:  " + miPinguino.getLugarHabitat());
          System.out.println("---------------------------------------------------");
          System.out.println("");
          break;

        case 4:
          System.out.println("El nombre del canario es :" + miCanario.getNombre());
          System.out.println("El color del canario es: " + miCanario.getColor());
          System.out.println("El peso del canario es de " + miCanario.getPeso() + " kg");
          System.out.println("El plumaje del canario es: " + miCanario.getPlumaje());
          System.out.println("El canto del canario es: " + miCanario.getCanto());
          System.out.println("---------------------------------------------------");
          System.out.println("");
          break;

        case 5:
          System.out.println("El nombre del lagarto es :" + miLagarto.getNombre());
          System.out.println("El color del lagarto es: " + miLagarto.getColor());
          System.out.println("El peso del lagarto es de " + miLagarto.getPeso() + " kg");
          System.out.println("La piel del lagarto es: " + miLagarto.getTipoPiel());
          System.out.println("---------------------------------------------------");
          System.out.println("");
          break;

        case 6:
          System.out.println("Hola soy " + miGato.getNombre() + " y voy a arañar a " + miPerro.getNombre());
          System.out.println(miGato.arañar());
          System.out.println("----------------------------------------------------");
          System.out.println("");
          break;

        case 7:
          System.out.println("Hola soy " + miGato.getNombre() + " y voy a ponerme a una pata");
          System.out.println(miGato.aUnaPata());
          System.out.println("----------------------------------------------------");
          System.out.println("");
          break;

        case 8:
          System.out.println("Hola soy " + miGato.getNombre() + " y voy a comer");
          int cuantoComeElGato = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos platos de comida ponemos?:"));
          System.out.println(miGato.come(cuantoComeElGato));
          System.out.println("----------------------------------------------------");
          System.out.println("");
          break;

        case 9:
          System.out.println("Hola soy " + miPerro.getNombre() + " y voy a ladrar a " + miGato.getNombre());
          System.out.println(miPerro.ladrar());
          System.out.println("----------------------------------------------------");
          System.out.println("");
          break;

        case 10:
          System.out.println("Hola soy " + miPerro.getNombre() + " y voy a ponerme a una pata");
          System.out.println(miPerro.aUnaPata());
          System.out.println("----------------------------------------------------");
          System.out.println("");
          break;

        case 11:
          System.out.println("Hola soy " + miPerro.getNombre() + " y voy a comer");
          int cuantoComeElPerro = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos platos de comida ponemos?:"));
          System.out.println(miPerro.come(cuantoComeElPerro));
          System.out.println("----------------------------------------------------");
          System.out.println("");
          break;

        case 12:
          System.out.println("Hola soy " + miPinguino.getNombre() + " y voy a bañarme");
          System.out.println(miPinguino.alAgua());
          System.out.println("----------------------------------------------------");
          System.out.println("");
          break;

        case 13:
          System.out.println("Hola soy " + miPinguino.getNombre() + " y voy a ponerme a una pata");
          System.out.println(miPinguino.aUnaPata());
          System.out.println("----------------------------------------------------");
          System.out.println("");
          break;

        case 14:
          System.out.println("Hola soy " + miPinguino.getNombre() + " y voy a comer");
          int cuantoComeElPinguino = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos platos de comida ponemos?:"));
          System.out.println(miPinguino.come(cuantoComeElPinguino));
          System.out.println("----------------------------------------------------");
          System.out.println("");
          break;

        case 15:
          System.out.println("Hola soy " + miCanario.getNombre() + " y voy a piar");
          int cuantoPio = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto pio?:"));
          System.out.println(miCanario.piar(cuantoPio));
          System.out.println("----------------------------------------------------");
          System.out.println("");
          break;

        case 16:
          System.out.println("Hola soy " + miCanario.getNombre() + " y voy a volar");
          System.out.println(miCanario.volar());
          System.out.println("----------------------------------------------------");
          System.out.println("");
          break;

        case 17:
          System.out.println("Hola soy " + miCanario.getNombre() + " y voy a comer");
          int cuantoComeElCanario = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos platos de comida ponemos?:"));
          System.out.println(miCanario.come(cuantoComeElCanario));
          System.out.println("----------------------------------------------------");
          System.out.println("");
          break;

        case 18:
          System.out.println("Hola soy " + miLagarto.getNombre() + " y voy a tomar el sol");
          System.out.println(miLagarto.alSol());
          System.out.println("----------------------------------------------------");
          System.out.println("");
          break;

        case 19:
          System.out.println("Hola soy " + miLagarto.getNombre() + " y voy a comer");
          int cuantoComeElLagarto = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos platos de comida ponemos?:"));
          System.out.println(miLagarto.come(cuantoComeElLagarto));
          System.out.println("----------------------------------------------------");
          System.out.println("");

          break;

        case 20:
          System.out.println("ADIOS!!!");
          break;

        default:
          System.out.println("Introduce un numero valido");
          break;

      }

    }
  }
}
