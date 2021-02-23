package petle_i_pliki.warsztat;

import java.util.Scanner;

public class WP_1 {

    public static void main(String[] args) {

        int number;
        int product = 0;
        Scanner scanner = new Scanner(System.in);

        while(product < 100) {
            System.out.println("wpisz liczbę: ");
            number = scanner.nextInt();
            int multiNumber = number * 10;
            product += multiNumber;
        }
    }
}
