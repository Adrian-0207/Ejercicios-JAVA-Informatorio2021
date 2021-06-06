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

public class Ejercicio4 {

    public static void main(String[] args) {
        //Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();  //Escanea el proximo entero que es ingresado
        scan.close();   //Cerramos el scanner si no lo usamos mas (buena practica)
        
        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Lunes");
        } else if (dia == 3) {
            System.out.println("Martes");
        } else if (dia == 4) {
            System.out.println("Miercoles");
        } else if (dia == 5) {
            System.out.println("Jueves");
        } else if (dia == 6) {
            System.out.println("Viernes");    
        } else if (dia == 7){
            System.out.println("Sabado");
        }   
    }  
}
