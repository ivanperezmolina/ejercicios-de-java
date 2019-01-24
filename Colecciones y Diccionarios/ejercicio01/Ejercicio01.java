package ejercicio01;



import java.util.ArrayList;

/**
 *
 * @author Iván Pérez Molina
 */
public class Ejercicio01 {

  public static void main(String[] args) {
    
        ArrayList<String> n = new ArrayList<>();
        
        n.add("Pepe Garcia");
        n.add("Pedro Burgos");
        n.add("Lola Flores");
        n.add("Belen Esteban");
                
        for (int i = 0; i < 4; i++) {
          System.out.println("Compañero nº"+i+":  "+n.get(i));
    }
        
  }
  
}

