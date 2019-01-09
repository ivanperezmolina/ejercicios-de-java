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
public class Canario extends Ave{
  //Atributos
    private String canto;
    
  //Métodos
    
    //Constructor

  public Canario(String canto, String plumaje, int peso, String color, String nombre) {
    super(plumaje, peso, color, nombre);
    this.canto = canto;
  }
    
  //Getter y Setter

  public String getCanto() {
    return canto;
  }

  public void setCanto(String canto) {
    this.canto = canto;
  }
  
  
    
    public String piar(int a){
    String pio = "";
    
        for (int i = 0; i < a; i++) {
      pio += "Píío Píío  ☕";
    }
    return pio;
    }
}
