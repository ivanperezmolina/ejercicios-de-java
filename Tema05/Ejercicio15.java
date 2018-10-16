/**
* Programa que pida una base y un exponente (entero positivo) y que calcule la potencia descendiente
*
* @author Iván Pérez Molina
*/

public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL PROGRAMA PARA CALCULAR LA POTENCIA DESCENDIENTE");
    
    //Pido la base
    String linea;
    System.out.println("Introduce la base para calcular la potencia ");
    linea = System.console().readLine();
    double base;
    base = Integer.parseInt( linea );
    
    //Pido la altura
    String lineados;
    System.out.println("Introduce el exponente para calcular la potencia ");
    lineados = System.console().readLine();
    double exponente;
    exponente = Integer.parseInt( lineados );   
    
	//Calculo la potencia decreciente
	for (double i = 1; i<=exponente; i++){	
		
		double solucion;
		solucion = ((base)*(base) * i);
		System.out.println(base + " elevado a  " + i + " es igual a " + solucion);
		}
	
	
	
	
	

  
   
}
}


