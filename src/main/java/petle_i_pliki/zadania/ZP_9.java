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
            for (int i = 0; i < days; i++) {
                population = (startPop + population)*avg;
                totalPop += population;
            }
            System.out.println("po okreslonej ilosci dni populacja wynosi: " + (totalPop));

        }
    }
}