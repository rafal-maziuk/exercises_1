package V_metody.zad_progr;

import java.util.Scanner;

public class zad_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ile testow przeprowadziles?");
        int numOfTests = scanner.nextInt();
        int totalScore = 0;
        double avg = 0;

        for (int i = 0; i < numOfTests ; i++) {
            System.out.println("podaj wynik testu nr " + (i+1) + " :");
            int score = scanner.nextInt();
            if (determineGrade(score) == -1) {
                break;
            }
            totalScore += score;
        }
        avg = calcAverage(totalScore, numOfTests);
        int grade = determineGrade((int)avg);
        System.out.println("sredni wynik testow wynosi " + avg + ", co daje srednia ocene " + grade);

    }
    public static double calcAverage(int testScore, int numOfTests){
        double average = 0;
        average = testScore / numOfTests;
        return average;
    }
    public static int determineGrade(int wynik){
        int grade = 0;
        if (wynik >= 90 && wynik <= 100){
            grade = 5;
        } else if (wynik < 90 && wynik >= 80) {
            grade = 4;
        } else if (wynik < 80 && wynik >= 70) {
            grade = 3;
        } else if (wynik < 70 && wynik >= 60) {
            grade = 2;
        } else if (wynik < 60) {
            grade = 1;
        } else {
            System.out.println("złe dane!");
            grade = -1;
        }
        return grade;
    }
}
