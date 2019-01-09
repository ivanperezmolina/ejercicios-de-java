
package Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan Perez
 */
public class PruebaCaballo {

  public static void main(String[] args) {
    //Creo objetos (Es decir, caballos)
      Caballo caballo1 = new Caballo();
      Caballo caballo2 = new Caballo();
      
      
    //Le doy los atributos a mis objetos
      caballo1.edad = 3;
      caballo1.peso = 50;
      caballo1.pelo = "Liso";
      caballo1.registro = "8751htrw";
      
      caballo2.raza = "Purasangre";
      caballo2.registro = "9876yuhj";
      
    //Vamos a imprimir los datos de los caballo
    
    //Pido de que caballo se intenta buscar datos    
    
    int queCaballo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de su caballo"));
    
    switch(queCaballo){
      case 1:
         System.out.println("REGISTRO= "+caballo1.registro);
         System.out.println("La edad del caballo 1 es de "+caballo1.edad+" años");
         System.out.println("El peso del caballo 1 es de "+caballo1.peso+" kg");
         System.out.println("El pelo del caballo 1 es "+caballo1.pelo);     
      break;
      
      case 2:
        System.out.println("REGISTRO= "+caballo2.registro);
        System.out.println("El caballo 2 es de la raza "+caballo2.raza);
      break;
      
      default:
        System.out.println("NO EXISTEN REGISTROS DE SU CABALLO. LLAME AL 987654321");
      break;
    }
    

      
      
  }
  
}
