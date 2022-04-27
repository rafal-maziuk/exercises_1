package IX_string.zadania.zad4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input, decision;

        System.out.println("wpisz dowolny łańcuch znaków: ");
        input = scanner.nextLine();

        do {
            System.out.println("\nco chcesz zrobić?" +
                    "\na. zliczanie samogłosek w łańcuchu" +
                    "\nb. zliczanie spółgłosek w łańcuchu" +
                    "\nc. zliczanie sumy spółgłosek i samogłosek" +
                    "\nd. wprowazenie następnego łańcucha znaków" +
                    "\ne. zakończenie pracy programu");
            decision = scanner.nextLine();
        } while (!decision.equalsIgnoreCase("e"));

        System.out.println("dzięki, do zobaczenia następnym razem !");
    }
}
