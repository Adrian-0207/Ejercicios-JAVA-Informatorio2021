/*
Crear una aplicación que solicite de entrada los datos de una persona en este
orden:
Nombre y Apellido
Edad
Dirección
Ciudad

Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}

Input (Entrada):
Homero Simpson
48
Calle Falsa 1234
Springfield

Output (Salida):
Springfield - Calle Falsa 1234 - 48 - Homero Simpson
*/

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        String nYA;
        int edad;
        String direccion;  
        String ciudad;   
        
        System.out.println("Ingrese su nombre y apellido: ");
        nYA = scan.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = scan.nextInt();
        System.out.println("Ingrese su direccion: ");
        direccion = scan.nextLine();
        System.out.println("Ingrese su ciudad: ");
        ciudad = scan.nextLine();

        System.out.println(ciudad+ " - " +direccion+ " - " +edad+ " - " +nYA);
        scan.close();
    }
}
