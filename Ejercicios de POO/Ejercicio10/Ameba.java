
package Ejercicio10;

/**
 *
 * @author ivanp
 */
public class Ameba {
  //Atributos
  
  private int peso;
  
  //Metodos
  
  //constructor

  public Ameba() {
    this.peso = 3;
  }
  
  //Getter y Setter

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }
  
  public int come(int cantidad){
     this.peso=this.peso+cantidad;
  return this.peso;
  }
  
    public int come(Ameba a){
     this.peso=this.peso+a.peso;
     a.peso=0;
  return this.peso;
  }
  
}


