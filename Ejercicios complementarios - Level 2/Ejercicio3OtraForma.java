import java.util.*;
  
public class Ejercicio3OtraForma
{
    public static void main(String[] args)
    {
        List<String>  cartas = new ArrayList<String>();
        cartas.add("2");
        cartas.add("3");
        cartas.add("4");
        cartas.add("5");
        cartas.add("6");
        cartas.add("7");
        cartas.add("8");
        cartas.add("9");
        cartas.add("10");
        cartas.add("J");
        cartas.add("Q");
        cartas.add("K");
        cartas.add("A");

        //Lista ordenada
        System.out.println("Lista ordenada: " +cartas);
  
        //Lista orden inverso
        Collections.reverse(cartas);
        System.out.println("Lista orden inverso: " +cartas);

        //Lista desordenada
        Collections.shuffle(cartas);
        System.out.println("Lista desordenada: " +cartas);
    }
}

