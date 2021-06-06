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
  
public class Ejercicio5 {
    public static void main(String[] args) {

        //Se cargan las listas
        List<Integer> array1 = new ArrayList<Integer>(
        Arrays.asList(6,7,8,4,5));
        List<Integer> array2 = new ArrayList<Integer>(
        Arrays.asList(350,345,550,600,320));
        
        //Se multiplican los valores de las listas
        int t1 =  array1.get(0)* array2.get(0);
		int t2 =  array1.get(1)* array2.get(1);
        int t3 =  array1.get(2)* array2.get(2);
        int t4 =  array1.get(3)* array2.get(3);
        int t5 =  array1.get(4)* array2.get(4);

        //Se crea la lista de totales
		List<Integer> totales = new ArrayList<Integer>(
        Arrays.asList(t1,t2,t3,t4,t5));
        System.out.println(totales); 

        //Se suman los valores de la lista de totales
        int total = 0;
        for(int i = 0; i < totales.size(); i++) {
            total += totales.get(i);
        }
        System.out.println("Total Final: $ " +total); 
    }
}