package petle_i_pliki.zadania;

import java.util.Scanner;

public class ZP_12 {
    public static void main(String[] args) {

        int sellValue, shops, numOfStars=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj ilosc sklepow: ");
        shops = scanner.nextInt();

        for (int i = 0; i < shops ; i++) {
            System.out.println("podaj wartosc sprzedazy dla sklepu nr " + (i+1) + ":");
            sellValue = scanner.nextInt();
            numOfStars = sellValue / 100;
        }
    }
}
