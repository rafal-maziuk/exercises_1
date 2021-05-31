package VII_tablice_i_ArrList.warsztat;

import java.util.Scanner;

public class zad_4 {
    public static void main(String[] args) {

        String[] countryNames = new String[12];
        String[] countryPopulation = new String[12];

        Scanner scanner = new Scanner(System.in);
        String country;
        String population;

        for (int i = 0; i < countryNames.length ; i++) {
            System.out.println("podaj nazwę kraju nr" + (i+1) + " : ");
            country = scanner.nextLine();
            countryNames[i]= country;

            System.out.println("podaj populacje podanego kraju: ");
            population = scanner.nextLine();
            countryPopulation[i] = population;
        }
        for (int i = 0; i < countryNames.length ; i++) {
            System.out.println("kraj: " + countryNames[i]);
            System.out.println("populacja: " + countryPopulation[i]);
            System.out.println();
        }
    }
}
