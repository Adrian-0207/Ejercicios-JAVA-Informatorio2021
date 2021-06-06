/*
Realizar un Programa que dado un String de entrada en minúsculas lo
convierta por completo a mayúsculas. Sin uso de métodos o librerías que
realicen toUppercase().

Input (Entrada):
informatorio

Output (Salida):
INFORMATORIO
*/

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        String palabra;     
        
        System.out.println("Ingrese una palabra: ");
        palabra = scan.nextLine();
        scan.close();

        System.out.println(main2(palabra));
    }

    public static String main2(String palabra){
        String resultado = "";
        char c = ' ';

        for(int i = 0; i < palabra.length(); i++){

            if (palabra.charAt(i) >= 'a' && palabra.charAt(i) <= 'z'){
            c = (char)(palabra.charAt(i) - 32);
            }
            resultado += c;
        }
        return resultado;
    }
}