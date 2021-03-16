package V_metody.zad_progr;

import java.util.Scanner;

public class zad_2 {
    public static void main(String[] args) {

        double cena;
        int marża;
        Scanner scanner = new Scanner(System.in);

        System.out.println("wpisz cenę produktu:");
        cena = scanner.nextDouble();
        System.out.println("wpisz marżę produktu, w procentach:");
        marża = scanner.nextInt();

        calculateRetail(cena,marża);
    }
    public static void calculateRetail(double price, int marza){
        double value = price + (price*marza)/100;
        System.out.println("cena produktu po podliczeniu marży wynosi: " + value);
    }
}
