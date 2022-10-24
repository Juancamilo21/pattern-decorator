package decoratorpattern;

import java.util.ArrayList;

public class ListarNumeros implements NumerosEnteros{

    @Override
    public void mostrarNumeros(ArrayList<Integer> listaNumeros) {
        listaNumeros.forEach(System.out::println);
    }
}
