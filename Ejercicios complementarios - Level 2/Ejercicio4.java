/*
Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos.
Ayuda: ArrayList posee un método para particionar en sub-listas?
*/

import java.util.*;
  
public class Ejercicio4 {
    public static void main(String[] args) {
        //Se carga la lista
        List<String>  estudiantes = new ArrayList<String>();
        estudiantes.add("Jose Montoya");
        estudiantes.add("Maria Caseres");
        estudiantes.add("Laura Novoa");
        estudiantes.add("Gabriel Gomez");
        estudiantes.add("Juan Perez");
        estudiantes.add("Oliver Atom");
        estudiantes.add("Marcelo Leiva");
        estudiantes.add("Olivia Fleitas");
        estudiantes.add("Pedro Pardo");
        estudiantes.add("Raul Castillo");
        estudiantes.add("Hector Pascal");
        estudiantes.add("Mauro Gimenez");
        
        //Se crean las sublistas o cursos
        List<String> curso1 = estudiantes.subList(0, 4);
        List<String> curso2 = estudiantes.subList(4, 8);
        List<String> curso3 = estudiantes.subList(8, 12);

        //Se imprimen los cursos
        System.out.println("Curso 1: "+curso1); 
        System.out.println("Curso 2: "+curso2); 
        System.out.println("Curso 3: "+curso3); 
    }
}
