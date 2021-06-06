/*
Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar.

Input (Entrada):
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]

## Los arrays son iguales y corresponden a los días trabajados de una
semana Lun-Vie.

Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915
    
*/

import java.util.*;
  
public class Ejercicio5OtraForma {
    public static void main(String[] args) {

        //Se cargan las listas
        List<Integer> array1 = new ArrayList<Integer>(
        Arrays.asList(6,7,8,4,5));
        List<Integer> array2 = new ArrayList<Integer>(
        Arrays.asList(350,345,550,600,320));
        List<Integer> totales = new ArrayList<>();
        
        //Se multiplican las listas y se crea la lista "totales"
        for(int i=0; i<array1.size(); i++){
            int s = array1.get(i) * array2.get(i);
            totales.add(s);
        }
        System.out.println(totales); 

        //Se suman los valores de la lista de totales
        int total = 0;
        for(int i = 0; i < totales.size(); i++) {
            total += totales.get(i);
        }
        System.out.println("Total Final: $ " +total); 
    }
}
