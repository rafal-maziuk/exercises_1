package VII_tablice_i_ArrList.zadania.zad_6;

public class DriverExam {

    public String[] correctAns = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D",
            "C", "C", "B", "D", "A"};
    public String[] examinatedAns = new String[20];
    public int[] questionsMissed;

    public DriverExam() {
    }

    public static boolean passed(String[] correct, String[] ans){

        boolean decision = true;
        for (int i = 0; i < correct.length ; i++) {
            if (correct[i].equalsIgnoreCase(ans[i])){
                decision = true;
            } else
                decision = false;
        }
        System.out.println(decision);
        return decision;
    }

    public static int totalCorrect(String[] correct, String[] ans){
        int numCorrect = 0;
        for (int i = 0; i < correct.length ; i++) {
            if (correct[i].equalsIgnoreCase(ans[i])){
                numCorrect += 1;
            }
        }
        return numCorrect;
    }

    public static int totalIncorrect(){
        return 0;
    }


}
