
package Personas;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanp
 */
public class PruebaPersona {

  public static void main(String[] args) {
    Persona p1 = new Persona("Ivan",18);
    
    p1.correr();
    
    Persona p2 = new Persona(20623572);
    
    int kilometros = Integer.parseInt(JOptionPane.showInputDialog("Cuantos kilometros ha corrido?"));
    
    p2.correr(kilometros);
        
    
    
    
  }
  
}
