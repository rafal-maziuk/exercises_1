package petle_i_pliki.zadania;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZP_2 {
    public static void main(String[] args) throws IOException {

        int predkosc, droga, czas;
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter("przebyta_odleglość.txt");

        System.out.println("podaj predkosc z jaka jedzie pojazd w km/h: ");
        predkosc = scanner.nextInt();

        System.out.println("podaj przez jaki czas poruszal sie pojazd [w godzinach]: ");
        czas = scanner.nextInt();

        if (czas > 1 && predkosc > 0) {
            printWriter.println("Godzina \tPrzebyta odległość");
            printWriter.println("==============================");
            for (int i = 1; i <= czas ; i++) {
                droga = i * predkosc;
                printWriter.println(i + "\t\t\t" + droga);

            }
            printWriter.close();
        } else if (czas == 1){
            System.out.println("pojazd przejechal " + predkosc + " km");
        }
        else {
            System.out.println("nieprawidlowe dane wejsciowe!");
        }
    }
}
