package ejercicio2;

import ejercicio1.Gato;
import javax.swing.JOptionPane;

/**
 *
 * @author Iván Pérez Molina
 */
public class PruebaGato2 {

    public static void main(String[] args) {
        //Creamos el array donde posteriormente creare los gatos
        Gato2[] gatito = new Gato2[6];

        JOptionPane.showMessageDialog(null, "A continuación, se genera un registro automatico de los gatos. \n       SOLO CONSULTA DE DATOS");

        //Vamos ahora a meter datos en cada gato uno a uno
        gatito[1] = new Gato2("Garfield", "Naranja", "Macho");
        gatito[2] = new Gato2("Tana", "Blanco", "Hembra");
        gatito[3] = new Gato2("Nela", "Canela", "Hembra");
        gatito[4] = new Gato2("Doraemon", "Blanco y negro", "Macho");
        gatito[5] = new Gato2("Perricol", "Negro", "Macho");

        //Muestro los datos por consola
        System.out.println("Los datos introducidos son los siguientes:");
        for (int i = 1; i < 6; i++) {
            System.out.println("GATO Nº" + i);
            System.out.println("-----------------------");
            System.out.println("Nombre: " + gatito[i].getNombre());
            System.out.println("Color: "+gatito[i].getColor());
            System.out.println("Sexo: "+gatito[i].getSexo());
            System.out.println("============================");
            System.out.println("");
        }
    }

}
