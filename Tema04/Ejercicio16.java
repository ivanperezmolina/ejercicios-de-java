/**
* Infidelidad de nuestra pareja
*
* @author Iván Pérez Molina
*/

public class Ejercicio16 {
  public static void main(String[] args) {

    //Declaro una variable que utilizare más adelante para contar los aciertos.
    int contador;
    contador = 0 ;
    
    
    //PREGUNTA 1
    System.out.println("Bienvenido al test de infidelidad. Descubre si tu pareja te será infiel!!");
    System.out.println("\n");
    System.out.println("Contesta con V o F");
    String linea;
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    linea = System.console().readLine();
    //int preguntaUno;
    //preguntaUno = Integer.parseInt( linea );
    
    if (linea.equals("V")){
      System.out.println("HAS CONTESTADO VERDADERO");
      contador = contador + 3;
    } else {
      System.out.println("HAS CONTESTADO FALSO ");

      }
      
      
    //PREGUNTA 2
    System.out.println("\n");
    System.out.println("\n");
    String lineados;
    System.out.println("2. Ha aumentado sus gastos de vestuario");
    lineados = System.console().readLine();
    //int preguntaDos;
    //preguntaDos = Integer.parseInt( lineados );
    
    if (lineados.equals("V")){
      System.out.println("HAS CONTESTADO VERDADERO ");
      contador = contador + 3;
    } else {
      System.out.println("HAS CONTESTADO FALSO ");
      }
      
    //PREGUNTA 3
    System.out.println("\n");
    System.out.println("\n");
    String lineatres;
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    lineatres = System.console().readLine();
    //int preguntaTres;
    //preguntaTres = Integer.parseInt( lineatres );
    
    if (lineatres.equals("V")){
      System.out.println("HAS CONTESTADO VERDADERO ");
      contador = contador + 3;
    } else {
      System.out.println("HAS CONTESTADO FALSO ");
      }
      
    //PREGUNTA 4
    System.out.println("\n");
    System.out.println("\n");
    String lineacuatro;
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    
    lineacuatro = System.console().readLine();
    //int preguntaCuatro;
    //preguntaCuatro = Integer.parseInt( lineacuatro );
    
    if (lineacuatro.equals("V")){
      System.out.println("HAS CONTESTADO VERDADERO");
      contador = contador + 3;
    } else {
      System.out.println("HAS CONTESTADO FALSO ");
      }
      
    //PREGUNTA 5
    System.out.println("\n");
    System.out.println("\n");
    String lineacinco;
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    lineacinco = System.console().readLine();
    //int preguntaCinco;
    //preguntaCinco = Integer.parseInt( lineacinco );
    
    if (lineacinco.equals("V")){
      System.out.println("HAS CONTESTADO VERDADERO");
      contador = contador + 3;
    } else {
      System.out.println("HAS CONTESTADO FALSO");
      }
      
    //PREGUNTA 6
    System.out.println("\n");
    System.out.println("\n");
    String lineaseis;
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    lineaseis = System.console().readLine();
    //int preguntaSeis;
    //preguntaSeis = Integer.parseInt( lineaseis );
    
    if (lineaseis.equals("V")){
      System.out.println("HAS CONTESTADO VERDADERO ");
      contador = contador + 3;
    } else {
      System.out.println("HAS CONTESTADO FALSO");
      }
      
    //PREGUNTA 7
    System.out.println("\n");
    System.out.println("\n");
    String lineasiete;
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    lineasiete = System.console().readLine();
    //int preguntaSiete;
    //preguntaSiete = Integer.parseInt( lineasiete );
    
    if (lineasiete.equals("V")){
      System.out.println("HAS CONTESTADO VERDADERO ");
      contador = contador + 3;
    } else {
      System.out.println("HAS CONTESTADO FALSO");
      contador = contador + 0;
      }
      
    //PREGUNTA 8
    System.out.println("\n");
    System.out.println("\n");
    String lineaocho;
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    lineaocho = System.console().readLine();
    //int preguntaOcho;
    //preguntaOcho = Integer.parseInt( lineaocho );
    
    if (lineaocho.equals("V")){
      System.out.println("HAS CONTESTADO VERDADERO");
      contador = contador + 3;
    } else {
      System.out.println("HAS CONTESTADO FALSO ");
      }
      
    //PREGUNTA 9
    System.out.println("\n");
    System.out.println("\n");
    String lineanueve;
    System.out.println("9. Has notado que últimamente se perfuma más");
    lineanueve = System.console().readLine();
    //int preguntaNueve;
    //preguntaNueve = Integer.parseInt( lineanueve );
    
    if (lineanueve.equals("V")){
      System.out.println("HAS CONTESTADO VERDADERO ");
      contador = contador + 3;
    } else {
      System.out.println("HAS CONTESTADO FALSO ");
      contador = contador + 0;
      }
      
    //PREGUNTA 10
    System.out.println("\n");
    System.out.println("\n");
    String lineadiez;
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    lineadiez = System.console().readLine();
    //int preguntaDiez;
    //preguntaDiez = Integer.parseInt( lineadiez );
    
    if (lineadiez.equals("V")){
      System.out.println("HAS CONTESTADO VERDADERO ");
      contador = contador + 3;
    } else {
      System.out.println("HAS CONTESTADO FALSO");
      contador = contador + 0;
      }
          System.out.println("\n");
          System.out.println("\n");
          System.out.println("El número de 'VERDADEROS' en el test es de " +contador);
          
          
          if ((contador <=30) && (contador >=22)){
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza."); 
          } else { if ((contador <22)&&(contador > 11)){
                     System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
                } else {
                        System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
                  }
            
            }
      
      
    
    
    
    
    
    
    
      
    
    
  }
}















