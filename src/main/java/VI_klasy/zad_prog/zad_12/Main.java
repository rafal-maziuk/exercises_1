package VI_klasy.zad_prog.zad_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj wysokosc rocznej stopy oprocentowania:");
        int stopa = scanner.nextInt();

        System.out.println("podaj początkowy stan konta:");
        double stanKonta = scanner.nextDouble();

        System.out.println("podaj liczbę miesięcy od czasu założenia konta:");
        int miesiace = scanner.nextInt();

        SavingsAccount savingsAccount = new SavingsAccount(stanKonta);
        savingsAccount.setRocznaStopaOprocentowania(stopa);

        for (int i = 0; i < miesiace; i++) {
            System.out.println("ile zdeponowales w "+ (i+1) +" miesiacu?:");
            int depozyt = scanner.nextInt();
            savingsAccount.wplacanaKwota(depozyt);

            System.out.println("ile wyplaciles w "+ (i+1) +" miesiacu?:");
            int wyplata = scanner.nextInt();
            savingsAccount.wyplacanieZKonta(wyplata);

            savingsAccount.dodawanieMiesiecznychOdsetek(stopa);

            System.out.println("Twój aktualny stan konta wynosi: " + savingsAccount.getStanKonta());
            System.out.println();
        }
    }
}
