package decoratorpattern;

import java.util.ArrayList;

public class MainDecorador {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(3);
        listaNumeros.add(5);
        listaNumeros.add(7);
        listaNumeros.add(9);

        NumerosEnteros sumaNumeros = new SumaDecorador(new ListarNumeros());
        sumaNumeros.mostrarNumeros(listaNumeros);

        System.out.println("------------------------------------------");

        NumerosEnteros multiplicacionNumeros = new MultiplicacionDecorador(
                new ListarNumeros()
        );
        multiplicacionNumeros.mostrarNumeros(listaNumeros);

        System.out.println("------------------------------------------");

        NumerosEnteros sumaMultiplicacionNumeros = new SumaDecorador(
                new MultiplicacionDecorador(new ListarNumeros())
        );

        sumaMultiplicacionNumeros.mostrarNumeros(listaNumeros);
    }

}
