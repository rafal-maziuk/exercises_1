package IV_petle_i_pliki.zadania;

import java.util.Scanner;

public class ZP_8 {
    public static void main(String[] args) {

        int lata,
            miesiac = 12,
            opadCm,
            opadRok = 0,
            opadTotal = 0;
        double avg;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj ilość lat, z ilu chcesz wprowadzic dane:");
        lata = scanner.nextInt();

        if (lata >= 1) {
            for (int i = 1; i <= lata; i++) {
                for (int j = 1; j <= miesiac; j++) {
                    System.out.println("wprowadz dane, opad w CM, dla miesiaca nr " + j + " w roku nr " + i + " :");
                    opadCm = scanner.nextInt();
                    opadRok += opadCm;
                }
                avg = opadRok / 12;
                System.out.println("średni miesieczny opad dla roku nr " + i + " wynosi: " + avg);
                System.out.println("=====================");
                opadTotal += opadRok;
                opadRok = 0;
            }
            double avgTotal = (double)opadTotal / (lata*miesiac);
            System.out.println("sredni opad miesieczny dla calego okresu wynosi: " + avgTotal);
        }
    }
}
