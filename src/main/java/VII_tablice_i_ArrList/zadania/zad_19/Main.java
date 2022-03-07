package VII_tablice_i_ArrList.zadania.zad_19;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Question> questionList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choose, corrAns, playerOnePts = 0, playerTwoPts = 0;

        questionList.add(new Question("capital of Nederland?", "Amsterdam", "Antwerp",
                "Rotterdam", "Arnhem", 1));
        questionList.add(new Question("population of Gdansk?", "550k", "580k",
                "600k", "630k", 2));
        questionList.add(new Question("Name of Bond, 007?", "John", "Jarry",
                "James", "Jack", 3));
        questionList.add(new Question("capital of Albania?", "moscow", "Belgrad",
                "Skopje", "Tirana", 4));
        questionList.add(new Question("nationality of U.Bolt?", "Jamaica", "Dominicana",
                "Cuba", "Puerto Rico", 1));
        questionList.add(new Question("Name of Messi?", "Armando", "Leo",
                "Christiano", "Robin", 2));
        questionList.add(new Question("name of Del Piero?", "Piero", "Paulo",
                "Alessandro", "Christian", 3));
        questionList.add(new Question("capital of Burkina Faso?", "Nairobi", "Kinshasa",
                "Mambai", "Waga dugu", 4));
        questionList.add(new Question("capital of Sri Lanka?", "Sri Dziajavuranapuradecotte",
                "Colombo", "Dehli", "Masala", 1));
        questionList.add(new Question("name of Audioslave singer, Cornell?", "Claudio", "Chris",
                "Connor", "Clark", 2));


        for (int i = 0; i < questionList.size(); i++) {

            boolean decisionPlayerOne = false;
            boolean decisionPlayerTwo = false;
            corrAns = questionList.get(i).getCorrectAnswer();
            if (i % 2 != 0) {
                System.out.println("=== PLAYER 2, your turn ===");
                decisionPlayerTwo = true;
            } else {
                System.out.println("=== PLAYER 1, your turn ===");
                decisionPlayerOne = true;
            }

            System.out.println(questionList.get(i).toString());

            System.out.println("give your answer: ");
            choose = scanner.nextInt();
            if (choose >= 1 && choose <= 4) {
                if (choose == corrAns) {
                    if (decisionPlayerOne) {
                        System.out.println("correct ! point for you !");
                        playerOnePts += 1;
                    }
                    else if (decisionPlayerTwo){
                        System.out.println("correct ! point for you !");
                        playerTwoPts += 1;
                    }
                } else {
                    System.out.println("biiiip ! wrong !");
                }
            } else {
                System.out.println("answer with that number does not exist !");
            }
        }
        System.out.println("Player_1 have " + playerOnePts + " pts, and Player_2 have " + playerTwoPts + " pts");
    }
}
