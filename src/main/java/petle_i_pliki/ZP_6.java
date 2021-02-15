package petle_i_pliki;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ZP_6 {
    public static void main(String[] args) throws IOException {

        String filename;
        Scanner scanner = new Scanner(System.in);
        int wystąpienie =0;

        System.out.println("podaj nazwe pliku: ");
        filename = scanner.nextLine();

        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("błąd!");
            System.exit(0);
        }
        Scanner inputFile = new Scanner(file);

        System.out.println("jaka litere liczyc?");
        String litera = scanner.nextLine();
        char szukanyZnak = litera.charAt(0);

        while(inputFile.hasNext()){
            char[] znaki = inputFile.next().toCharArray();
            for (int i = 0; i < znaki.length ; i++) {
                char znakDwa = znaki[i];
                if (znakDwa == szukanyZnak) {
                    wystąpienie++;
                }
            }
        }
        System.out.println("litera wystepuje w takiej ilosci: " + wystąpienie);
    }
}
