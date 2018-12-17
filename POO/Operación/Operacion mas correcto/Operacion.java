package ClasesYObjetos;

import java.util.Scanner;

/**
 *
 * @author Ivan Perez
 */
public class Operacion {

  //Atributos

  //Métodos
  //Metodo para pedir al usuario los dos numeros


  //Metodo para sumar ambos numeros
  public int sumar(int numero1, int numero2) {//En este caso no le paso nada como argumento. Podria crear un metodo que tome dos valores y en el main darselos al metodo
    int suma = numero1 + numero2;
    
    return suma;
  }
  
    //Metodo para restar ambos numeros
  public int restar(int numero1, int numero2) {
    int resta = numero1 - numero2;
    
    return resta;
  }
  
    //Metodo para multiplicar ambos numeros
  public int multiplicar(int numero1, int numero2) {
    int multiplicacion = numero1 * numero2;
    
    return multiplicacion;
  }
  
    //Metodo para dividir ambos numeros
  public int dividir(int numero1, int numero2) {
    int division = numero1 / numero2;
    
    return division;
  }
  
  
  

}
