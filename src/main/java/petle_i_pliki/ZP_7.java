package petle_i_pliki;

import java.util.Scanner;

public class ZP_7 {
    public static void main(String[] args) {

        int zajetePokojePietro = 0, pokojeLaczniePietro = 0, iloscPieter = 0, zajeteTotal = 0, pokojeTotal = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj ilosc pieter w obiekcie:");
        iloscPieter = scanner.nextInt();

        if (iloscPieter >= 1) {
            for (int i = 0; i < iloscPieter; i++) {
                System.out.println("ile pokoi znajduje się na " + (i + 1) + " pietrze?");
                pokojeLaczniePietro = scanner.nextInt();

                System.out.println("ile pokoi jest zajetych?");
                zajetePokojePietro = scanner.nextInt();
                if ((pokojeLaczniePietro < zajetePokojePietro) || pokojeLaczniePietro < 10){
                    System.out.println("zle dane wejsciowe!");
                    break;
                }

                System.out.println("=========");

                pokojeTotal += pokojeLaczniePietro;
                zajeteTotal += zajetePokojePietro;

            }
            System.out.println("ilosc pokoi ogolem: " + pokojeTotal);
            System.out.println("liczba zajętych pokoi: " + zajeteTotal);
            double oblozenie = (double) zajeteTotal/pokojeTotal;
            System.out.printf("oblozenie wynosi: %.2f" , oblozenie);
        } else {
            System.out.println("za maly obiekt");
        }
    }
}
