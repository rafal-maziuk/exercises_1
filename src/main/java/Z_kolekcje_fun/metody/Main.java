package Z_kolekcje_fun.metody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> listaA = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>();

        listaA.add(1);
        listaA.add(2);
        listaA.add(3);
        listaA.add(4);
        listaA.add(5);

//        listaB.add(2);
        listaB.add(3);
        listaB.add(4);

        System.out.println("lista A: " + listaA.toString());
        System.out.println("lista B: " + listaB.toString());

        int index = Collections.indexOfSubList(listaA, listaB);
        System.out.println(index);      // should return 2

    }

    public static int findArray(List lista, List subList){

        if (lista.size() <= subList.size())
            return -1;

        return 0;
    }
}
