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
  private int kilometrosRecorridosCoche;

  //Metodos
  //Constructor
  public Coche(int kilometrosRecorridosCoche, String marca, String motor) {
    //super(kilometrosTotales);//Ya esta inicializado en Vehiculo
    this.marca = marca;
    this.motor = motor;
    this.kilometrosRecorridosCoche = kilometrosRecorridosCoche;
  }

  public void andarCoche() {
    System.out.println("Run! Run! Run!");
  }
  
  public void quemarRueda(){
    System.out.println("Ruuuuuuuuuuuuun!!!!!!!!!!!!!");
  }
  
    public void mostrarDatosCoche(){
    System.out.println("El kilometraje de su coche es de: "+kilometrosRecorridosCoche);
}

}
