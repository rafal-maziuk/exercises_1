package petle_i_pliki.zadania;

import java.util.Scanner;

public class ZP_4 {
    public static void main(String[] args) {

        int day, payment = 1;
        double suma = 0.0;
        Scanner scanner = new Scanner(System.in);

        /*
        1. 1
        2. 2*1 = 2
        3. 2*2 = 4
        4. 2*4 = 8
        5. 2*8 = 16
        ...
         */
        System.out.println("podaj ile dni przepracowałeś: ");
        day = scanner.nextInt();

        if(day == 1){
            System.out.println("zarobiles 1 grosz!");
        }
        else if (day <= 0) {
            System.out.println("błędne dane wejsciowe!");
        }
        else if(day >= 2) {
            System.out.println("dzień \t\tzarobek" );
            System.out.println("=================");
            System.out.println(1 + "\t\t\t" + payment);
            for (int i = 1; i < day; i++) {
                System.out.println((i+1) + "\t\t\t" + (payment *=2));
                suma += payment;
            }
            suma = suma + 1;
            System.out.println("totalny zarobek w groszach wyniosł: " + suma + "\na w zlotowkach: " + suma/100);
        }
    }
}
