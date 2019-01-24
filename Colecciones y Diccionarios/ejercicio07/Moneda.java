
package ejercicio07;

/**
 *
 * @author Iván Pérez Molina
 */
public class Moneda {
  //Atributos
    private String valor;
    private String posicion;
  
  //Métodos

  public Moneda(String valor, String posicion) {
    this.valor = valor;
    this.posicion = posicion;
  }

  public String getValor() {
    return valor;
  }

  public String getPosicion() {
    return posicion;
  }

  @Override
  public String toString() {
    return valor + " - " + posicion;
  }
    
 
}
