/*
Se desea una aplicación que solicite 2 números enteros y realice la operación
de multiplicación por sumas sucesivas (sin uso de librerías).

Input (Entrada):
2
3

Output (Salida):
2 x 3 = 6
*/

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int m;
       
        System.out.println("Por favor, ingrese el primer numero: ");
        a = scan.nextInt();     //Escanea el proximo entero que es ingresado
        System.out.println("Por favor, ingrese el segundo numero: ");
        b = scan.nextInt();     //Escanea el proximo entero que es ingresado
        m = 0;
        scan.close();

        for(int i= 0; i < b; i++){
            m = m + a;
         }
        System.out.println(+a+ " x " +b+ " = " +m);
    }
}

    


    

