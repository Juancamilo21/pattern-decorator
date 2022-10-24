package decoratorpattern;

import java.util.ArrayList;

public abstract class NumerosDecorador implements NumerosEnteros {

    protected NumerosEnteros numerosEnteros;

    public NumerosDecorador(NumerosEnteros numerosEnteros) {
        this.numerosEnteros = numerosEnteros;
    }

    @Override
    public void mostrarNumeros(ArrayList<Integer> listaNumeros) {
        numerosEnteros.mostrarNumeros(listaNumeros);
    }
}
