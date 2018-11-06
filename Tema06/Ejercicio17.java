/**
 * Tema 6 Ejercicio 17
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio17 {
  public static void main(String[] args) {
	 //Pido altura y anchura 
	System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int alto = Integer.parseInt(System.console().readLine());

    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int ancho = Integer.parseInt(System.console().readLine());
    //////////////////////////
    
    //Veo la posicion del pez. Tengo que restar dos por la parte de arriba y abajo
    int posicionPez = 0;
    int posicionPez = (int)(Math.random()*(alto - 2)*(ancho - 2));
    ///////////////////////////

    //Parte de arriba
    for(int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();
    
    /////////////////
    
    //Parte de abajo
    for(int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();
    
    /////////////////
  }
}

