package ClasesYObjetos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan Perez
 */
public class PruebaOperacion {

  public static void main(String[] args) {
    //Creo variables
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    
    //Pido numeros
    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Numero1:"));
    int n2 = Integer.parseInt(JOptionPane.showInputDialog("Numero2:"));
    
    //Creo objeto
    Operacion op = new Operacion();

    //Pruebo los metodos
    suma = op.sumar(n1,n2);//Tambien puedo imprimir directamente esto.
    resta = op.restar(n1,n2);
    multiplicacion = op.multiplicar(n1,n2);
    division = op.dividir(n1,n2);
    
    //Imprimo (Tambien puedo hacer un mostrar resultados y pasarle como argumentos los return)
    System.out.println("La suma es: "+suma);
    System.out.println("La resta es: "+resta);
    System.out.println("La multiplicacion es :"+multiplicacion);
    System.out.println("La division es :"+division);
    
    //
  }

}
