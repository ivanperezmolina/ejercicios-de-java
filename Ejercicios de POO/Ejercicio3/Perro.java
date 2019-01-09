/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author ivanp
 */
public class Perro extends Mamifero {

  //Atributos
  private String tipoLadrido;

  //Métodos
  //Constructor
  public Perro(String tipoLadrido, String raza, int peso, String color, String nombre) {
    super(raza, peso, color, nombre);
    this.tipoLadrido = tipoLadrido;
  }

  ///////////////////////////////
  //Getter y Setter
  public String getTipoLadrido() {
    return tipoLadrido;
  }

  public void setTipoLadrido(String tipoLadrido) {
    this.tipoLadrido = tipoLadrido;
  }

  //////////////////////////////
  public String ladrar() {
    String ladrido = "🐮 Uauh";

    return ladrido;
  }

}
