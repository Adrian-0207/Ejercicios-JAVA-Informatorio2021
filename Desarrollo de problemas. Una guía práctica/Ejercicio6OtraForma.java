/*
Debemos realizar un programa que nos realizará una pregunta si queremos realizar 
una operación dada o si deseamos salir/terminar el programa.
Utilizaremos en este caso una simple operación que nos pide un número 
y luego lo imprime.
*/

import java.util.Scanner;

public class Ejercicio6OtraForma {

    public static void main(String[] args) {
        //Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int nro;

        do {
            System.out.println("Por favor, ingrese un numero: ");
            nro = scan.nextInt();   //Escanea el proximo entero que es ingresado
            System.out.println("El numero ingresado es: " + nro);

            System.out.println("Si desea continuar presione 1, sino cualquier otro numero");
            continuar = scan. nextInt();    //Esacanea el nro y lo asigna a la variable para evaluar luego si continua
        } while (continuar == 1);    
        scan.close();   //Cerramos el scanner si no lo usamos mas (buena practica)
    }    
}
