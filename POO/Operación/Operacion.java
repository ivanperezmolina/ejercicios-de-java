package ClasesYObjetos;

import java.util.Scanner;

/**
 *
 * @author Ivan Perez
 */
public class Operacion {

  //Atributos
  int numero1;
  int numero2;
  int suma;
  int resta;
  int multiplicacion;
  int division;

  //Métodos
  //Metodo para pedir al usuario los dos numeros
  public void leerNumeros() {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el primer numero:  ");
    numero1 = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el segundo numero:  ");
    numero2 = Integer.parseInt(s.nextLine());
  }

  //Metodo para sumar ambos numeros
  public void sumar() {
    suma = numero1 + numero2;
  }
  
    //Metodo para restar ambos numeros
  public void restar() {
    resta = numero1 - numero2;
  }
  
    //Metodo para multiplicar ambos numeros
  public void multiplicar() {
    multiplicacion = numero1 * numero2;
  }
  
    //Metodo para dividir ambos numeros
  public void dividir() {
    division = numero1 / numero2;
  }
  
  //Metodo para mostrar el resultado
  
  public void mostrarResultados(){
    System.out.println("La suma es: "+suma);
    System.out.println("La resta es "+resta);
    System.out.println("La multiplicacion es "+multiplicacion);
    System.out.println("La division es "+division);
  }
}
