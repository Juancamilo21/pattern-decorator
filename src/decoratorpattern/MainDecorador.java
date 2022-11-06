package decoratorpattern;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class MainDecorador {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(3);
        listaNumeros.add(6);
        listaNumeros.add(4);
        listaNumeros.add(5);
        listaNumeros.add(2);

        INumerosEnteros sumaNumeros = new SumaDecorador(new ListarNumeros());
        sumaNumeros.mostrarNumeros(listaNumeros);

        System.out.println("------------------------------------------");

        INumerosEnteros multiplicacionNumeros = new MultiplicacionDecorador(
                new ListarNumeros()
        );
        multiplicacionNumeros.mostrarNumeros(listaNumeros);

        System.out.println("------------------------------------------");

        INumerosEnteros sumaMultiplicacionNumeros = new SumaDecorador(
                new MultiplicacionDecorador(new ListarNumeros())
        );

        sumaMultiplicacionNumeros.mostrarNumeros(listaNumeros);
    }
}
