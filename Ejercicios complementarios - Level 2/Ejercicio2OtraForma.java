/*
Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
entero al principio de la lista y otro al final. Por último, iterar e imprimir los
elementos de la lista y el tamaño de la misma (antes y después de agregar a
en la primera y última posición).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2OtraForma {

    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> masNumeros = new ArrayList<>();
        System.out.println("Ingrese 5 números enteros : ");

        for (int i = 0; i < 5; i++) {
            int numero = scan.nextInt();
            numeros.add(numero);
        }
        scan.close();

        masNumeros = numeros;

        System.out.println("Tamaño de la lista inicial" + " = " + numeros.size());
        //iterar y mostrar
        for (Integer nro: numeros) {
            System.out.println(nro);
        }

        agregarDosElementos(masNumeros);
        System.out.println("----------------------------------------------------");
        System.out.println("Se agregaron dos numeros al principio y al final de la lista");
        System.out.println("Tamaño de la lista final" + " = " + masNumeros.size());
        //iterar y mostrar
        for (Integer nros: masNumeros) {
            System.out.println(nros);
        }
    }   

    public static void agregarDosElementos(List<Integer> masNumeros) {
        masNumeros.add(0,50);
        masNumeros.add(6,85);
    }
}