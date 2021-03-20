package V_metody.zad_progr;

import java.util.Scanner;

public class zad_5 {
    public static void main(String[] args) {

        int czasSpadania;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj czas spadania obiektu, w sekundach: ");
        czasSpadania = scanner.nextInt();

        for (int i = 0; i < czasSpadania; i++) {
            double dystans = fallDistance(i+1);
            System.out.println("w podanym czasie [" + (i+1) + "sek], obiekt spadając, pokonal dany dystans [w metrach]: " + dystans);
        }
    }
    public static double fallDistance(int czasSpadania){
        final double GRAWITACJA = 9.8;
        double distance;
        distance = 0.5 * GRAWITACJA * (czasSpadania * czasSpadania);
        return distance;
    }
}
