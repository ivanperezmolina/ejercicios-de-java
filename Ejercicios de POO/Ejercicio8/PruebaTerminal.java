package Ejercicio8;

/**
 *
 * @author ivanp
 */
public class PruebaTerminal {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Terminal t1 = new Terminal("678 11 22 33");
    Terminal t2 = new Terminal("644 74 44 69");
    Terminal t3 = new Terminal("622 32 89 09");
    Terminal t4 = new Terminal("664 73 98 18");
    System.out.println("NUMEROS DE TELEFONO");
    System.out.println("Nº "+t1.getNumero()+" - "+t1.getTiempoConversacion()+"s de conversación");
    System.out.println("Nº "+t2.getNumero()+" - "+t2.getTiempoConversacion()+"s de conversación");
    System.out.println("Nº "+t3.getNumero()+" - "+t3.getTiempoConversacion()+"s de conversación");
    System.out.println("Nº "+t4.getNumero()+" - "+t4.getTiempoConversacion()+"s de conversación");

    t1.llama(t2, 320);
    t2.llama(t4, 100);
//    t1.llama(t3, 200);
//    System.out.println(t1);
//    System.out.println(t2);
//    System.out.println(t3);
//    System.out.println(t4);

    System.out.println("Nº "+t1.getNumero()+" - "+t1.getTiempoConversacion()+"s de conversación");
    System.out.println("Nº "+t2.getNumero()+" - "+t2.getTiempoConversacion()+"s de conversación");
    System.out.println("Nº "+t3.getNumero()+" - "+t3.getTiempoConversacion()+"s de conversación");
    System.out.println("Nº "+t4.getNumero()+" - "+t4.getTiempoConversacion()+"s de conversación");
  }

}
