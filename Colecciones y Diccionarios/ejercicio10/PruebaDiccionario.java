
package ejercicio10;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Iván Pérez Molina
 */
public class PruebaDiccionario {

  public static void main(String[] args) {
     //Creo el HashMap
    HashMap<String, String> dic = new HashMap<String, String>();

    //Meto valores en una especie de Diccionario
    dic.put("perro", "Dog 🐮");
    dic.put("gato" , "Cat 🐱");
    dic.put("mono", "Monkey 🐵");    
    dic.put("dado", "Dices ⚀ ⚁ ⚂ ⚃ ⚄ ⚅");
    dic.put("telefono", "Phone ☎");
    dic.put("teclado", "KeyBoard ⌨");    
    dic.put("nieve", "Snow ☃");
    dic.put("nube" , "Cloud ☁");
    dic.put("sol", "Sun ☀");    
    dic.put("luna" , "Mood ☾");
    dic.put("bandera", "Flag ⚐ ⚑");
    dic.put("avion", "Airplane ✈");    
    dic.put("tijeras", "Scissors ✂");
    dic.put("peligro", "Warning! ⚠");
    dic.put("estrella" , "Star ✰");    
    dic.put("lapiz", "Pencil ✎");
    dic.put("rayo", "Thunderbolt ⚡");
    dic.put("cafe","Coffee ☕");    
    dic.put("ajedrez", "Chess ♔ ♕ ♖ ♗ ♘ ♙ ♚ ♛ ♜ ♝ ♞ ♟");
    dic.put("trebol","Clover ☘");
    


    //Pido los datos al usuario
    JOptionPane.showMessageDialog(null, "DICCIONARIO ESPAÑOL-INGLES");
    String palabraEspañol = JOptionPane.showInputDialog("Introduzca una palabra en español \n Pulse 0 para salir");
    
    switch(palabraEspañol){
      case "0":
        System.out.println("ADIOS!!!");
        break;
        
      default:
    
    
      if (dic.containsKey(palabraEspañol)) {
        if (dic.indexOf(palabraEspañol)== (palabraEspañol)){
          System.out.println(dic.get(palabraEspañol));
          System.out.println("");
          
        }
      } else {
        System.out.println("Esa palabra todavía no esta disponible");
        System.out.println("");

      }
      break;
    }
    

  }
  
}
