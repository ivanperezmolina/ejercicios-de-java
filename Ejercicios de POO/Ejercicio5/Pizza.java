
package Ejercicio5;

/**
 *
 * @author ivanp
 */
public class Pizza {
  //Atributos
    private static int totalPedidas; //A. de clase
    private static int totalServidas; //A.de clase  
    private String tipo;
    private String tamaño; 
    private String estado;
    
  
  //Métodos
    //Constructor
  public Pizza(String tipo, String tamaño) {
    this.tipo = tipo;
    this.tamaño = tamaño;
    
    }

    //Getter y Setter

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static void setTotalPedidas(int totalPedidas) {
    Pizza.totalPedidas = totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public static void setTotalServidas(int totalServidas) {
    Pizza.totalServidas = totalServidas;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getTamaño() {
    return tamaño;
  }

  public void setTamaño(String tamaño) {
    this.tamaño = tamaño;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
  
  
  
  


  

  //Otros
  public String encargar(Pizza p){
    String vacio ="";
    vacio="pedida";
    
    p.estado="pedida";
    
    Pizza.totalPedidas=Pizza.totalPedidas+1;
    
    return vacio;
  }
  
  
  public String sirve(Pizza p){
    String uno ="";
    uno="servida";
    
    p.estado="servida";
    
    Pizza.totalServidas=Pizza.totalServidas+1;
    
    return uno;
  }
  
}
