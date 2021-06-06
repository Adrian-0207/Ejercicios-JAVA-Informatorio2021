/*
Confeccionar un programa que dado un número entero como dato de
entrada imprima la secuencia de números (incrementos de 1) de la siguiente
forma:

Input (Entrada): 
5

Output (Salida):
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int a;
        
        System.out.println("Ingrese un numero entero: ");
        a = scan.nextInt();
        scan.close();
        
        for(int i= 1; i <= a; i++){     //Incremento vertical 
            for(int j=1; j<= i; j++){   //Incremento en una linea
                System.out.print(j+ " ");
            }
            System.out.println();   //Salto de linea
        }
    }    
}