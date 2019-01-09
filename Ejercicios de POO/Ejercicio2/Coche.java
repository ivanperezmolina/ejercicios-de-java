package Ejercicio2;

/**
 *
 * @author ivanp
 */
//extends Vehiculo: Coche herada los atributos de Vehiculo
public class Coche extends Vehiculo {

  //Atributos exclusivos de esta clase
  private String marca;
  private String motor;
  

  //Metodos
  //Constructor
  public Coche( String marca, String motor) {
    //super(kilometrosTotales);//Ya esta inicializado en Vehiculo
    this.marca = marca;
    this.motor = motor;
    
  }

  
  public String quemarRueda(){
    String ruedaQuemada="Ruuuuuuuuuuuuun!!!!!!!!!!!!!";
    
    return ruedaQuemada;
  }
  
 

}
