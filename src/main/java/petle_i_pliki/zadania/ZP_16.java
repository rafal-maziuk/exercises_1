package petle_i_pliki.zadania;

import java.util.Scanner;

public class ZP_16 {
    public static void main(String[] args) {

        int budzet, outcome=0, wydatki=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj budzet jakim dysponujesz: ");
        budzet = scanner.nextInt();

        do {
            System.out.println("podaj dowolną kwotę jaka wydales w tym miesiacu. wpisz 0 aby zakonczyc: ");
            outcome = scanner.nextInt();
            wydatki += outcome;
        } while(outcome != 0);

        int total = budzet - wydatki;
        if (total >= 0){
            System.out.println("w tym miesiącu zaoszczedziles! roznica wynosi " + total + " . brawo");
        }
        else if (total < 0){
            System.out.println("zyjesz na kredyt! ;( . w tym miesiacu jestes o " + total + " w plecy");
        }
    }
}