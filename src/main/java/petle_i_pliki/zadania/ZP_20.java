package petle_i_pliki.zadania;

import java.util.Scanner;

public class ZP_20 {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj liczbe calkowita nie wieksza niz 15: ");
        number = scanner.nextInt();

        if (number > 0 && number <= 15) {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    System.out.print("X");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("ZŁE dane wejściowe!");
        }
    }
}
