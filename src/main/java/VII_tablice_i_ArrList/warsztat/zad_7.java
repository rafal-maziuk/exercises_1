package VII_tablice_i_ArrList.warsztat;

import java.util.Random;

public class zad_7 {
    public static void main(String[] args) {

        int[][] grades = new int[30][10];
        Random random = new Random();

        for (int i = 0; i < grades.length ; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                int randomNr = random.nextInt(100);
                grades[i][j] = randomNr;
            }
        }
        showArray(grades);

        double total = 0;
        double avg;
        int vol = 0;

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                total += grades[i][j];
                vol++;      //total num of values in tables
            }
        }
        avg = total / vol;
        System.out.println();
        System.out.println("total z tablicy wynosi: " + total);
        System.out.printf("średnia z całej tablicy: %.2f", avg); //printf for format output to 2 places after .
    }

    public static void showArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
