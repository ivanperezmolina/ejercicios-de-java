
package ClasesYObjetos;

/**
 *
 * @author Ivan Perez
 */
public class Coche {
  //Atributos
  String color;
  String marca;
  int km;
  
  //Metodo
  public static void main(String [] args){
    Coche coche1 = new Coche(); //Creo un objeto
    
    coche1.color="Blanco"; //Relleno atributo color
    coche1.marca="Audi"; //Relleno atributo marca
    coche1.km=0; //Relleno atributo km
    
    //Imprimo como es el objeto
    
    System.out.println("El color del coche1 es: "+coche1.color);
    System.out.println("La marca del coche1 es: "+coche1.marca);
    System.out.println("El coche1 tiene "+coche1.km+" km");
    System.out.println("----------------------------------------");
    
    Coche coche2 = new Coche();
    
    coche2.color="Azul";
    coche2.marca="Renault";
    coche2.km=112000;
    
    System.out.println("El color del coche2 es: "+coche2.color);
    System.out.println("La marca del coche2 es: "+coche2.marca);
    System.out.println("El coche2 tiene "+coche2.km+" km");
    
    
    
  }
  
}
