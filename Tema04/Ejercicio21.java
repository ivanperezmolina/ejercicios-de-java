/**
* Notas Programación
*
* @author Iván P
*/

public class Ejercicio21 {
  public static void main(String[] args) {

    //Pido las notas de los dos examenes
    String linea;
    System.out.print("Introduce la nota del primer examen: ");
    linea = System.console().readLine();
    double primeraNota;
    primeraNota = Double.parseDouble( linea );
    
    String lineados;
    System.out.print("Introduce la nota del segundo examen: ");
    lineados = System.console().readLine();
    double segundaNota;
    segundaNota = Double.parseDouble( lineados );
    
    //Calculo la media de los examenes
    double media;
    media =(primeraNota + segundaNota)/2;
    
    //Comparo las medias
    if (media >= 5){
        System.out.println("Enhorabuena, estas aprobado. No debes presentarte a recuperar");
        System.out.println("Tu media es de "+media);
        } else {
              //Pido que diga A si ha superado la recuperación y N si no
              String recu;
              System.out.println("Introduce A si superaste la recuperación y N si no ");
              recu = System.console().readLine();
              if (recu.equals("A")){
                    System.out.println("Has aprobado la recuperación. APROBADO!");
                    System.out.println("La nota en el boletin es de 5");
                  } else {
                    System.out.println("Has suspendido la recuperación. SUSPENDES!");
                    //System.out.println("La nota en el boletin es de: ") +media;
              
            
          
          
          
          }


    
     
  } 
}
}
