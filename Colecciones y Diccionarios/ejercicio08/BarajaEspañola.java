
package ejercicio08;

/**
 *
 * @author Iván Pérez Molina
 */
public class BarajaEspañola {
  //Atributos
    private int numero;
    private String simbolo;
    
    
  //Métodos
    //Constructor

  public BarajaEspañola(int numero, String simbolo) {
    this.numero = numero;
    this.simbolo = simbolo;
  }

  @Override
  public String toString() {
    return "Su carta es el: " + numero + " de " + simbolo ;
  }
  
  
      
}
