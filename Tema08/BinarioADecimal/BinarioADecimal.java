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
    int numeroEnBinario = Integer.parseInt(s.nextLine());

    //Saco cuantos digitos tiene el numero y le resto 1
    int digitos = (FuncionesBiDe.digitos(numeroEnBinario));

    //Creo un array; meto los numeros hay
    int[] arrayBinario = new int[digitos];

    //Array con los digitos del numero binario invertido
    arrayBinario = FuncionesBiDe.numberToArray(FuncionesBiDe.voltea(numeroEnBinario));
    
    int suma = 0;
    for (int i=0; i< arrayBinario.length;i++) {
      suma+=arrayBinario[i]*Math.pow(2,i);
    }

//Muestro el numero en decimal
    System.out.println("Su numero en decimal es: " + suma);

  }

}
