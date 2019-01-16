package Ejercicio8;

/**
 *
 * @author ivanp
 */
public class Terminal {
  //Atributos

  private String numero;
  private static int tiempoConversacion;
  

  //Métodos
  //constructor
  public Terminal(String numero) {
    this.numero = numero;
  }

  //getter y setter
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public static int getTiempoConversacion() {
    return tiempoConversacion;
  }

  public static void setTiempoConversacion(int tiempoConversacion) {
    Terminal.tiempoConversacion = tiempoConversacion;
  }

  
  
  public void llama(Terminal x, int num) {

    x.tiempoConversacion = x.tiempoConversacion + num;

    
  }

}
