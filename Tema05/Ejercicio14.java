/**
* Programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
*
* @author Iván Pérez Molina
*/

public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL PROGRAMA PARA CALCULAR LA POTENCIA");
    
    //Pido la base
    String linea;
    System.out.println("Introduce la base para calcular la potencia ");
    linea = System.console().readLine();
    double base;
    base = Integer.parseInt( linea );
    
    //Pido el exponente
    String lineados;
    System.out.println("Introduce el exponente para calcular la potencia ");
    lineados = System.console().readLine();
    double exponente;
    exponente = Integer.parseInt( lineados );   
    
	//Calculo la potencia
	double solucion;
	solucion = Math.pow(base,exponente);		
	System.out.println(base + " elevado a  " + exponente + " es igual a " + solucion);
  
   
}
}


