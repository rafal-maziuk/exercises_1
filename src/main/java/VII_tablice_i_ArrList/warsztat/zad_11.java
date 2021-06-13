package VII_tablice_i_ArrList.warsztat;

import java.util.ArrayList;

public class zad_11 {
    public static void main(String[] args) {

        ArrayList<String> arList = new ArrayList<>();

        arList.add("polonez");
        arList.add("fiat");
        arList.add("trabant");

        System.out.println("wielkosc tablicy to: " + arList.size());
        for (int i = 0; i < arList.size(); i++) {
            System.out.println(arList.get(i));
        }
    }
}
