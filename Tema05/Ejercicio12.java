/**
 * Muestre los números múltiplos de 5 de 0 a 100 utilizando un bucle for
 *
 * @author Iván Pérez Molina
 */
public class Ejercicio12 {
  public static void main(String[] args) { 
	 int f1 = 0;
	 int f2 = 0;
	 
	 System.out.println("SUCESIÓN DE FIBONNACCI");
	 System.out.println("======================");
	 System.out.println("Introduce el numero de elementos de la sucesión que quieres que se muestre");
	 
	 int n = Integer.parseInt(System.console().readLine());
	 
	 if (n<=0){
	 }else if (n==1){
		 System.out.print("0");
	  } else if (n==2){
		 System.out.print("0,1");  
	  }else {
		 System.out.print("0,1, "); 
		 n = n - 2;
		 while (n>0){
			 if (n==1){
				 System.out.print(f1+f2); 
				 }
			 System.out.print(f1+f2+","); 
			 int aux = f1;
			 f1 = f2;
			 f2 = aux + f2;
			 n--;
			 }
		   n--;
		  }
    }
  }

