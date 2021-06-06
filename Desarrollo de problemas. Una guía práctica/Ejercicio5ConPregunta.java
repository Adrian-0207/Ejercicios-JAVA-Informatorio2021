/*
Desarrollar un programa que dado un número entero ingresado, 
nos retorne los valores de ese número multiplicado por 1, 2, 3, … y 10.
*/

import java.util.Scanner;

public class Ejercicio5ConPregunta {
    
    public static void main(String[] args) {
        //Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int nro;

        while (continuar == 1) {
            System.out.println("Por favor, ingrese un numero: ");
            nro = scan.nextInt();  //Escanea el proximo entero que es ingresado
            
            for (int i=1; i <= 10; i++) {
                System.out.println(nro + " * " + i + " = " + nro*i);
            }
            System.out.println("Si desea continuar presione 1, sino cualquier otro numero");
            continuar = scan. nextInt();    //Esacanea el nro y lo asigna a la variable para evaluar luego si continua
        }
        scan.close();   //Cerramos el scanner si no lo usamos mas (buena practica)     
    }
}
