package ejercicio07;

import java.util.ArrayList;

/**
 *
 * @author Iván Pérez Molina
 */
public class PruebaMoneda {

  public static void main(String[] args) {

    //Creo las monedas
    ArrayList<Moneda> monedas = new ArrayList<>();//Le tengo que decir en <> que cosa le voy a meter

    monedas.add(new Moneda("1 centimos", "cara"));
    monedas.add(new Moneda("1 centimos", "cruz"));
    monedas.add(new Moneda("2 centimos", "cara"));
    monedas.add(new Moneda("2 centimos", "cruz"));
    monedas.add(new Moneda("5 centimos", "cara"));
    monedas.add(new Moneda("5 centimos", "cruz"));
    monedas.add(new Moneda("10 centimos", "cara"));
    monedas.add(new Moneda("10 centimos", "cruz"));
    monedas.add(new Moneda("20 centimos", "cara"));
    monedas.add(new Moneda("20 centimos", "cruz"));
    monedas.add(new Moneda("50 centimos", "cara"));
    monedas.add(new Moneda("50 centimos", "cruz"));
    monedas.add(new Moneda("1 €", "cara"));
    monedas.add(new Moneda("1 €", "cruz"));
    monedas.add(new Moneda("2 €", "cara"));
    monedas.add(new Moneda("2 €", "cruz"));

    ArrayList<Moneda> resultado = new ArrayList<>();

    resultado.add(monedas.get((int) (Math.random() * monedas.size())));

    for (int i = 0; i < 6; i++) {
      String ultimoValor = resultado.get(resultado.size() - 1).getValor();
      String ultimaPosicion = resultado.get(resultado.size() - 1).getPosicion();

      Moneda aux;
      do {
        aux = monedas.get((int) (Math.random() * monedas.size()));
      } while (!aux.getValor().equals(ultimoValor) && !aux.getPosicion().equals(ultimaPosicion));
      resultado.add(aux);
    }
      //Para que salga en lista deberiamos utilizar un forIt
    System.out.println(resultado);
  }

}
