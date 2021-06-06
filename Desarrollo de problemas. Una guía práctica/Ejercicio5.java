/*
Desarrollar un programa que dado un número entero ingresado, 
nos retorne los valores de ese número multiplicado por 1, 2, 3, … y 10.
*/

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        //Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int nro = scan.nextInt();  //Escanea el proximo entero que es ingresado
        scan.close();   //Cerramos el scanner si no lo usamos mas (buena practica)

        for (int i=1; i <= 10; i++) {
            System.out.println(nro + " * " + i + " = " + nro*i);
        }
    }
}
