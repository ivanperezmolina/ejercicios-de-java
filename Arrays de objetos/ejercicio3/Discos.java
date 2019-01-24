
package ejercicio3;

/**
 *
 * @author Iván Pérez Molina
 */
public class Discos {
    //Atributos
      private String nombre;
      private String autor;
      private int añoPubli;
      private int ident;
      private static int numeroTotal;
      
      
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPubli() {
        return añoPubli;
    }

    public void setAñoPubli(int añoPubli) {
        this.añoPubli = añoPubli;
    }

    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public static int getNumeroTotal() {
        return numeroTotal;
    }

    public static void setNumeroTotal(int numeroTotal) {
        Discos.numeroTotal = numeroTotal;
    }
    
    public void registro(){
        Discos.numeroTotal++;
    }
      
      
}
