/*
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
imprimir por pantalla el ranking

Input (Entrada):
Bariloche
Córdoba
Resistencia

Output (Salida):
#1 - Bariloche
#2 - Córdoba
#3 - Resistencia
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        List<String> ciudades = new ArrayList<>();
        System.out.println("Ingrese sus 5 ciudades favoritas de Argentina: ");
        
        for (int i = 0; i < 5; i++) {
            String ranking = scan.nextLine();
            ciudades.add(ranking);
        }
        scan.close();

        System.out.println();
        System.out.println("Su Ranking de ciudades favoritas de Argentina es: ");

        for (int i = 0; i < 5; i++) {
            System.out.println("#" +(i+1)+ "-" +ciudades.get(i));
        }
    }
}


