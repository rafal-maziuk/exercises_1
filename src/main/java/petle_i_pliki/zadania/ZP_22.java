package petle_i_pliki.zadania;

import java.util.Random;
import java.util.Scanner;

public class ZP_22 {
    public static void main(String[] args) {

        String wisnie = "wiśnie", pomarancze = "pomarańcze", sliwki = "śliwki", dzwonki = "dzwonki", melony = "melony",
                bary = "bary";
        int kasaInput = 0, wygrana = 0, wydanePieniadze = 0, wygranaTotal = 0;
        int[] number = new int[3];
        String odpowiedz = "N";
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        do {
            System.out.println("podaj ilosc pieniedzy ktore chcesz wrzucic: ");
            kasaInput = scanner.nextInt();
            wydanePieniadze += kasaInput;

            for (int i = 0; i < 3; i++) {

                number[i] = random.nextInt(5);

                if (number[i] == 0) {
                    System.out.println(wisnie);
                } else if (number[i] == 1) {
                    System.out.println(pomarancze);
                } else if (number[i] == 2) {
                    System.out.println(sliwki);
                } else if (number[i] == 3) {
                    System.out.println(dzwonki);
                } else if (number[i] == 4) {
                    System.out.println(melony);
                } else if (number[i] == 5) {
                    System.out.println(bary);
                }
            }
            if (number[0] == number[1] && number[0] == number[2]) {
                wygrana = kasaInput * 3;
                System.out.println("GRATULACJE! wygrywasz " + wygrana + " pln");
            } else if (number[0] == number[1] || number[0] == number[2]) {
                wygrana = kasaInput * 2;
                System.out.println("gratuluje! wygywasz " + wygrana + " pln!");
            } else if (number[1] == number[2]) {
                wygrana = kasaInput * 2;
                System.out.println("gratuluje! wygywasz " + wygrana + " pln!");
            } else {
                System.out.println("przegrales hajsy!");
            }
            wygranaTotal += wygrana;
            scanner.nextLine();
            System.out.println("chcesz zagrac znowu? wpisz 'y'");
            odpowiedz = scanner.nextLine();
        } while (odpowiedz.equalsIgnoreCase("y"));
        System.out.println("wydales totalnie " + wydanePieniadze + " pln");
        System.out.println("wygrales totalnie " + wygranaTotal + " pln");
    }
}
