/*
Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4

Input (Entrada):
fizzBuzzFuncion(1,6) // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)

Output (Salida):
[“1”, “Fizz”, “Buzz”, “Fizz”, "5"]
[“1”, “Fizz”, “Buzz”, “Fizz”, "5", “FizzBuzz”, "7"]
*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c; 
        int d;
        System.out.println("Ingrese un numero entero: ");
        c = scan.nextInt();
        System.out.println("Ingrese otro numero entero mas grande que el anterior: ");
        d = scan.nextInt();
        scan.close();
        String[] array = multiplo(c,d);
        for (String a : array) {
            System.out.print(a + " , ");
        }
    }

    public static String[] multiplo(int inicial, int limite) {
        
        String[] array = new String[limite - 1];
        array[0] = String.valueOf(inicial);
        for (int i = 1; i < array.length; i++) {
            
            if (((inicial + i) % 2 == 0) && ((inicial + i) % 3 == 0)) {
                array[i] = "FizzBuzz";
            } else if ((inicial + i) % 2 == 0) {
                array[i] = "Fizz";
            } else if ((inicial + i) % 3 == 0) {
                array[i] = "Buzz";
            } else {
                array[i] = String.valueOf(inicial + i);
            } 
        }
        return array;
    }
}
