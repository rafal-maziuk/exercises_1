package VII_tablice_i_ArrList.zadania.zad_1;

import java.util.Scanner;

public class RainFall {


    public double opadyRok(double[] tab) {
        double sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return sum;
    }

    public double avgMiesiecznyOpad(double sum) {
        return sum / 12.0;
    }

    public int miesiacZNajwOpadow(double[] tab) {
        double maxMonth = tab[0];
        int monthNr = 1;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > maxMonth) {
                maxMonth = tab[i];
                monthNr = i+1;
            }
        }
        return monthNr;
    }

    public int miesiacNajmnOpad(double[] tab) {
        double minMonth = tab[0];
        int monthNr = 1;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < minMonth) {
                minMonth = tab[i];
                monthNr = i+1;
            }
        }
        return monthNr;
    }
}
