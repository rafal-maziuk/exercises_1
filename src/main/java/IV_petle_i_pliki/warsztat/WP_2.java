package IV_petle_i_pliki.warsztat;

import java.util.Scanner;

public class WP_2 {
    public static void main(String[] args) {

        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("wpisz liczbę nr1 : ");
            num1 = scanner.nextInt();
            System.out.println("wpisz liczbę nr2 : ");
            num2 = scanner.nextInt();
            int total = num1 + num2;
            System.out.println("wynik dodawania dwoch liczb to: " + total);

            scanner.nextLine();

            System.out.println("czy chcesz zabawić się jeszce raz? \nwpisz 'T': ");
            answer = scanner.nextLine();

        } while(answer.equalsIgnoreCase("t"));
    }
}
