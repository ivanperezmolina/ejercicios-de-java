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
public class Pinguino extends Mamifero{
  //Atributos
    private String lugarHabitat;
    
  //Métodos
    
    //Cnstructor

  public Pinguino(String lugarHabitat, String raza, int peso, String color, String nombre) {
    super(raza, peso, color, nombre);
    this.lugarHabitat = lugarHabitat;
  }
    
  //Getter y Setter

  public String getLugarHabitat() {
    return lugarHabitat;
  }

  public void setLugarHabitat(String lugarHabitat) {
    this.lugarHabitat = lugarHabitat;
  }
  //////////////////
    
    public String alAgua(){
    String nadando = "Gluuu!- Que frío! ☃";
    
    return nadando;
    }
}
