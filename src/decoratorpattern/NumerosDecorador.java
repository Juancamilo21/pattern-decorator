package decoratorpattern;

import java.util.ArrayList;

public abstract class NumerosDecorador implements NumerosEnteros {

    protected NumerosEnteros numerosDecorados;

    public NumerosDecorador(NumerosEnteros numerosDecorados) {
        this.numerosDecorados = numerosDecorados;
    }

    @Override
    public void mostrarNumeros(ArrayList<Integer> listaNumeros) {
        numerosDecorados.mostrarNumeros(listaNumeros);
    }
}
