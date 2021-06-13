package VII_tablice_i_ArrList.warsztat;

import java.util.Random;

public class zad_9 {
    public static void main(String[] args) {

        double[][] values = new double[10][20];
        double total = 0;
        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length ; j++) {
                values[i][j] = random.nextInt(100);
                total += values[i][j];
            }
        }
        System.out.println("wynik: " + total);
    }
}
