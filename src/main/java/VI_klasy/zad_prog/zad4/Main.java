package VI_klasy.zad_prog.zad4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opis;
        int stan;
        double cena;

        System.out.println("podaj nazwę produktu: ");
        opis = scanner.nextLine();

        System.out.println("podaj ilosc produktow na stanie: ");
        stan = scanner.nextInt();

        System.out.println("podaj cene produktu: ");
        cena = scanner.nextDouble();

        RetailItem retailItem1 = new RetailItem(opis, stan, cena);
        System.out.println("=== dane twojego produktu ===");
        System.out.println(retailItem1.getDescription());
        System.out.println(retailItem1.getUnitsOnHand());
        System.out.println(retailItem1.getPrice());
        System.out.println("//// dane produktu versja 2 /// ");
        System.out.println(retailItem1.toString());
    }
}
