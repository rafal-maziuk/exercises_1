package VII_tablice_i_ArrList.warsztat;

import java.util.Scanner;

public class zad_5 {
    public static void main(String[] args) {

        int[] id = new int[5];
        double[] salary = new double[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < id.length; i++) {
            System.out.println("podaj wypłatę pracownika nr " + (i+1) + " : ");
            salary[i] = scanner.nextDouble();
        }

        for (int i = 0; i < id.length; i++) {
            System.out.println("pracownik " + (i+1) + ", zarabia " + salary[i]);
        }


    }
}
