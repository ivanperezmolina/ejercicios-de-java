/**
* Pasar por caja
*
* @author Iván P
*/

public class Ejercicio23 {
  public static void main(String[] args) {
    System.out.println("BIENVENIDO A LA CAJA VIRTUAL DE PC COMPONENTES");
    //Pido el precio base
    String linea;
    System.out.println("Introduce el precio Base del artículo: ");
    linea = System.console().readLine();
    double precioBase;
    precioBase = Double.parseDouble( linea );
    System.out.println("------------------------------------------");
    
    //Pido el tipo de IVA a aplicar    
    String iva;
    System.out.println("Introduce el tipo de IVA a aplicar: ");
    System.out.println("General (21%)");
    System.out.println("Reducido (10%)");
    System.out.println("Superreducido (4%)");    
    iva = System.console().readLine();
    System.out.println("------------------------------------------");
    

    
    //Pido el codigo promocional
    String codigo;
    System.out.println("Introduce tu código promocional");
    System.out.println("nopro (Sin promoción)");
    System.out.println("mitad (Su precio se reduce a la mitad)");
    System.out.println("meno5(Se le hace un descuento de 5€)"); 
    System.out.println("5porc(Se le hace un descuento de 5%)");    
    codigo = System.console().readLine();
    System.out.println("------------------------------------------");
    System.out.println("------------------------------------------");
    

    
    //Analizo que situación me ha dado el usuario en el IVA
    double precioConIVA = 0;
    //Porque a 0?
    
    if (iva.equals("General")){
        System.out.println("Se aplica un IVA del 21%");
        precioConIVA = (precioBase/100)*21 + precioBase;
      } else if (iva.equals("Reducido")){
        System.out.println("Se aplica un IVA del 10%");
        precioConIVA = (precioBase/100)*10 + precioBase;
        } else if (iva.equals("Superreducido")){
        System.out.println("Se aplica un IVA del 4%");
        precioConIVA = (precioBase/100)*4 + precioBase;
          } else {
            System.out.println("ALGO HA FALLADO. VUELVE A EMPEZAR");
            }
            
            
    //Analizo la situacion que me ha dado el usuario sobre el descuento
        double precioFinal = 0;
    if (codigo.equals("nopro")){
        System.out.println("No se le aplica descuento");
        precioFinal = precioConIVA + 0;
      } else if (codigo.equals("mitad")){
        System.out.println("Su precio se reduce a la mitad");
        precioFinal = precioConIVA/2.0;
        } else if (codigo.equals("meno5")){
        System.out.println("Se le aplica un descuento de -5€");
        precioFinal = precioConIVA -5.0;
          } else if (codigo.equals("5porc")){
        System.out.println("Se le aplica un descuento del -5%");
        precioFinal = precioConIVA- (5/100);
            } else {
        System.out.println("ALGO HA FALLADO. VUELVE A EMPEZAR");
              }
              
      System.out.println("Base Imponible          "+precioBase);
      System.out.println("Precio con IVA          "+precioConIVA);
      System.out.println("TOTAL                   "+precioFinal);
    
}
}

