package V_metody.zad_progr;

import java.util.Scanner;

public class zad_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String tekst;
        int num;

        System.out.println("wpisz dowolny tekst: ");
        tekst = scanner.nextLine();
        System.out.println("wpisz nr znaku ktory chcesz odczytac z podanego tekstu: ");
        num = scanner.nextInt();

        showChar(tekst,num);
    }

    public static void showChar(String text, int number){

        char c;
        if (number < 0 || number > text.length()) {
            System.out.println("numer spoza dlugosci tekstu!");
        }
        else {
            c = text.charAt(number);
            System.out.println(c);
        }
    }
}
