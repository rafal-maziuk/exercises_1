package V_metody.zad_progr;

import java.util.Scanner;

public class zad_8 {
    public static void main(String[] args) {

        int metry, wybor;
        Scanner scanner = new Scanner(System.in);
        boolean decyzja = true;

        System.out.println("podaj odleglosc w metrach: ");
        metry = scanner.nextInt();

        while (decyzja == true) {
            menu();
            System.out.println("podaj wybrana opcje: ");
            wybor = scanner.nextInt();
            if (wybor > 0 && wybor < 5) {
                if (wybor == 1) {
                    System.out.print(metry + " metrów w kilometrach to ");
                    showKilometers(metry);
                } else if (wybor == 2) {
                    System.out.print(metry + " metrów w calach to ");
                    showInches(metry);
                } else if (wybor == 3) {
                    System.out.print(metry + " metrów w stopach to ");
                    showFeet(metry);
                } else {
                    decyzja = false;
                    System.out.println("zegnaj!");
                }
                System.out.println();
            } else
                System.out.println("złe dane ;(");
        }
    }
    public static void showKilometers(int metry){
        double kilometers;
        kilometers = metry * 0.001;
        System.out.println(kilometers);
    }
    public static void showInches(int metry){
        double inches;
        inches = metry * 39.37;
        System.out.println(inches);
    }
    public static void showFeet(int metry){
        double feets;
        feets = metry * 3.281;
        System.out.println(feets);
    }
    public static void menu(){
        System.out.println("1. Przelicz na kilometry \n2. Przelicz na cale \n3. Przelicz na stopy \n4. Zamknij program");
    }
}
