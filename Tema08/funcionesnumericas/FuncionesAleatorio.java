/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones.funcionesnumericas;

/**
 *
 * @author ivanp
 */
public class FuncionesAleatorio {
  //////////////////////////////////////////////////////////////////////////////

  /**
   * Ejercicio 20-->generaArrayInt:Genera un array de tamaño n con números 
   * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
   * 
   *
   * @param pos
   * @return La posición de un número
   */
  public static int[] generaArrayInt(int longitud) {

    int[] miArray = new int[longitud];

    for (int i = 0; i < longitud; i++) {
      miArray[i] = (int) (Math.random() * 10);
      
    }   

    return miArray;
  }
  


}
