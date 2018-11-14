
/**
 *
 * @author ivanp
 */
public class Ejercicio13 {

  public static void main(String[] args) {
    //Creo el array
    int[] miArray = new int[100];
    int maximo = 0;
    int minimo = 100;

    //Para el array  hago un bucle que almacene datos aleatorios
    for (int i = 0; i <= 99; i++) {
      miArray[i] = (int) (Math.random() * 500);
      System.out.print(miArray[i] + "  ");

      if (miArray[i] < minimo) {
        minimo = miArray[i];
      }

      if (miArray[i] > maximo) {
        maximo = miArray[i];
      }
    }
        System.out.print("\n\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    int opcion = Integer.parseInt(System.console().readLine());

    int destacado; // número que se va a destacar del resto
    
    if (opcion == 1) {
      destacado = minimo;
    } else {
      destacado = maximo;
    }

    System.out.println();
    int[] n;

    // Muestra el resultado.
    for (int elemento : n) {
      if (elemento == destacado) {
        System.out.print(" **" + elemento + "** ");
      } else {
        System.out.print(elemento + " ");
      }
    }

  }
}
