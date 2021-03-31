package V_metody.zad_progr;

import java.util.Scanner;

public class zad_10 {
    public static void main(String[] args) {

        int liczbaAkcji;
        double cenaZakupu, prowizjaZakupu, cenaSprzedazy, prowizjaSprzedazy;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj ilosc akcji ktore posiadasz: ");
        liczbaAkcji = scanner.nextInt();

        System.out.println("podaj cene zakupu akcji za 1 szt:");
        cenaZakupu = scanner.nextDouble();

        System.out.println("ile wynosila prowizja od zakupionych akcji w PLN:");
        prowizjaZakupu = scanner.nextDouble();

        System.out.println("podaj cene sprzedazy 1 akcji:");
        cenaSprzedazy = scanner.nextDouble();

        System.out.println("ile wyniosla prowizja od sprzedazy:");
        prowizjaSprzedazy = scanner.nextDouble();

        double total = bilans(liczbaAkcji, cenaZakupu, prowizjaZakupu, cenaSprzedazy, prowizjaSprzedazy);

        total = -1 * total;

        if (total > 0) {
            System.out.println("zanotowałeś zysk wynoszący " + total);
        }
        else {
            System.out.println("niestety, poniosłeś stratę w wysokości " + total);
        }
    }
    public static double bilans(int liczbaAkcji, double cenaZaAkcjeSzt, double prowizjaKupno, double cenaSprzedazSzt,
                                double prowizjaSprzedaz){
        double bilans;
        bilans = ((liczbaAkcji * cenaZaAkcjeSzt) - prowizjaKupno) - ((liczbaAkcji * cenaSprzedazSzt) + prowizjaSprzedaz);
        return bilans;
    }
}
