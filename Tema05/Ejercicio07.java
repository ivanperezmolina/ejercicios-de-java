/**
 *Ejercicio 7 --> Caja Fuerte
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL SISTEMA DE LA CAJA FUERTE");
    
    //Pido la clave por primera vez
    String linea;
    System.out.println("Introduce la clave para desbloquear la caja ");
    linea = System.console().readLine();
    int clave;
    clave = Integer.parseInt( linea );
    
    
    
    //Compruebo lo introducido
    if (clave == 8500){
      System.out.println("Caja fuerte desbloqueada");
      } else {
            for (int intentos=0;intentos<4;intentos++){
                System.out.println("Esa no es la combinación");
                String lineaotra;
                System.out.println("Introduce la clave para desbloquear la caja por intentos");
                lineaotra = System.console().readLine();    
                clave = Integer.parseInt( lineaotra );
                
          if (clave==8500){
            System.out.println("Caja fuerte desbloqueada...");
            break;
          }
            
            }     
        }
  }
}
