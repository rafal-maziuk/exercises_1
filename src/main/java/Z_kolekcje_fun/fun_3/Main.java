package Z_kolekcje_fun.fun_3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> aLista = new ArrayList<>();
        aLista.add("Szczecin");
        aLista.add("Slupsk");
        aLista.add("Kołobrzeg");
        aLista.add("Wladysławowo");

        System.out.println();
        for (String s : aLista){
            System.out.println(s);
        }

        Collections.sort(aLista);   //sortowanie alfabetyczne

        System.out.println();
        for (String s : aLista){
            System.out.println(s);
        }

        aLista.add("Gdansk");
        System.out.println();
        System.out.println(Collections.min(aLista));    //expected Gdansk

        System.out.println();
        System.out.println(Collections.max(aLista));    //epxected Wlad...

        System.out.println();
        Collections.sort(aLista);       //sorting
        Collections.reverse(aLista);        //reverse
        for (String s : aLista){
            System.out.println(s);
        }

        System.out.println("--- shuffle ---");
        for (int i = 0; i < 3; i++) {
            Collections.shuffle(aLista);
            System.out.println("nr " + (i+1) + "]");
            for (String s : aLista){
                System.out.println(s);
            }
        }
    }
}
