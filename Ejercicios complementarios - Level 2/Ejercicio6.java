/*
Se dispone de una lista de Empleados, de cada empleado se conoce:
○ Nombre y Apellido
○ DNI
○ horasTrabajadas
○ valorPorHora

Todos los empleados están cargados en un Set (HashSet), se desea calcular el
sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado.
*/

import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashSet<Empleado> empleados = new HashSet<>();
        empleados.add(new Empleado("Armando Lios", 13584978, 40, 500));
        empleados.add(new Empleado("Esteban Quito", 18569871, 45, 600));
        empleados.add(new Empleado("Jose Cansecos", 33456252, 20, 800));
        empleados.add(new Empleado("Laura Alonso", 9223558, 30, 200));
        empleados.add(new Empleado("Elba Gallo", 24789103, 40, 500));

        HashMap<Integer, Float> sueldo = new HashMap<>();
        
        for (Empleado emp : empleados) {
            sueldo.put(emp.dni, emp.getSueldo());
            System.out.println(emp.nombre);
            System.out.println("DNI: "+emp.dni+" - Sueldo: $ "+emp.getSueldo());
            System.out.println("-------------------------------------");
        }
    }
}

class Empleado {
    String nombre;
    int dni;
    float horasTrabajadas;
    float valorPorHora;
    
    public Empleado(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }
   
    public float getSueldo() {
        return horasTrabajadas*valorPorHora;
    }
}

