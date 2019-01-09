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
  private int kilometrosRecorridosBici;

  //Metodos
  //Constructor


  public Bicicleta(String marca, String modelo, int kilometrosRecorridosBici) {
    //super(kilometrosTotales);
    this.marca = marca;
    this.modelo = modelo;
    this.kilometrosRecorridosBici = kilometrosRecorridosBici;
  }



  public void andarBici() {
    System.out.println("Riin! Riin!");
  }
  
  public void caballitoBici(){
    System.out.println("Riiiiiiin!");
  }
  
  public void mostrarDatosBici(){
    System.out.println("El kilometraje de su bici es de: "+kilometrosRecorridosBici);
}

}
