package V_metody.zad_progr;

import java.util.Scanner;

public class zad_13 {
    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj dowolną liczbę całkowitą: ");
        num = scanner.nextInt();

        System.out.println("sprawdzanie czy liczba jest pierwsza ...");
        boolean czyPierwsza = isPrime(num);
        System.out.println("czy liczba " + num + " jest liczbą pierwszą? wynik: " + czyPierwsza);
    }
    public static boolean isPrime(double num){
        if (num < 2) {      // liczby 0 i 1 nie sa uznawane za pierwsze
            System.out.println("podana liczba nie jeste liczba pierwsza");
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
