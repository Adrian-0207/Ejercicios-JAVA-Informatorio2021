/*
Realizar un programa que al ejecutar se pueda ingresar 3 numeros enteros, 
para luego imprimirlos por pantalla de la siguiente manera:

El primer nro ingresado es: 4
El segundo nro ingresado es: 5
El tercer nro ingresado es: 6
*/

import java.util.*;

public class Ejercicio2ConPregunta {

    public static void main(String[] args) {
        // Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int a;
        int b;
        int c;

        while (continuar == 1) {
            System.out.println("Por favor, ingrese el primer numero: ");
            a = scan.nextInt();     //Escanea el proximo entero que es ingresado
            System.out.println("Por favor, ingrese el segundo numero: ");
            b = scan.nextInt();     //Escanea el proximo entero que es ingresado
            System.out.println("Por favor, ingrese el tercer numero: ");    
            c = scan.nextInt();     //Escanea el proximo entero que es ingresado
        
            System.out.println("El primer nro ingresado es: " + a);
            System.out.println("El segundo nro ingresado es: " + b);
            System.out.println("El tercer nro ingresado es: " + c);

            System.out.println("Si desea continuar presione 1, sino cualquier otro numero");
            continuar = scan. nextInt();    //Esacanea el nro y lo asigna a la variable para evaluar luego si continua
        }
        scan.close();   //Cerramos el scanner si no lo usamos mas (buena practica)
    }
}
