package petle_i_pliki;

import java.util.Scanner;

public class ZP_2 {
    public static void main(String[] args) {

        int predkosc, droga, czas;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj predkosc z jaka jedzie pojazd w km/h: ");
        predkosc = scanner.nextInt();

        System.out.println("podaj przez jaki czas poruszal sie pojazd [w godzinach]: ");
        czas = scanner.nextInt();

        if (czas > 1 && predkosc > 0) {
            System.out.println("Godzina \tPrzebyta odległość");
            System.out.println("==============================");
            for (int i = 1; i <= czas ; i++) {
                droga = i * predkosc;
                System.out.println(i + "\t\t\t" + droga);

            }
        } else if (czas == 1){
            System.out.println("pojazd przejechal " + predkosc + " km");
        }
        else {
            System.out.println("nieprawidlowe dane wejsciowe!");
        }
    }
}
