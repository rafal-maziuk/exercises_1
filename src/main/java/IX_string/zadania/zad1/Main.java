package IX_string.zadania.zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz swój tekst: ");
        String input = scanner.nextLine();

        String finalString = method(input);
        System.out.println(finalString);

    }
    public static String method(String str){
        char[] chars = str.toCharArray();
        int index = str.length();
        char[] secondArray = new char[index];

        for (int i = 0; i < str.length(); i++) {
            secondArray[index-1] = chars[i];
            index--;
        }
        String result = String.valueOf(secondArray);
        return result;
    }
}
