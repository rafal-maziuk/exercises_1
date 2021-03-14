package IV_petle_i_pliki.zadania;

import java.util.Random;
import java.util.Scanner;

public class ZP_17 {
    public static void main(String[] args) {

        int randomNr, userNr, count = 0;
        Scanner scanner = new Scanner(System.in);

        Random randoms = new Random();
        randomNr = randoms.nextInt(100) + 1;

        System.out.println("lets play a game!");
        do {
            System.out.println("podaj liczbe z przedziału 1-100");
            userNr = scanner.nextInt();
            if (userNr > randomNr) {
                System.out.println("za wysoka liczba! spróbuj ponownie");
            }
            else if (userNr < randomNr){
                System.out.println("za niska liczba! sprobuj ponownie");
            }
            else {
                System.out.println("brawo! dobra liczba!");
            }
            count += 1;
        } while (userNr != randomNr);
        System.out.println("odgadnieto liczbe przy probie nr " + count);
    }
}
