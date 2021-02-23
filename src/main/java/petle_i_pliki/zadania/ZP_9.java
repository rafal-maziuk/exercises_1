package petle_i_pliki.zadania;

import java.util.Scanner;

public class ZP_9 {
    public static void main(String[] args) {
        int startPop = 0,
            avgDayAdd,
            days;
        double totalPop = 0;
        double population=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj poczatkowa ilosc populacji:");
        startPop = scanner.nextInt();

        System.out.println("podaj dzienny przyrost w % :");
        avgDayAdd = scanner.nextInt();
        double avg = avgDayAdd / 100.0;

        System.out.println("podaj ilosc dni przez ktore rozmnazaja sie organizmy: ");
        days = scanner.nextInt();

        if (startPop < 2 && avgDayAdd < 0 && days < 1) {
            System.out.println("błędne dane wejściowe!");
        } else {
            population = startPop;
            for (int i = 1; i <= days; i++) {
                totalPop = population;
                population = population + (population*avg);
                System.out.println("populacja na dzień " + i + " wynosi: " + totalPop);
            }
        }
    }
}