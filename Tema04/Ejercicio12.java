/**
* MINICUESTIONARIO
*
* @author Iván Pérez Molina
*/

public class Ejercicio12 {
  public static void main(String[] args) {

    //Declaro una variable que utilizare más adelante para contar los aciertos.
    int contador;
    contador = 0 ;
    
    
    //PREGUNTA 1
    System.out.println("¡¡EXAMINATE DE TUS CONOCIMINETOS!!");
    System.out.println("\n");
    String linea;
    System.out.println("1.¿Que estructura de JAVA es la correcta? ");
    System.out.println("1. if y else ");
    System.out.println("2. elso y salso");
    linea = System.console().readLine();
    int preguntaUno;
    preguntaUno = Integer.parseInt( linea );
    
    if (preguntaUno == 1){
      System.out.println("Correcto. Subes 1 al contador ");
      contador = contador + 1;
    } else {
      System.out.println("Incorrecto. No subes nada a tu contador ");
      contador = contador + 0;
      }
      
      
    //PREGUNTA 2
    System.out.println("\n");
    System.out.println("\n");
    String lineados;
    System.out.println("2.¿Como se llama la profesora de BBDD?");
    System.out.println("1.Eva");
    System.out.println("2.Bea");
    lineados = System.console().readLine();
    int preguntaDos;
    preguntaDos = Integer.parseInt( lineados );
    
    if (preguntaDos == 1){
      System.out.println("Correcto. Subes 1 al contador ");
      contador = contador + 1;
    } else {
      System.out.println("Incorrecto. No subes nada a tu contador ");
      contador = contador + 0;
      }
      
    //PREGUNTA 3
    System.out.println("\n");
    System.out.println("\n");
    String lineatres;
    System.out.println("3.¿Que configuración tienen nuestros teclados?");
    System.out.println("1.DFÑLOP");
    System.out.println("2.QWERTY");
    lineatres = System.console().readLine();
    int preguntaTres;
    preguntaTres = Integer.parseInt( lineatres );
    
    if (preguntaTres == 2){
      System.out.println("Correcto. Subes 1 al contador ");
      contador = contador + 1;
    } else {
      System.out.println("Incorrecto. No subes nada a tu contador ");
      contador = contador + 0;
      }
      
    //PREGUNTA 4
    System.out.println("\n");
    System.out.println("\n");
    String lineacuatro;
    System.out.println("4.¿Como se llama el profesor de programación?");
    System.out.println("1.Luis");
    System.out.println("2.Roberto");
    lineacuatro = System.console().readLine();
    int preguntaCuatro;
    preguntaCuatro = Integer.parseInt( lineacuatro );
    
    if (preguntaCuatro == 1){
      System.out.println("Correcto. Subes 1 al contador ");
      contador = contador + 1;
    } else {
      System.out.println("Incorrecto. No subes nada a tu contador ");
      contador = contador + 0;
      }
      
    //PREGUNTA 5
    System.out.println("\n");
    System.out.println("\n");
    String lineacinco;
    System.out.println("5.¿Que programa se suele hacer cuando se comienza a programar?");
    System.out.println("1.Hola mama");
    System.out.println("2.Hola Mundo");
    lineacinco = System.console().readLine();
    int preguntaCinco;
    preguntaCinco = Integer.parseInt( lineacinco );
    
    if (preguntaCinco == 2){
      System.out.println("Correcto. Subes 1 al contador ");
      contador = contador + 1;
    } else {
      System.out.println("Incorrecto. No subes nada a tu contador ");
      contador = contador + 0;
      }
      
    //PREGUNTA 6
    System.out.println("\n");
    System.out.println("\n");
    String lineaseis;
    System.out.println("6.¿Cuantas pesetas aprox son 1€?");
    System.out.println("1.116");
    System.out.println("2.256");
    lineaseis = System.console().readLine();
    int preguntaSeis;
    preguntaSeis = Integer.parseInt( lineaseis );
    
    if (preguntaSeis == 1){
      System.out.println("Correcto. Subes 1 al contador ");
      contador = contador + 1;
    } else {
      System.out.println("Incorrecto. No subes nada a tu contador ");
      contador = contador + 0;
      }
      
    //PREGUNTA 7
    System.out.println("\n");
    System.out.println("\n");
    String lineasiete;
    System.out.println("7.¿Que plataforma utilizamos en programación?");
    System.out.println("1.GitGit");
    System.out.println("2.GitHub");
    lineasiete = System.console().readLine();
    int preguntaSiete;
    preguntaSiete = Integer.parseInt( lineasiete );
    
    if (preguntaSiete == 2){
      System.out.println("Correcto. Subes 1 al contador ");
      contador = contador + 1;
    } else {
      System.out.println("Incorrecto. No subes nada a tu contador ");
      contador = contador + 0;
      }
      
    //PREGUNTA 8
    System.out.println("\n");
    System.out.println("\n");
    String lineaocho;
    System.out.println("8.¿Que plataforma utilizamos en BBDD?");
    System.out.println("1.Moodle");
    System.out.println("2.Roodle");
    lineaocho = System.console().readLine();
    int preguntaOcho;
    preguntaOcho = Integer.parseInt( lineaocho );
    
    if (preguntaOcho == 1){
      System.out.println("Correcto. Subes 1 al contador ");
      contador = contador + 1;
    } else {
      System.out.println("Incorrecto. No subes nada a tu contador ");
      contador = contador + 0;
      }
      
    //PREGUNTA 9
    System.out.println("\n");
    System.out.println("\n");
    String lineanueve;
    System.out.println("9.¿Que utilizo para declarar numeros enteros?");
    System.out.println("1.Double");
    System.out.println("2.Int");
    lineanueve = System.console().readLine();
    int preguntaNueve;
    preguntaNueve = Integer.parseInt( lineanueve );
    
    if (preguntaNueve == 2){
      System.out.println("Correcto. Subes 1 al contador ");
      contador = contador + 1;
    } else {
      System.out.println("Incorrecto. No subes nada a tu contador ");
      contador = contador + 0;
      }
      
    //PREGUNTA 10
    System.out.println("\n");
    System.out.println("\n");
    String lineadiez;
    System.out.println("10.¿Que utilizo para declarar numeros con decimales?");
    System.out.println("1.Double");
    System.out.println("2.Int");
    lineadiez = System.console().readLine();
    int preguntaDiez;
    preguntaDiez = Integer.parseInt( lineadiez );
    
    if (preguntaDiez == 1){
      System.out.println("Correcto. Subes 1 al contador ");
      contador = contador + 1;
    } else {
      System.out.println("Incorrecto. No subes nada a tu contador ");
      contador = contador + 0;
      }
          System.out.println("\n");
          System.out.println("\n");
          System.out.println("El número de aciertos en el test es de " +contador+ " aciertos");
      
      
    
    
    
    
    
    
    
      
    
    
  }
}















