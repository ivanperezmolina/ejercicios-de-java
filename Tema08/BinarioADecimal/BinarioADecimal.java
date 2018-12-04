package funciones;

import funciones.funcionesnumericas.FuncionesBiDe;
import java.util.Scanner;

/**
 *
 * @author ivanp
 */
public class BinarioADecimal {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("CONVERTIDOR DE BINARIO A DECIMAL");
    System.out.print("Introduzca el numero en binario:");
    int numeroenbinario = Integer.parseInt(s.nextLine());

    //Saco cuantos digitos tiene el numero y le resto 1
    int digitos = (FuncionesBiDe.digitos(numeroenbinario) - 1);

    int numerodelarray = digitos + 1;

    int conmas = numerodelarray + 1;

    //Creo un array; meto los numeros hay
    int[] miArray = new int[conmas];

    int gironumero = 0;
    gironumero = FuncionesBiDe.voltea(numeroenbinario);

    int ultimacifra = 0;

    int fin = 0;

    for (int k = 0; k <= numerodelarray; k++) {
      ultimacifra = gironumero % 10;
      miArray[k] = ultimacifra;
    }

    //Tengo que elevar el dos a cada uno de los numeros que me ha dado
    int elevados = 0;
    int paso2 = 0;
    int suma = 0;
    for (int i = 0; i <= digitos; i++) {
      int x = 2;
      elevados = FuncionesBiDe.potencia(i, x);
      paso2 = elevados * miArray[i];
      suma = suma + paso2;

    }

//Muestro el numero en decima
    System.out.println("Su numero en decimal es: " + suma);

  }

}
