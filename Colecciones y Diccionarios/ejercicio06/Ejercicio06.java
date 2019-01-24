package ejercicio06;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Iván Pérez Molina
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    //Creo el HashMap
    HashMap<String, Integer> m = new HashMap<String, Integer>();

    //Meto valores en una especie de Diccionario
    m.put("amalianumez@gmail.com", 924);
    m.put("cindynero@gmail.com", 921);
    m.put("cesarvazquez@gmail.com", 700);
    m.put("victortilla@gmail.com", 219);
    m.put("alanbrito@gmail.com", 577);
    m.put("estebanquito@gmail.com", 605);
    m.put("ivan.perez.8500@gmail.com", 850);

    //Pido los datos al usuario
    String usuarioIntroducido = JOptionPane.showInputDialog("Correo Electrónico: ");
    int contrasenaIntroducida = Integer.parseInt(JOptionPane.showInputDialog("Contraseña: "));

    int contador = 0;
    do {
      if (m.containsKey(usuarioIntroducido)) {
        if (m.get(usuarioIntroducido) == contrasenaIntroducida) {
          System.out.println("Ha accedido al área restringida");
          System.out.println("");
          contador=3;
        }
      } else {
        System.out.println("Intentelo de nuevo");
        System.out.println("");
        contador++;
        usuarioIntroducido = JOptionPane.showInputDialog("Correo Electrónico: ");
        contrasenaIntroducida = Integer.parseInt(JOptionPane.showInputDialog("Contraseña: "));
      }
    } while (contador < 3);

  }
}
