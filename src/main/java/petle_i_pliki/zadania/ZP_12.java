package petle_i_pliki.zadania;

import java.util.Scanner;

public class ZP_12 {
    public static void main(String[] args) {

        int[] shop = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < shop.length; i++) {
            System.out.print("podaj wartość sprzedazy w sklepie nr " + (i+1) + " :");
            shop[i] = scanner.nextInt();
        }
        System.out.println();

        for (int i = 0; i < shop.length ; i++) {
            System.out.print("sklep nr " + (i+1) + ":");
            int value = shop[i] / 100;
            for (int j = 0; j < value; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
