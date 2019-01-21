
package ejercicio1;

import javax.swing.JOptionPane;


/**
 *
 * @author Iván Pérez Molina
 */
public class PruebaGato {

    public static void main(String[] args) {
        //Creamos el array donde posteriormente creare los gatos
        Gato[] cat = new Gato[5];

        JOptionPane.showMessageDialog(null, "A continuación, registre a los gatos");

        String nombreGato;
        int edadGato;
        String razaGato;

        //Vamos ahora a meter datos en cada gato con un bucle
        for (int i = 1; i < 5; i++) {
            cat[i] = new Gato();
            nombreGato = JOptionPane.showInputDialog("Escribe el nombre del gato nº" + i);
            cat[i].setNombre(nombreGato);
            edadGato = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del gato nº" + i));
            cat[i].setEdad(edadGato);
            razaGato = JOptionPane.showInputDialog("Escribe la raza del gato nº" + i);
            cat[i].setRaza(razaGato);
        }

        //Muestro los datos por consola
        System.out.println("Los datos introducidos son los siguientes:");
        for (int i = 1; i < 5; i++) {
            System.out.println("GATO Nº" + i);
            System.out.println("-----------------------");
            System.out.println("Nombre: " + cat[i].getNombre());
            System.out.println("Edad: " + cat[i].getEdad());
            System.out.println("Raza: " + cat[i].getRaza());
            System.out.println("============================");
            System.out.println("");
        }
    }
    
}
