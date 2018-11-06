/**
 * Tema 6 Ejercicio 11
 *
 * @author Iván Pérez Molina
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("EJERCICIO 6 ");
    
    //Contadores
    	int contadorsuspensos = 0;
		int contadorbienes = 0;
		int contadornotables = 0;
		int contadorsobresalientes = 0;
    ////////////
    
    //Genero una lista de 20 notas generadas al azar
    for (int i = 1; i<=20; i++){     
		int azar = (int)(Math.random()*11) ;
		
		//Compruebo el valor de esa nota
		String calificacion = "";
		
		switch (azar){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				calificacion = "suspenso";
				contadorsuspensos++;
			break;
			
			case 5:
			case 6:
				calificacion = "bien";
				contadorbienes++;
			break;
			
			case 7:
			case 8:
				calificacion = "notable";
				contadornotables++;
			break;
			
			case 9:
			case 10:
				calificacion = "sobresaliente";
				contadorsobresalientes++;
			break;			
		}
		////////////////////////////////
		
		//Muestro en pantalla
		System.out.println("-----------------------------------");
		System.out.println("Se ha generado la nota "+azar+" y esta nota es igual a = "+calificacion);
		/////////////////////
		

	}    
    ///////////////
    
    	//Muestro el resultado del contador
		System.out.println("-----------------------------------");
		System.out.println("El numero de suspensos es de "+contadorsuspensos);
		System.out.println("El numero de bienes es de "+contadorbienes);
		System.out.println("El numero de notables es de "+contadornotables);
		System.out.println("El numero de sobresalientes es de "+contadorsobresalientes);
		//////////////////
    
    

  }
}

