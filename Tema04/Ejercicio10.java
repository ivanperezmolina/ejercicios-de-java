/**
* Ejercicio que me muestra el horoscopo a partir del dia y el mes
*
* @author Iván Pérez Molina
*/

public class Ejercicio10 {
  public static void main(String[] args) {

    //Pedir los valores del día y mes
    System.out.println("BINVENIDO AL PROGRAMA PARA CONSULTAR SU HOROSCOPO");
    String linea;
    System.out.println("Introduce el día en el que naciste: ");
    linea = System.console().readLine();
    int dia;
    dia = Integer.parseInt( linea );
    
    String lineados;
    System.out.println("Introduce el mes en el que naciste: ");
    lineados = System.console().readLine();
    int mes;
    mes = Integer.parseInt( lineados );
    
    //Ir analizando para cada caso
      String nombreHoroscopo;
    
    switch (mes) {
      case 1:
          if (dia >= 20) {
            System.out.print("Tu signo del zodiaco es: ACUARIO ♒");
          } else {
            System.out.print("Tu signo del zodiaco es: CAPRICORNIO ♑");
          }
        break;
        
        
      case 2:
          if (dia >= 20) {
            System.out.print("Tu signo del zodiaco es: PISCIS ♓");
          } else {
            System.out.print("Tu signo del zodiaco es: ACUARIO ♒");
          }        
        break;
        
        
      case 3:
          if (dia >= 21) {
            System.out.print("Tu signo del zodiaco es: ARIES ♈");
          } else {
            System.out.print("Tu signo del zodiaco es: PISCIS ♓");
          }
        break;
        
      case 4:
          if (dia >= 20) {
            System.out.print("Tu signo del zodiaco es: TAURO ♉ ");
          } else {
            System.out.print("Tu signo del zodiaco es: ARIES ♈ ");
          }
        break;
        
      case 5:
          if (dia >= 21) {
            System.out.print("Tu signo del zodiaco es: GEMINIS ♊ ");
          } else {
            System.out.print("Tu signo del zodiaco es: TAURO ♉ ");
          }
        break;
        
      case 6:
          if (dia >= 20) {
            System.out.print("Tu signo del zodiaco es: CANCER ♋ ");
          } else {
            System.out.print("Tu signo del zodiaco es: GEMINIS ♊ ");
          }
        break;
        
      case 7:
          if (dia >= 23) {
            System.out.print("Tu signo del zodiaco es: LEO ♌");
          } else {
            System.out.print("Tu signo del zodiaco es: CANCER ♋");
          }
        break;
        
      case 8:
          if (dia >= 24) {
            System.out.print("Tu signo del zodiaco es: VIRGO ♍");
          } else {
            System.out.print("Tu signo del zodiaco es: LEO ♌");
          }
        break;
        
      case 9:
          if (dia >= 23) {
            System.out.print("Tu signo del zodiaco es: LIBRA ♎");
          } else {
            System.out.print("Tu signo del zodiaco es: VIRGO ♍");
          }
        break;
        
      case 10:
          if (dia >= 23) {
            System.out.print("Tu signo del zodiaco es: ESCORPIO ♏");
          } else {
            System.out.print("Tu signo del zodiaco es: LIBRA ♎");
          }
        break;
        
      case 11:
          if (dia >= 22) {
            System.out.print("Tu signo del zodiaco es: SAGITARIO ♐");
          } else {
            System.out.print("Tu signo del zodiaco es: ESCORPIO ♏");
          }
        break;
        
      case 12:
          if (dia >= 22) {
            System.out.print("Tu signo del zodiaco es: CAPRICORNIO ♑");
          } else {
            System.out.print("Tu signo del zodiaco es: SAGITARIO ♐");
          }
        break;
        
      default:
          
            System.out.print("NO PUEDO ENCONTRAR EL HOROSCOPO 😓😔😕😖");
          
    }
  }
}














