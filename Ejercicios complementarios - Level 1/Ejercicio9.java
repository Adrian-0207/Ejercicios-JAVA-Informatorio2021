/*
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
aparece una letra dada.

Input (Entrada):
Hola Informatorio Java 2020.
a

Output (Salida):
4
*/

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        String frase;
        char letra;     
        
        System.out.println("Ingrese una frase o texto: ");
        frase = scan.nextLine();
        System.out.println("Ingrese la letra que quiere contar: ");
        letra = scan.next().charAt(0);
        scan.close();

        int repetida = contador(frase,letra);
        System.out.println(letra+ " se repite "+repetida+" veces");
        
    }
    
    public static int contador(String frase, char letra){
        frase = frase.toLowerCase();
        int contador = 0;
        
        for (int i = 0; i < frase.length(); i++ ){
            char c = frase.charAt(i); 
            if(c == letra){
                contador++;
            }
        }
        return contador;
    } 
}
