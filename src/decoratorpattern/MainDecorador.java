package decoratorpattern;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class MainDecorador {

    public static void main(String[] args) {
        int cantidadNumeros = capturarNumeros(
                "Ingresa la cantidad de números que deseas registrar"
        );
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < cantidadNumeros; i++) {
            int numero = capturarNumeros((i + 1) + ". Ingresa el número");
            listaNumeros.add(i, numero);
        }

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

    public static int capturarNumeros(String dato) {
        return Integer.parseInt(JOptionPane.showInputDialog(dato));
    }

}
