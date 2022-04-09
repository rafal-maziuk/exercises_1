package IX_string.zadania.zad2;

public class Main {
    public static void main(String[] args) {

        String textInput = "show must go ON !!!";

        System.out.println(wordsCounting(textInput));
    }

    public static int wordsCounting(String str){

        String words = str.trim();

        if (words == null || words.isEmpty()){
            return 0;
        }

        String[] words2 = words.split("\\s+");

        return words2.length;
    }
}
