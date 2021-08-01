package VII_tablice_i_ArrList.zadania.zad_6;

public class DriverExam {

    public String[] correctAns = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D",
            "C", "C", "B", "D", "A"};
    public String[] examinatedAns = new String[correctAns.length];
    public int[] questionsMissed = new int[correctAns.length];

    // pusty konstruktor
    public DriverExam() {
    }

    public static boolean passed(int correct){

        boolean decision = false;
        if (correct >= 15){
            decision = true;
        }
        return decision;
    }

    public static int totalCorrect(String[] correctAns, String[] examinatedAns){
        int numCorrect = 0;
        for (int i = 0; i < correctAns.length ; i++) {
            if (correctAns[i].equalsIgnoreCase(examinatedAns[i])){
                numCorrect += 1;
            }
        }
        return numCorrect;
    }

    public static int totalIncorrect(String[] correct, String[] answears){
        int wrong = 0;
        for (int i = 0; i < correct.length ; i++) {
            if (!correct[i].equalsIgnoreCase(answears[i])){
                wrong += 1;
            }
        }
        return wrong;
    }

//    public static int questionsMissed(String[] answear){
//        int missed = 0;
//
//        for (int i = 0; i < answear.length ; i++) {
//            if (answear[i].isEmpty()){
//                missed += 1;
//            }
//        }
//        return missed;
//    }
}
