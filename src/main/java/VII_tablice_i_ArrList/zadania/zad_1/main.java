package VII_tablice_i_ArrList.zadania.zad_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double[] tab = new double[12];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tab.length; i++) {
            int opad = 0;
            System.out.println("podaj opad w mm dla miesiąca nr " + (i + 1) + " : ");
            opad = scanner.nextInt();
            if (opad<0){
                System.out.println("błędne dane wejściowe!");
                System.exit(-1);
            }
            tab[i] = opad;
        }

        RainFall rainFall = new RainFall();

        double opadytotal = rainFall.opadyRok(tab);
        System.out.println("laczne opady: " + opadytotal);
        System.out.println("srednie: " + rainFall.avgMiesiecznyOpad(opadytotal));
        System.out.println("miesiac max: " + rainFall.miesiacZNajwOpadow(tab));
        System.out.println("miesiac min: " + rainFall.miesiacNajmnOpad(tab));
    }
}
