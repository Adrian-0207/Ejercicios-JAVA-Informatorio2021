/*
Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
mensaje “HOLA {USUARIO}!!!”
*/

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        String a;     
        
        System.out.println("Ingrese su nombre: ");
        a = scan.nextLine();
        
        System.out.println("HOLA " + a);
        scan.close();
    }
}