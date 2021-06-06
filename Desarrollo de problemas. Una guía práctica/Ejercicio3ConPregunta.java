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

public class Ejercicio3ConPregunta {

    public static void main(String[] args) {
        //Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int nota;

        while (continuar == 1) {
            System.out.println("Por favor, ingrese una nota: ");
            nota = scan.nextInt();  //Escanea el proximo entero que es ingresado
        
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

            System.out.println("Si desea continuar presione 1, sino cualquier otro numero");
            continuar = scan. nextInt();    //Esacanea el nro y lo asigna a la variable para evaluar luego si continua
        }  
        scan.close();   //Cerramos el scanner si no lo usamos mas (buena practica) 
    }  
}

