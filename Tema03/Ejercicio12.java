/**
* Notas Programación
*
* @author Iván P
*/

public class Ejercicio12 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Introduce la nota del primer examen: ");
    linea = System.console().readLine();
    double primeraNota;
    primeraNota = Double.parseDouble( linea );

    System.out.print("¿Qué nota quieres sacar en el trimestre?: ");
    linea = System.console().readLine();
    double trimestre;
    trimestre = Double.parseDouble( linea );
    
    double segundaNota;
      
    
    segundaNota = ((trimestre * 100 - primeraNota * 40 )/ 60);
    

    System.out.println("Nota primer examen:  " + primeraNota);
    System.out.println("Desea una media de:  " + trimestre);
    System.out.println("Tiene que sacar en el segundo examen un:  ");
    System.out.print(segundaNota);   
  } 
}
