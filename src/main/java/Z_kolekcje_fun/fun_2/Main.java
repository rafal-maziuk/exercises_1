package Z_kolekcje_fun.fun_2;

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
    }
}
