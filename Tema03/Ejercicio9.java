/**
* Ejercicio 9 del Tema 3
*
* @author Iván Pérez Molina
*/

public class Ejercicio9 {
  public static void main(String[] args) {

    String linea;
    System.out.print("Por favor, introduzca el radio de su cono: ");
    linea = System.console().readLine();
    double radio;
    radio = Double.parseDouble( linea );
    
  
    System.out.print("Por favor, introduzca la altura  de su cono: ");
    linea = System.console().readLine();
    double altura;
    altura = Double.parseDouble( linea );
    
    //Importante: Tenemos que poner 1.0 y 3.0 porque si no el progranma lo reconoce como 0 y nos saldra siempre 0
    double total;
    total = (1.0/3.0)  * (Math.PI) * (radio*radio) * (altura);

    System.out.println("El radio del cono es: " + radio);
    System.out.println("La altura del cono es: " + altura);
    System.out.println("El volumen del cono es: " + total);   
  } 
}
