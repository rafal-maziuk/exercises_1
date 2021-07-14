package VII_tablice_i_ArrList.zadania.zad_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DriverExam driverExam = new DriverExam();
        Scanner scanner = new Scanner(System.in);
        String odp;

        for (int i = 0; i < driverExam.correctAns.length ; i++) {
            System.out.print("podaj odpowiedz na pytanie nr " + (i+1) + " : ");
            odp = scanner.nextLine();
            if (!odp.equalsIgnoreCase("a") && !odp.equalsIgnoreCase("b")
                    && !odp.equalsIgnoreCase("c") && !odp.equalsIgnoreCase("d")) {
                System.out.println("zła odpowiedź! wpisz poprawną!");
                break;
            } else
            driverExam.examinatedAns[i] = odp;
        }

        int correct = driverExam.totalCorrect(driverExam.correctAns, driverExam.examinatedAns);
        System.out.println("liczba poprawnych odpowiedzi wynosi: " + correct);
        int incorrect = driverExam.totalIncorrect(driverExam.correctAns, driverExam.examinatedAns);
        System.out.println("liczba NIEpoprawnych odpowiedzi wynosi: " + incorrect);

        System.out.println("czy egzmain zostal zdany? " + driverExam.passed(correct));

    }
}
