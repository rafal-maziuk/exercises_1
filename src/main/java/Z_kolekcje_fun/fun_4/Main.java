package Z_kolekcje_fun.fun_4;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Queue<String> kolejka = new ArrayDeque<>();     // FIFO

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


        System.out.println("\n----stos----");       // LIFO
        Stack<String> stos = new Stack<>();
        stos.push("pierwszy");
        stos.push("drugi");
        stos.push("trzeci");
        System.out.println(stos.size());
        System.out.println(stos.pop());     // zdejmowanie elementu
        stos.push("ostani");
        System.out.println(stos.peek());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.size());
    }
}
