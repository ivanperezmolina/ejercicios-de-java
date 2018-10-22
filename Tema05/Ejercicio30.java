/**
Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero.
 * 
 * @author Iván Pérez Molina
 */
 
import java.util.Scanner;
public class Ejercicio30 {

	public static void main(String[] args) {
	  
		System.out.println("BIENVENIDO AL PROGRAMA ");
    
    //Pedir el valores de la hora 
    
    System.out.println("Primer Dato ");   
     
    String linea;
    System.out.println("DÍA: ");
    linea = System.console().readLine();
    int diauno;
    diauno = Integer.parseInt( linea );
    
    String lineados;
    System.out.println("Hora: ");
    lineados = System.console().readLine();
    int horauno;
    horauno = Integer.parseInt( lineados );
    
    System.out.println("Segundo Dato "); 
    
    String lineatres;
    System.out.println("DÍA : ");
    lineatres = System.console().readLine();
    int diados;
    diados = Integer.parseInt( lineatres );
    
    String lineacuatro;
    System.out.println("Hora: ");
    lineacuatro = System.console().readLine();
    int horados;
    horados = Integer.parseInt( lineacuatro );
    
    int contadorprimerdia=0;
    int contadorsegundodia=0;
    String nombrePrimerDia;
    String nombreSegundoDia;
    
    
    switch(diauno) {
      
     
        case 1:
        contadorprimerdia=0;
          nombrePrimerDia = "lunes";
          break;

        case 2:
          contadorprimerdia=1;
          nombrePrimerDia = "martes";
          break;
        
  
        case 3:
          contadorprimerdia=2;
          nombrePrimerDia = "miercoles";
          break;
       
        case 4:
         contadorprimerdia=3;
          nombrePrimerDia = "jueves";
          break;
        
        case 5:
          contadorprimerdia=4;
          nombrePrimerDia = "viernes";
          break;
        
        case 6:
          contadorprimerdia=5;
          nombrePrimerDia = "sábado";
          break;
       
        case 7:
          contadorprimerdia=6;
          nombrePrimerDia = "domingo";
          break;
        default:
          contadorprimerdia=0;
      }
      
      

        switch(diados) {
      
     
        case 1:
        contadorsegundodia=0;
          nombreSegundoDia = "lunes";
          break;

        case 2:
          contadorsegundodia=1;
          nombreSegundoDia = "martes";
          break;
        
  
        case 3:
          contadorsegundodia=2;
          nombreSegundoDia = "miercoles";
          break;
       
        case 4:
         contadorsegundodia=3;
          nombreSegundoDia = "jueves";
          break;
        
        case 5:
          contadorsegundodia=4;
          nombreSegundoDia = "viernes";
          break;
        
        case 6:
          contadorsegundodia=5;
          nombreSegundoDia = "sábado";
          break;
       
        case 7:
          contadorsegundodia=6;
          nombreSegundoDia = "domingo";
          break;
        default:
          contadorsegundodia=0;
      }



	} 
}
  

