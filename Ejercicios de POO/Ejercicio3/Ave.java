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
public class Ave extends Animal {

  //Atributos
  private String plumaje;

  //Métodos
  //Constructor
  public Ave(String plumaje, int peso, String color, String nombre) {
    super(peso, color, nombre);
    this.plumaje = plumaje;
  }

  //Getter y setter
  public String getPlumaje() {
    return plumaje;
  }

  public void setPlumaje(String plumaje) {
    this.plumaje = plumaje;
  }

  //Otros
  public String volar() {
    String vuelo = "☁☁☁☁✈✈☁☁☁☁";

    return vuelo;
  }

}
