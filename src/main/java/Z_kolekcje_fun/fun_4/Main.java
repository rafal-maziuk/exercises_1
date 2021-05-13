package Z_kolekcje_fun.fun_4;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> kolejka = new ArrayDeque<>();

        kolejka.add("jeden");
        kolejka.add("dwa");
        kolejka.add("trzy");

        System.out.println(kolejka.size());
        System.out.println(kolejka.peek());     //podgladanie pierwszego elementu kolejki
        System.out.println(kolejka.remove());
        System.out.println(kolejka.poll());     //usuwanie ktore zwraca null, a nie wyjatek
        System.out.println(kolejka.remove());
        System.out.println(kolejka.size());
        System.out.println(kolejka.poll());     //null
        System.out.println(kolejka.size());
    }
}
