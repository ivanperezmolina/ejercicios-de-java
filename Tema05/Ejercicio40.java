/**
* EJERCICIO 40 ROMBO
*
* @author Iván Pérez Molina
*/

public class Ejercicio40{
  public static void main(String[] args) {
    //PIDO NUMERO 
    String linea;
    System.out.println("Introduce altura del rombo");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt( linea );
    
    int espaciosIzquierda = altura/2;
    int espaciosCentro =-1;
    
    
    if ((altura >=3) && (altura % 2 == 1)) {
        for (int h =0; h<altura;h++){
          //Espacios de la izquierda
          for (int e=0; e<espaciosIzquierda;e++){
             System.out.print(" ");   
            }
            
          System.out.print("*");  
          
          //Espacios centro
          for (int e=0; e<espaciosCentro;e++) {
          System.out.print(" "); 
        }
          if ((h>0)&&(h < altura - 1)) {
          System.out.print("*"); 
        }
        
           System.out.println("");   
          //Lados izquierdos
          if (h < altura /2){
          espaciosIzquierda--;   
          espaciosCentro +=2;
        } else{
          espaciosIzquierda++;
          espaciosCentro -=2;
          }
          }
         
        
        
      }else {
          System.out.println("Introduce los datos correctamennte ");
        }

}
}


