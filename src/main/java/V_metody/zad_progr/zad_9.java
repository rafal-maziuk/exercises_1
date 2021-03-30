package V_metody.zad_progr;

import static V_metody.zad_progr.zad_3.scanner;

public class zad_9 {
    public static void main(String[] args) {

        int predkosc,czas;

        System.out.println("podaj predkosc z jaka jedzie pojazd w km/h: ");
        predkosc = scanner.nextInt();

        System.out.println("podaj przez jaki czas poruszal sie pojazd [w godzinach]: ");
        czas = scanner.nextInt();

        double total = distance(predkosc,czas);

        System.out.println("pojazd przejechal " + total + " km");

    }
    public static double distance(int predkosc, int czas) {
        double dystans = predkosc * czas;
        return dystans;
    }
}
