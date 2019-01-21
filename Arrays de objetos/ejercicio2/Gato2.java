package ejercicio2;

/**
 *
 * @author Iván Pérez Molina
 */
public class Gato2 {
    //Atributos

    private String nombre;
    private String color;
    private String sexo;

    //Métodos
    public Gato2(String nombre, String color, String sexo) {
        this.nombre = nombre;
        this.color = color;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
