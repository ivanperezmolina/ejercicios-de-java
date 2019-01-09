package Ejercicio3;

/**
 *
 * @author ivanp
 */
public class Gato extends Mamifero {

  //Atributos
  private String tipoUñas;

  //Métodos
  //Constructor
  
  
  public Gato(String tipoUñas, String raza, int peso, String color, String nombre) {
    super(raza, peso, color, nombre);
    this.tipoUñas = tipoUñas;
  }

  /////////////////////////
  //Getter y Setter
  public String getTipoUñas() {
    return tipoUñas;
  }

  public void setTipoUñas(String tipoUñas) {
    this.tipoUñas = tipoUñas;
  }

  /////////////////////////////
  public String arañar() {
    String arañazo = "|| 🐱 ||";

    return arañazo;
  }
}
