/*
Realizar un programa que al ejecutar se pueda ingresar 3 numeros enteros, 
para luego imprimirlos por pantalla de la siguiente manera:

El primer nro ingresado es: 4
El segundo nro ingresado es: 5
El tercer nro ingresado es: 6
*/

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();     //Escanea el proximo entero que es ingresado
        int b = scan.nextInt();     //Que sucede si ingresamos un String u otro tipo??
        int c = scan.nextInt(); 
        
        System.out.println("El primer nro ingresado es: " + a);
        System.out.println("El segundo nro ingresado es: " + b);
        System.out.println("El tercer nro ingresado es: " + c);
        scan.close();
    }
}
