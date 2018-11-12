
/**
 *
 * @author ivanp
 */
public class Ejercicio10 {

  public static void main(String[] args) {

    //Creo el array
    int[] miArray = new int[20];
    int[] miArrayOrdenadoPar = new int[20];
    int[] miArrayOrdenadoImpar = new int[20];
    

    //Para el array  hago un bucle que almacene datos aleatorios
    for (int i = 0; i <= 19; i++) {
      miArray[i] = (int) (Math.random() * 100);
      System.out.print("Posicion inicial "+i+" = Numero "+miArray[i]);
     
      if ((miArray[i]) % 2 == 0) {
        System.out.println("--> El número es par");
        for (int j = 0; j <= 19; j++) {
          miArrayOrdenadoPar[j]=miArray[j];
        }
      } else {
        System.out.println("--> El número es impar");
                for (int k = 0; k <= 19; k++) {
          miArrayOrdenadoPar[k]=miArray[k];
        }
      }
    }
              for (int l = 0; l <= 19; l++) {
         System.out.println("Posicion par "+l+" es igual al num "+miArrayOrdenadoPar);
         System.out.println("Posicion impar "+l+" es igual al num "+miArrayOrdenadoPar);
        }
  }

}
