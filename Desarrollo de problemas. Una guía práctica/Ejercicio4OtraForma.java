/*
Realizar un programa que dado un número de entrada entre 1 a 7, 
nos devuelva el dia de la semana de la siguiente forma:

1   Domingo
2   Lunes
3   Martes
4   Miercoles
5   Jueves
6   Viernes
7   Sabado 

*/

import java.util.Scanner;

public class Ejercicio4OtraForma {

    public static void main(String[] args) {
        //Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();  //Escanea el proximo entero que es ingresado
        scan.close();   //Cerramos el scanner si no lo usamos mas (buena practica)
        
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        } 
    }  
}