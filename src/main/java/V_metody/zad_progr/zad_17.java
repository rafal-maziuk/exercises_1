package V_metody.zad_progr;

import java.util.Random;
import java.util.Scanner;

public class zad_17 {
    public static void main(String[] args) {

        Random rand = new Random();
        int number, wybor;
        Scanner scanner = new Scanner(System.in);
        String decision;

        do {
            number = rand.nextInt(3) + 1;

            System.out.println("1. papier \n2. kamień \n3. nożyce \npodaj cyfrę jako swój wybór [zatwierdz eneterem]: ");
            wybor = scanner.nextInt();
            System.out.println(menu(wybor));

            System.out.println();
            System.out.println("wybór PC to: ");
            item(number);

            scanner.nextLine();

            winner(wybor, number);

            System.out.println("\nchcesz zagrać ponownie? 't' lub 'n' [zatwierdz eneterem] :");
            decision = scanner.nextLine();

            System.out.println("======================");
        } while (decision.equalsIgnoreCase("t"));
        System.out.println("żegnaj ;(");

    }

    public static void item (int n){
        if (n == 1){
            System.out.println("papier!");
        }
        else if (n == 2){
            System.out.println("kamień!");
        }
        else
            System.out.println("nożyce!");
    }

    public static String menu (int num) {
        if (num == 1){
            return "wybrałeś papier";
        }
        else if (num == 2){
            return "wybrałeś kamień";
        }
        else if (num == 3) {
            return "wybrałeś nożyce";
        }
        else {
            System.out.println("wybór spoza skali ;/ ogarnij sie!");
            System.exit(-1);
        }
        return "0";
    }

    public static void winner (int user, int pc){
        if (pc == 1) {      // papier
            if (user == 1) {
                System.out.println("papier vs papier. REMIS!");
            }
            else if (user == 2) {
                System.out.println("kamień vs papier. PRZEGRANA ;(");
            }
            else
                System.out.println("nożyce vs papier. WYGRANA !!!");
        }
        else if (pc == 2){      // kamien
            if (user == 1) {
                System.out.println("papier vs kamień. WYGRANA !!!");
            }
            else if (user == 2) {
                System.out.println("kamień vs kamień. REMIS");
            }
            else
                System.out.println("nożyce vs kamień. PRZEGRANA ;(");
        }
        else if (pc == 3){      // nozyce
            if (user == 1) {
                System.out.println("papier vs nożyce. PRZEGRANA =(");
            }
            else if (user == 2) {
                System.out.println("kamień vs nożyce. WYGRANA !!!");
            }
            else
                System.out.println("nożyce vs nożyce. REMIS");
        }
        else
            System.out.println("wybór spoza skali! skup się!");
    }
}
