package Z_kolekcje_fun.fun_3;

public class Animal implements Comparable<Animal>{

    public Animal(final String name) {
        this.name = name;
    }
    String name;
    int wiek = 5;

    @Override
    public int compareTo(final Animal o) {
        System.out.println(this.name.compareTo(o.name)); // podgladanie jakie wartosci do sortowania
        if (this.name.compareTo(o.name) != 0){
            return this.name.compareTo(o.name);
        }
        return this.wiek - o.wiek;      // porownywanie wieku jako drugi parametr, zeby posortowac od najmlodszego
    }
}
