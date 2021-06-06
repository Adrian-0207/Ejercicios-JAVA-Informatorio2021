/*
Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.

Input (Entrada):
5

Output (Salida):
El factorial de 5 es: 120
*/

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int a; 
        long f;
    
        System.out.println("Ingrese un numero entero: ");
        a = scan.nextInt();
        f = 1;
        scan.close();

        for(int i= 1; i <= a; i++){
           f = i*f;
        }
        System.out.println("El factorial de "+a+" es: " +f);
    }
}
