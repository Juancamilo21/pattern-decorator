package decoratorpattern;

import java.util.ArrayList;

public class SumaDecorador extends NumerosDecorador {


    public SumaDecorador(NumerosEnteros numerosEnteros) {
        super(numerosEnteros);
    }

    @Override
    public void mostrarNumeros(ArrayList<Integer> listaNumeros) {
        numerosDecorados.mostrarNumeros(listaNumeros);
        ejecutarContenido(listaNumeros);
    }

    public int sumaNumeros(ArrayList<Integer> listaNumeros, int indice) {
        if (listaNumeros.size() - 1 == indice) return listaNumeros.get(indice);
        return listaNumeros.get(indice) + sumaNumeros(listaNumeros, indice + 1);
    }

    public double promedioNumeros(ArrayList<Integer> listaNumeros, int suma) {
        return (listaNumeros.size() > 0) ? (double) suma / listaNumeros.size() : 0;
    }

    public void ejecutarContenido(ArrayList<Integer> listaNumeros) {
        int resultadoSuma = sumaNumeros(listaNumeros, 0);
        System.out.println("La suma de los numeros es:\t" + resultadoSuma);
        System.out.println(
                "El promedio de la suma es:\t" + promedioNumeros(listaNumeros, resultadoSuma)
        );
    }
}
