package V_metody.zad_progr;

import java.util.Random;

public class zad_15 {
    public static void main(String[] args) {

        int parzyste = 0, nieparzyste = 0, randomNr;
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            randomNr = random.nextInt(1000);
            if (isEven(randomNr) == true){
                parzyste++;
            } else {
                nieparzyste++;
            }
        }
        System.out.println("ilosc liczb parzystych wynosi: " + parzyste);
        System.out.println("ilosc liczb NIEparzystych wynosi: " + nieparzyste);

    }
    public static boolean isEven (int n){

        if (n % 2 == 0){
            System.out.println("liczba " + n + " jest parzysta");
            return true;
        }
        else return false;
    }
}
