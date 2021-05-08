package Z_kolekcje_fun;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal kot1 = new Animal("Filemon");
        Animal kot2 = new Animal("Bonifacy");
        Animal kot3 = new Animal("Klakier");

        ArrayList lista = new ArrayList();

        lista.add(kot1);
        lista.add(kot2);
        lista.add(kot3);

        System.out.println("=========");

        for (Object k : lista){
            System.out.println(((Animal)k).imie);
        }

        System.out.println("=========");
        System.out.println(((Animal)lista.get(1)).imie);
        System.out.println("ilosc elementow w liscie: " + lista.size());
        System.out.println(lista.contains(kot2)); //true
        System.out.println(lista.contains(1)); // false

        lista.remove(kot1);

        System.out.println("=========");
        System.out.println("lista po usunieciu kota1: ");
        for (Object k : lista){
            System.out.println(((Animal)k).imie);
        }
        System.out.println("=========");

        lista.remove(0);
        System.out.println("=========");
        System.out.println("lista po usunieciu indexu 0: ");
        for (Object k : lista){
            System.out.println(((Animal)k).imie);
        }
        System.out.println("=========");

        lista.clear();
        System.out.println("=========");
        System.out.println("lista po uzyciu clear:");
        for (Object k : lista){
            System.out.println(((Animal)k).imie);
        }
        System.out.println("=========");
    }
}
