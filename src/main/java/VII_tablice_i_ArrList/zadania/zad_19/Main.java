package VII_tablice_i_ArrList.zadania.zad_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Question> questionList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choose;

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

//        Question question1 = new Question("capital of Nederland?" , "Amsterdam", "Antwerp",
//                "Rotterdam", "Arnhem", 1);
//        Question question2 = new Question("population of Gdansk?" , "550k", "580k",
//                "600k", "630k", 2);
//        Question question3 = new Question("Name of Bond, 007?" , "John", "Jarry",
//                "James", "Jack", 3);
//        Question question4 = new Question("capital of Albania?" , "moscow", "Belgrad",
//                "Skopje", "Tirana", 4);
//        Question question5 = new Question("nationality of U.Bolt?" , "Jamaica", "Dominicana",
//                "Cuba", "Puerto Rico", 1);
//        Question question6 = new Question("Name of Messi?" , "Armando", "Leo",
//                "Christiano", "Robin", 2);
//        Question question7 = new Question("name of Del Piero?" , "Piero", "Paulo",
//                "Alessandro", "Christian", 3);
//        Question question8 = new Question("capital of Burkina Faso?" , "Nairobi", "Kinshasa",
//                "Mambai", "Waga dugu", 4);
//        Question question9 = new Question("capital of Sri Lanka?" , "Sri Dziajavuranapuradecotte",
//                "Colombo", "Dehli", "Masala", 1);
//        Question question10 = new Question("name of Audioslave singer, Cornell?" , "Claudio", "Chris",
//                "Connor", "Clark", 2);


    }
}
