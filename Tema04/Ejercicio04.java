/**
* Ejercicio 8 del Tema 3 ampliado en el Tema 4
*
* @author Iván Pérez Molina
*/

public class Ejercicio04 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Por favor, introduce las horas trabajadas: ");
    linea = System.console().readLine();
    double horas;
    horas = Double.parseDouble( linea );
    
    if (horas <=40) {
      double totalMenor;
      totalMenor = (horas) * 12;      
      System.out.print("El sueldo semanal que le corresponde es de: " + totalMenor);
      
    }
    
    else if (horas > 41){
      double totalMayor;
      
      double diferencia;
      diferencia = horas - 40;
      double extra;
      extra = (diferencia) * 16;
      
      totalMayor = 40 * 12 + extra;      
      System.out.print("El sueldo semanal que le corresponde es de: " + totalMayor);
    }
    
    
    
    

    
  } 
}
