/**
* Ejercicio 22
*
* @author Iván Pérez Molina
*/

public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL PROGRAMA QUE LE DICE CUANTO QUEDA PARA EL FINDE");  
    //Pedir los valores de la hora y minutos

    String linea;
    System.out.println("Introduce la hora actual: ");
    linea = System.console().readLine();
    int hora;
    hora = Integer.parseInt( linea );
    
    String lineados;
    System.out.println("Introduce los minutos actuales: ");
    lineados = System.console().readLine();
    int minutos;
    minutos = Integer.parseInt( lineados );
    
    //Paso las horas a segundos
      int horasSegundos;
      horasSegundos = hora * 3600;
      
    //Paso los minutos a segundos
      int minutosSegundos;
      minutosSegundos = minutos * 60;
      
    //Calculos los segundos actuales
      int totalSegundos;
      totalSegundos = (horasSegundos) + (minutosSegundos);
      
    //Pienso los segundos de un dia
      int segundosDia;
      segundosDia=86400;
      
    //Evaluo día a día
    
        System.out.println("Por favor, introduzca el dia de la semana. Siendo Lunes 1 y Viernes 5: ");
        int dia = Integer.parseInt(System.console().readLine());
        String nombreDelDia;
        
        double cuanto;
        double cuentas;
        double totaltotal;
    
    switch (dia) {
      case 1:
        nombreDelDia = "Lunes";
        cuanto= totalSegundos;
        cuentas= 399600 - cuanto;
        totaltotal= cuentas*0.016667; 
        if (totaltotal < 0){
          System.out.println("FECHA NO VALIDA");
        } else
        {System.out.println("Para el fin de semana quedan "+totaltotal+ " minutos");  }
        break;
      case 2:
        nombreDelDia = "Martes";
        cuanto = segundosDia + totalSegundos;
        cuentas= 399600 - cuanto;
        totaltotal=cuentas * 0.016667;
        if (totaltotal < 0){
          System.out.println("FECHA NO VALIDA");
        } else
        {System.out.println("Para el fin de semana quedan "+totaltotal+ " minutos");  }
        break;
      case 3:
        nombreDelDia = "Miercoles";
        cuanto = (segundosDia*2)+totalSegundos;
        cuentas= 399600 - cuanto;
        totaltotal= cuentas*0.016667;
        if (totaltotal < 0){
          System.out.println("FECHA NO VALIDA");
        } else
        {System.out.println("Para el fin de semana quedan "+totaltotal+ " minutos");  } 
        break;
      case 4:
        nombreDelDia = "Jueves";
        cuanto = (segundosDia*3)+totalSegundos;
        cuentas= 399600 - cuanto;
        totaltotal= cuentas*0.016667;
        if (totaltotal < 0){
          System.out.println("FECHA NO VALIDA");
        } else
        {System.out.println("Para el fin de semana quedan "+totaltotal+ " minutos");  } 
        break;
      case 5:
        nombreDelDia = "Viernes";
        cuanto=(segundosDia*4)+totalSegundos;
        cuentas= 399600 - cuanto;
        totaltotal= cuentas*0.016667;
        if (totaltotal < 0){
          System.out.println("FECHA NO VALIDA");
        } else
        {System.out.println("Para el fin de semana quedan "+totaltotal+ " minutos");  }
        break;
      default:
        nombreDelDia = "no existe ese dia";
    } 
      
      
      
      
    
    
   
    
    
    
  }
}















