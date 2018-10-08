/**
* Bandera de España
*
* @author Iván P
*/

public class Ejercicio25 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO A BANDERADEESPAÑA.ES");
    
    //Pido la altura    
    String linea;
    System.out.println("Introduce la altura de tu bandera ");
    linea = System.console().readLine();
    double altura;
    altura= Integer.parseInt( linea );
    
    //Pido la anchura
    String lineados;
    System.out.println("Introduce la anchura de tu bandera ");
    lineados = System.console().readLine();
    double anchura;
    anchura= Integer.parseInt( lineados );
    
    //Pido si quiere estanpado
    String estampado;
    System.out.println("¿Quiere estampado?");
    estampado = System.console().readLine();
    estampado = estampado.toUpperCase();
    double precioEstampado = 0;
      if (estampado.equals("SI")){
        precioEstampado= 2.50;
      } else if (estampado.equals("NO")){
        precioEstampado= 0.00;
        } else {
          System.out.println("Algo no va bien");
          }
    
    //Multiplico para obtener los cm2
    double centimetrosCuadrados= anchura * altura;
    
    //Precio final de la bandera
    double precioFinBandera;
    precioFinBandera = centimetrosCuadrados/100.0;
  
    
    //Gastos de envio
    double gastos;
    gastos=3.25;
    
    //TOTAL
    double total;
    total = precioFinBandera + precioEstampado + gastos;
    
    
    
    
  
          
    System.out.println("------------------------------------------");
    System.out.println("------------------------------------------");
              
      System.out.println("Altura de la Bandera                     "+altura);
      System.out.println("Anchura de la Bandera                    "+anchura);
      System.out.println("Bandera de "+centimetrosCuadrados+" cm²=                    " +precioFinBandera);
      System.out.println("Estampado                                "+precioEstampado);
      System.out.println("Gastos de envio                          "+gastos);      
      System.out.println("TOTAL                                    "+total);
    
}
}

