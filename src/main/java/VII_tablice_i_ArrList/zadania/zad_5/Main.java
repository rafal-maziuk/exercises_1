package VII_tablice_i_ArrList.zadania.zad_5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] table = new int[10];
        Random random = new Random();

        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(100);
            System.out.println("wyswietlanie zawartości tablicy o indeksie " + (i+1) + " : " + table[i]);
        }

        method(table, 50);

    }
    public static void method(int[] tab, int n){

        for (int i = 0; i < tab.length ; i++) {
            if (tab[i] > n){
                System.out.println(tab[i]);
            }
        }
    }
}
