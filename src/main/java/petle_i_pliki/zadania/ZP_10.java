package petle_i_pliki.zadania;

import java.util.Scanner;

public class ZP_10 {
    public static void main(String[] args) {

        int number = 0, min=0, max=0;
        final int END = -99;

        Scanner scanner = new Scanner(System.in);


        while (number != END){
            System.out.println("wpisz dowolną liczbę całkowitą. jesli wpiszesz (-99) program zakonczy prace :");
            number = scanner.nextInt();
            if (number < min){
                min = number;
            }
            else if (number > max) {
                max = number;
            }
        }
        System.out.println("najmniejsza wpisana wartośc to " + min + ", a najwieksza to " + max);
    }
}
