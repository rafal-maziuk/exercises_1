package IV_petle_i_pliki.zadania;

import java.util.Scanner;

public class ZP_5 {
    public static void main(String[] args) {

        String lancuch;
        char znak;
        int wystapienia = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("wpisz dowolny tekst: ");
        lancuch = scanner.nextLine();

        System.out.println("podaj litere ktorej ilosc wystapien mam policzyc: ");
        String znakDoSzukania = scanner.nextLine();
        znak = znakDoSzukania.charAt(0);

        if (lancuch.length() > 0){
            for (int i = 0; i < lancuch.length() ; i++) {
                char znakDwa = lancuch.charAt(i);
                if (znakDwa == znak) {
                    wystapienia++;
                }
            }
        } else {
            System.out.println("zle dane wejsciowe!");
        }
        System.out.println("znak wystapil " + wystapienia + " razy");
    }
}
