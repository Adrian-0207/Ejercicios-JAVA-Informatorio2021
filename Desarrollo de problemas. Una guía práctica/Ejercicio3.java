/*
Tendremos un sistema que debe clasificar el resultado de una evaluación. 
Como dato de entrada tendremos un entero 
y como resultado un String de la clasificación de la siguiente forma:

93 - 100    Excelente
85 - 92     Sobresaliente
75 - 84     Distinguido
60 - 74     Bueno
00 - 59     Desaprobado

*/

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        //Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();  //Escanea el proximo entero que es ingresado
        scan.close();   //Cerramos el scanner si no lo usamos mas (buena practica)
        if (nota > 92) {
            System.out.println("Exelente");
        } else if (nota > 84) {
            System.out.println("Sobresaliente");
        } else if (nota > 74) {
            System.out.println("Distinguido");
        } else if (nota > 59) {
            System.out.println("Bueno");
        } else {
            System.out.println("Desaprobado");
        }   
    }  
}
