/*
Realizar un programa que solicite por consola 2 números enteros. Para luego
imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
de la división) de ambos números.
*/

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int a; 
        int b;
        int suma;    
        int resta; 
        int multiplicacion; 
        int division; 
        int modulo; 
        
        System.out.println("Ingrese un numero entero: ");
        a = scan.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        b = scan.nextInt();

        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = a / b;
        modulo = a % b;

        System.out.println("SUMA = " + suma);
        System.out.println("RESTA = " + resta);
        System.out.println("MULTIPLICACION = " + multiplicacion);
        System.out.println("DIVISION = " + division);
        System.out.println("MODULO = " + modulo);
        scan.close();
    }    
}
