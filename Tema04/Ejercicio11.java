/**
* Ejercicio que me calcula los segundos que faltan para llegar a medianoche
*
* @author Iván Pérez Molina
*/

public class Ejercicio11 {
  public static void main(String[] args) {

    //Pedir los valores de la hora y minutos
    System.out.println("BINVENIDO AL PROGRAMA PARA CALCULAR CUANTO FALTA PARA LA MEDIANOCHE");
    String linea;
    System.out.println("Introduce la hora actual: ");
    linea = System.console().readLine();
    int hora;
    hora = Integer.parseInt( linea );
    
    String lineados;
    System.out.println("Introduce los minutos actuales: ");
    lineados = System.console().readLine();
    int minutos;
    minutos = Integer.parseInt( lineados );
    
    //Paso las horas a segundos
      int horasSegundos;
      horasSegundos = hora * 3600;
      
    //Paso los minutos a segundos
      int minutosSegundos;
      minutosSegundos = minutos * 60;
      
    //Calculos los segundos actuales
      int totalSegundos;
      totalSegundos = (horasSegundos) + (minutosSegundos);
      
    //Pienso cuantos segundos hay en un día
      int segundosAlDia;
      segundosAlDia = 86400;
      
    //Calculo los segundos que quedan para la medianoche
      int total;
      total = segundosAlDia - totalSegundos;
      
    //Muestro por pantalla
      System.out.println ("☕");
      System.out.println("Para que llegue la media noche quedan: ");
      System.out.println(total + "  segundos");
      
    
    
  }
}















