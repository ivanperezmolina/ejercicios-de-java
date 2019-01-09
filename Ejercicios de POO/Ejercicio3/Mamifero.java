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
public class Mamifero extends Animal{
  //Atributos
    private String raza;
    
  //Métodos
    
    //Constructor

  public Mamifero(String raza, int peso, String color, String nombre) {
    super(peso, color, nombre);
    this.raza = raza;
  }
    
  //Getter y Setter

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }
  
    
    public String aUnaPata(){
      String aUna="Hola, estoy sobre una pata 😂😂";
      
      return aUna;
    }
}
