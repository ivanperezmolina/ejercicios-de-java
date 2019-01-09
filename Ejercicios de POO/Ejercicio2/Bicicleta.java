package Ejercicio2;

/**
 *
 * @author ivanp
 */
//extends Vehiculo: Coche herada los atributos de Vehiculo
public class Bicicleta extends Vehiculo {

  //Atributos exclusivos de esta clase
  private String marca;
  private String modelo;
  

  //Metodos
  //Constructor


  public Bicicleta(String marca, String modelo) {
    //super(kilometrosTotales);
    this.marca = marca;
    this.modelo = modelo;
    
  }


  
  public String caballitoBici(){
    String caballito="RIIIIN";
    return caballito;
  }
  


}
