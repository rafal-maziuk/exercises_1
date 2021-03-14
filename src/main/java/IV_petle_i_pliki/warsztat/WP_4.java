package IV_petle_i_pliki.warsztat;

import java.util.Scanner;

public class WP_4 {
    public static void main(String[] args) {

        int total = 0;
        int number;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10 ; i++) {
            System.out.println("podaj liczbę całkowitą: ");
            number = scanner.nextInt();
            total += number;
        }
        System.out.println("wynik dodawania wszystkich liczb to: " + total);
    }
}
