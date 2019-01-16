package Ejercicio5;

/**
 *
 * @author ivanp
 */
public class PedidosPizza {

  public static void main(String[] args) {
    Pizza p1 = new Pizza("margarita", "mediana");   
    p1.encargar(p1);
    Pizza p2 = new Pizza("funghi", "familiar");
    p2.encargar(p2);
    Pizza p3 = new Pizza("cuatro quesos", "mediana");
    p3.encargar(p3);
    
    p2.sirve(p2);
    System.out.println("La pizza 1 es "+p1.getTipo()+" "+p1.getTamaño()+" , "+p1.getEstado());
    System.out.println("La pizza 2 es "+p2.getTipo()+" "+p2.getTamaño()+" , "+p2.getEstado());
    System.out.println("La pizza 3 es "+p3.getTipo()+" "+p3.getTamaño()+" , "+p3.getEstado());
    
    
    
 
    System.out.println("pedidas: " + Pizza.getTotalPedidas());
    System.out.println("servidas: " + Pizza.getTotalServidas());
  }
}
