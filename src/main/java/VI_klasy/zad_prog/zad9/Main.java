package VI_klasy.zad_prog.zad9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int miesiac, rok;

        System.out.println("podaj nr miesiaca w postaci liczby calkowietej z przedzialu 1-12: ");
        miesiac = scanner.nextInt();

        System.out.println("podaj rok: " );
        rok = scanner.nextInt();

        MonthDays monthDays = new MonthDays(miesiac, rok);


        if ((miesiac  > 0) && ((miesiac < 13))){
            monthDays.numberOfDays(miesiac);
        }
        else {
            System.out.println("błędne dane! próbuj od nowa ;(");
            System.exit(-1);
        }
    }
}
