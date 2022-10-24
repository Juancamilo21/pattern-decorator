package decoratorpattern;

import java.util.ArrayList;

public class MultiplicacionDecorador extends NumerosDecorador {


    public MultiplicacionDecorador(NumerosEnteros numerosEnteros) {
        super(numerosEnteros);
    }

    @Override
    public void mostrarNumeros(ArrayList<Integer> listaNumeros) {
        super.mostrarNumeros(listaNumeros);
        ejecutarContenido(listaNumeros);
    }

    public int multiplicarNumeros(ArrayList<Integer> listaNumeros, int indice) {
        if (listaNumeros.size() - 1 == indice) return listaNumeros.get(indice);
        return listaNumeros.get(indice) *
                multiplicarNumeros(listaNumeros, indice + 1);
    }

    public void verificarNumeroPar(int numeroMultiplicacion) {
        String mensajeVerificacionPar =
                (numeroMultiplicacion % 2 == 0) ? "El número multiplicado es par"
                        : "El número multiplicado no es par";
        System.out.println(mensajeVerificacionPar);
    }

    public void ejecutarContenido(ArrayList<Integer> listaNumeros) {
        int resultadoMultiplicacion = multiplicarNumeros(listaNumeros, 0);
        System.out.println("Multiplicando numeros:\t" + resultadoMultiplicacion);
        verificarNumeroPar(resultadoMultiplicacion);
    }
}
