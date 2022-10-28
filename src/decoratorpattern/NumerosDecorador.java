package decoratorpattern;

import java.util.ArrayList;

public abstract class NumerosDecorador implements INumerosEnteros {

    protected INumerosEnteros numerosDecorados;

    public NumerosDecorador(INumerosEnteros numerosDecorados) {
        this.numerosDecorados = numerosDecorados;
    }

    @Override
    public void mostrarNumeros(ArrayList<Integer> listaNumeros) {
        numerosDecorados.mostrarNumeros(listaNumeros);
    }
}
