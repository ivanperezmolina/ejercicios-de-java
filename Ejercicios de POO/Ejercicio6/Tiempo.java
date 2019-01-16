
package Ejercicio6;

/**
 *
 * @author ivanp
 */
public class Tiempo {
  //Atributos
  private int horas;
  private int minutos;
  private int segundos;
  
  //Métodos
 
  //Constructor
  public Tiempo(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }
  
  public Tiempo suma(Tiempo tiempo2){
    int sumaHoras=0;
    int sumaMinutos=0;
    int sumaSegundos=0;
    
    sumaSegundos=this.segundos+tiempo2.segundos;
    sumaMinutos=this.minutos+tiempo2.minutos;
    sumaHoras=this.horas+tiempo2.horas;
    
        if (sumaSegundos >= 60) {
      sumaMinutos = sumaMinutos + 1;
      sumaSegundos =sumaSegundos-60;
    }

    if (sumaMinutos >= 60) {
      sumaHoras = sumaHoras + 1;
      sumaMinutos = sumaMinutos-60;
    }

    
   return new Tiempo(sumaHoras,sumaMinutos,sumaSegundos);
  }
  
    public Tiempo resta(Tiempo tiempo2){
    int restaHoras=0;
    int restaMinutos=0;
    int restaSegundos=0;
    
    restaSegundos=this.segundos-tiempo2.segundos;
    restaMinutos=this.minutos-tiempo2.minutos;
    restaHoras=this.horas-tiempo2.horas;
    
        if (restaSegundos >= 60) {
      restaMinutos = restaMinutos + 1;
      restaSegundos =restaSegundos-60;
    }

    if (restaMinutos >= 60) {
      restaHoras = restaHoras + 1;
      restaMinutos = restaMinutos-60;
    }

    
   return new Tiempo(restaHoras,restaMinutos,restaSegundos);
  }
  
    //Pasar a String el numerador y denominador   
  @Override
  public String toString() {
    return horas + " h " + minutos + " m " + segundos + " s ";
  }
  
  
}
