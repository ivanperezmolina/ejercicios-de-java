/**
 * Sentencia múltiple (switch) Ejercicio3
 *
 * @author Iván Pérez
 */

public class Ejercicio03 {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca un numero de semana: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String nombreDelDia;
    
    switch (dia) {
      case 1:
        nombreDelDia = "Lunes";
        break;
      case 2:
        nombreDelDia = "Martes";
        break;
      case 3:
        nombreDelDia = "Miercoles";
        break;
      case 4:
        nombreDelDia = "Jueves";
        break;
      case 5:
        nombreDelDia = "Viernes";
        break;
      case 6:
        nombreDelDia = "Sabado";
        break;
      case 7:
        nombreDelDia = "Domingo";
        break;

      default:
        nombreDelDia = "no existe ese dia";
    }

    System.out.println("Día " + dia + ": " + nombreDelDia);
  }
}
