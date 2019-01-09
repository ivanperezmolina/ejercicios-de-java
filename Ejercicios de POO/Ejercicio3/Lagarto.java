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
public class Lagarto extends Animal{
  //Atributos
    private String tipoPiel;
    
  //Métodos
    
    //Constructor

  public Lagarto(String tipoPiel, int peso, String color, String nombre) {
    super(peso, color, nombre);
    this.tipoPiel = tipoPiel;
  }
    
  //Getter y Setter

  public String getTipoPiel() {
    return tipoPiel;
  }

  public void setTipoPiel(String tipoPiel) {
    this.tipoPiel = tipoPiel;
  }
  
    
    public String alSol(){
    String sol = "☀☀☀☀☀";
    
    return sol;
    }
  
}
