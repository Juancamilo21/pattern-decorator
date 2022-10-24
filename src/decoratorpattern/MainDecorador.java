package decoratorpattern;

import java.util.ArrayList;

public class MainDecorador {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(9);

        NumerosEnteros sumaNumeros = new SumaDecorador(new ListarNumeros());
        sumaNumeros.mostrarNumeros(numeros);

        System.out.println("------------------------------------------");

        NumerosEnteros multiplicacionNumeros = new MultiplicacionDecorador(
                new ListarNumeros()
        );
        multiplicacionNumeros.mostrarNumeros(numeros);

        System.out.println("------------------------------------------");

        NumerosEnteros sumaMultiplicacionNumeros = new SumaDecorador(
                new MultiplicacionDecorador(new ListarNumeros())
        );

        sumaMultiplicacionNumeros.mostrarNumeros(numeros);
    }

}
