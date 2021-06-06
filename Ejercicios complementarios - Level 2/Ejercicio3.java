/*
Crear una lista que contenga como elementos la numeración de cartas de una
baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en
orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el
arrayList y volver a imprimir.

Ayuda: ArrayList implementa la interface Collection, existe algún método
que me permita hacer la operación sort (mezclar) aleatoriamente? Idem
para el reverso

Cada palo está formado 13 cartas , de las cuales 9 van enumeradas 
y 4 designadas con letras.Su orden va de menor a mayor rango: 
2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A
*/

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Ejercicio3 {

    public static void main (String args[]) {
        List<Integer> cartas = new ArrayList<>();
        //cargar la lista
        cargarLista(cartas);

        //iterar y mostrar en orden
        System.out.println("Cartas en orden directo: ");
        for (Integer carta: cartas) {
            System.out.print(+carta+ " - ");
        }

        //invertir, iterar y mostrar en orden inverso
        System.out.println();
        Collections.reverse(cartas);
        System.out.println("Cartas en orden inverso: ");
        for (Integer carta: cartas) {
            System.out.print(+carta+ " - ");
        }

        //desordenar, iterar y mostrar desordenado
        System.out.println();
        Collections.shuffle(cartas);
        System.out.println("Cartas desordenadas: ");
        for (Integer carta: cartas) {
            System.out.print(+carta+ " - ");
        }
    }

    public static void cargarLista(List<Integer> cartas) {
        for (int i = 2; i <= 14; i++) {
            cartas.add(i);
        }        
    }
}

