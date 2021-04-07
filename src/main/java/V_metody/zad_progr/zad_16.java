package V_metody.zad_progr;

import java.util.Scanner;

public class zad_16 {
    public static void main(String[] args) {

        double suma, wartPrzy, rso;
        int lata;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj ile hajsu chcialbys miec po pewnym okresie czasu : ");
        wartPrzy = scanner.nextDouble();

        System.out.println("ile bedzie wynosic roczna stopa oprocentowania? : ");
        rso = scanner.nextDouble();

        System.out.println("na ile lat chcialbys zostawic pieniadze na koncie? : ");
        lata = scanner.nextInt();

        suma = presentValue(wartPrzy, rso, lata);
        System.out.println("przy podanych parametrach, powinienes dzis wplacic " + suma + " PLN");
    }

    public static double presentValue(double f, double r, int n){

        double p;
        p = f / Math.pow((1+r), n);     // wzor na wartosc bieżącą

        return p;
    }
}
