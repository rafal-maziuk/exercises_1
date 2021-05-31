package VII_tablice_i_ArrList.warsztat;

public class zad_3 {
    public static void main(String[] args) {
        String[] tablica = {"Einstein", "Newton", "Kopernik", "Kepler"};
        int total=0;
        for (int i = 0; i < tablica.length ; i++) {
            System.out.println(tablica[i]);
            int dlugosc = tablica[i].length();
            total += dlugosc;
            System.out.println("łączna długość znaków: " + total);
        }
    }
}
