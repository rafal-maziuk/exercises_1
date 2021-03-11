package petle_i_pliki.zadania;

import java.util.Random;
import java.util.Scanner;

public class ZP_22 {
    public static void main(String[] args) {

        String wisnie = "wiśnie", pomarancze = "pomarańcze", sliwki = "śliwki", dzwonki = "dzwonki", melony = "melony",
                bary = "bary";
        int kasaInput,number;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("podaj ilosc pieniedzy ktore chcesz wrzucic: ");
        kasaInput = scanner.nextInt();

        for (int i = 0; i < 3; i++) {

            number = random.nextInt(5);

            if (number == 0){
                System.out.println(wisnie);
            }
            if (number == 1){
                System.out.println(pomarancze);
            }
            if (number == 2){
                System.out.println(sliwki);
            }
            if (number == 3){
                System.out.println(dzwonki);
            }
            if (number == 4){
                System.out.println(melony);
            }
            if (number == 5){
                System.out.println(bary);
            }
            //System.out.println(number);
        }

    }
}
