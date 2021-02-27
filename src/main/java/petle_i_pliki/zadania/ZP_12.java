package petle_i_pliki.zadania;

import java.util.Scanner;

public class ZP_12 {
    public static void main(String[] args) {

        int shops;
        int[] numOfStars;

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj ilosc sklepow: ");
        shops = scanner.nextInt();

        int[] sellValue = new int[shops];
        numOfStars = new int[sellValue.length];

        for (int i = 0; i < shops ; i++) {
            System.out.println("podaj wartosc sprzedazy dla sklepu nr " + (i+1) + ":");
            sellValue[i] = scanner.nextInt();

            numOfStars[i] = sellValue[i] / 100;
        }
    }
}
