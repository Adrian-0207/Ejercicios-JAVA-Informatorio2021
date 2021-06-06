/*
Se desea una aplicación que solicite 2 números enteros y realice la operación
de potencia (sin uso de librerías).

Input (Entrada):
3
3

Output (Salida):
3 elevado a 3 = 27
*/

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int p;
       
        System.out.println("Por favor, ingrese el primer numero: ");
        a = scan.nextInt();     //Escanea el proximo entero que es ingresado
        System.out.println("Por favor, ingrese el segundo numero: ");
        b = scan.nextInt();     //Escanea el proximo entero que es ingresado
        p = 1;
        scan.close();

        for(int i= 0; i < b; i++){
            p = p * a;
         }
        System.out.println(+a+ " elevado a " +b+ " = " +p);
    }
}