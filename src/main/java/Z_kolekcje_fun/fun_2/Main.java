package Z_kolekcje_fun.fun_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();
        lista.add("Gdańsk");
        lista.add("Olsztyn");
        lista.add("Pasym");
        lista.add("Mikołajki");
        lista.add("Wrocław");
        lista.remove(1);
        for (String s : lista){
            System.out.println(s);
        }
        lista.clear();

        System.out.println("\n======= HashMap ========\n");

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Xavi");
        mapa.put(2, "Puyol");
        mapa.put(3, "Kluivert");
        mapa.put(4, "Henry");

        System.out.println(mapa.get(2));

        System.out.println();
        for (String s : mapa.values()){
            System.out.println(s);
        }

        System.out.println(" ===== HashSet =====\n");

        HashSet<String> hSet = new HashSet<>();
        hSet.add("Rumia");
        hSet.add("Rumia");
        hSet.add("Reda");
        hSet.add("Puck");
        hSet.add("Wejherowo");
        hSet.add("Wejherowo");
        hSet.add("Wejherowo");

        System.out.println();
        for (String s : hSet){
            System.out.println(s);
        }
        System.out.println(hSet.size());

    }
}
