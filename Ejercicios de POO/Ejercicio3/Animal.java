package Ejercicio3;

/**
 *
 * @author ivanp
 */
public class Animal {

  //Atributos//
  private int peso;
  private String color;
  private String nombre;

  //Metodos//
  
  //Contructor
  public Animal(int peso, String color, String nombre) {
    this.peso = peso;
    this.color = color;
    this.nombre = nombre;
  }

  //Getters: Muestro el valor
  public int getPeso() {
    return peso;
  }

  public String getColor() {
    return color;
  }

  public String getNombre() {
    return nombre;
  }
  
  //Setters: Establezco un valor

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  
  //Otros

  public String come() {
    String comida = "Yumm! ⛂ ";

    return comida;
  }

  public String come(int a) {
    String comida = "";

    for (int i = 0; i < a; i++) {
      comida += "⛂ Yumm! ⛀  ";
    }

    return comida;
  }

}
