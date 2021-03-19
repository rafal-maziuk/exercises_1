package V_metody.zad_progr;

import java.util.Scanner;

public class zad_4 {
    public static void main(String[] args) {

        int iloscPokoi, cenaFarby;
        double powierzchnia;
        Scanner scanner = new Scanner(System.in);

        System.out.println("wpisz ilosc pokoi ktore chcesz pomalowac: ");
        iloscPokoi = scanner.nextInt();

        System.out.println("podaj cene farby za litr: ");
        cenaFarby = scanner.nextInt();

        double powierzchniaTotal = 0;

        for (int i = 0; i < iloscPokoi; i++) {
            System.out.println("podaj powierzchnię scian w pokoju nr " + (i+1) + ": ");
            powierzchnia = scanner.nextDouble();

            powierzchniaTotal += powierzchnia;
        }

        double litry = litryFarby(powierzchniaTotal);
        double cenaFarbyTotal = kosztFarby(cenaFarby, litry);
        double czasPracy = godzinyPracy(powierzchniaTotal);
        double pracaCena = kosztRobocizny(czasPracy);
        double wydatkiTotal = kosztMalowaniaTotal(pracaCena, cenaFarbyTotal);

        informacjeMalowanie(wydatkiTotal, litry, czasPracy);


    }
    public static double litryFarby(double vol){
        double iloscPotrzebnejFarby = vol / 10 * 1.5;
        return iloscPotrzebnejFarby;
    }
    public static double godzinyPracy(double vol){
        double czasPracy = vol / 10 * 8;
        return czasPracy;
    }
    public static double kosztFarby(double cena, double litry){
        double koszt = cena * litry;
        return koszt;
    }
    public static double kosztRobocizny(double czasPracy){
        double robocizna = czasPracy * 18.00;
        return robocizna;
    }
    public static double kosztMalowaniaTotal(double czas, double farba){
        double kosztTotal = czas + farba;
        return kosztTotal;
    }
    public static void informacjeMalowanie(double koszt, double farba, double czas){
        System.out.println("koszt pracy wynosi: " + koszt + ",\nzostanie zużytych " + farba + " litrow farby, " +
                "\na prace beda trwac " +  czas + " godzin");
    }
}
