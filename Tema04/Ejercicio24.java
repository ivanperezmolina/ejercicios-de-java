/**
* NOmina
*
* @author Iván P
*/

public class Ejercicio24 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL GENERADOR DE NÓMINAS");
    //Pido el tipo de cargo
    String cargo;
    System.out.println("Introduce tu cargo en la empresa ");
    System.out.println("-Junior");
    System.out.println("-Senior");
    System.out.println("-Jefe ");
    cargo = System.console().readLine();
    cargo = cargo.toUpperCase();
    double sueldoBase = 0;
    
    if (cargo.equals("JUNIOR")){
       sueldoBase=950;
      } else if (cargo.equals("SENIOR")){
        sueldoBase=1200;
        } else if (cargo.equals("JEFE")){
          sueldoBase=1600;
          } else {
            System.out.println ("Algo ha fallado");
            }
        System.out.println("------------------------------------------");
    
    //Pido los dias de viajes
    String viaje;
    System.out.println("Introduce cuantos días has viajado: ");    
    viaje = System.console().readLine();
    double diasViajes;
    diasViajes= Integer.parseInt( viaje );    
    System.out.println("------------------------------------------");
    
    //Operaciones con los dias trabajados
    double sueldoConViajes;
    sueldoConViajes = sueldoBase +(30*diasViajes);   

    
    //Pido el IRPF
    String codigoCivil;
    System.out.println("Introduce tu estado civil");
    System.out.println("Casado");
    System.out.println("Soltero");   
    codigoCivil = System.console().readLine();
    codigoCivil = codigoCivil.toUpperCase();
    double IVA;
    double precioFin =0;
    
    if (codigoCivil.equals("CASADO")){
       IVA = (sueldoConViajes/100)*20;
       precioFin = sueldoConViajes - IVA;
      } else if (codigoCivil.equals("SOLTERO")){
       IVA = (sueldoConViajes/100)*25;
       precioFin = sueldoConViajes - IVA;
        } else {
          System.out.println("Algo ha fallado");
          }     
    System.out.println("------------------------------------------");
    System.out.println("------------------------------------------");
              
      System.out.println("Sueldo Base                    "+sueldoBase);
      System.out.println("Sueldo contando viajes         "+sueldoConViajes);
      System.out.println("TOTAL                          "+precioFin);
    
}
}

