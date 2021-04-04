package V_metody.zad_progr;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class zad_14 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("liczbyPierwsze.txt");
        int numer;

        for (int i = 1; i <= 100 ; i++) {
            if (isPrime(i) == true) {
                numer = i;
                printWriter.println(numer);
            }
        }
        printWriter.close();
        System.out.println("program zakonczyl dzialanie");
    }
    public static boolean isPrime(double num){
        if (num < 2) {      // liczby 0 i 1 nie sa uznawane za pierwsze
            return false;
        }
        for (int i = 2; i*i <= num; i++){
            if (num % i == 0){      // jeśli znajdzie się dzielnik to liczba nie jest pierwsza
                return false;
            }
        }
        return true;
    }
}
