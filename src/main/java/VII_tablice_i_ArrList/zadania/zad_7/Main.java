package VII_tablice_i_ArrList.zadania.zad_7;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String filename = "odpowiedzi.txt";
        PrintWriter outputFile = new PrintWriter(filename);
        outputFile.println("tak, oczywiście!");
        outputFile.println("bez wątpienia.");
        outputFile.println("możesz na to liczyć");
        outputFile.println("pewnie!");
        outputFile.println("zapytaj o to kiedy indziej");
        outputFile.println("nie mam pewności");
        outputFile.println("nie mogę Ci teraz odpowiedzieć");
        outputFile.println("odpowiem po drzemce");
        outputFile.println("bez szans!");
        outputFile.println("nie wydaje mi się");
        outputFile.println("na pewno nie");
        outputFile.println("odpowiedź to jednoznaczne NIE!");
        outputFile.close();

        ArrayList<String> arrayList = new ArrayList<>();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()){
            String ans = inputFile.nextLine();
            arrayList.add(ans);
        }
        inputFile.close();

        String userDecison, inputAns;
        Scanner scanner = new Scanner(System.in);

        do {
            Random random = new Random();
            int randomNr = random.nextInt(arrayList.size());
            System.out.println("masz jakieś pytanie?");
            inputAns = scanner.nextLine();

            System.out.println("hmm, niech pomyślę...");
            System.out.println(arrayList.get(randomNr));
            System.out.println();
            System.out.println("czy chesz zapytać o coś jeszcze?");
            System.out.println("wpisz 't' lub 'T' jeśli chcesz kontynuować: ");
            userDecison = scanner.nextLine().substring(0,1);

        }
        while (userDecison.equalsIgnoreCase("t"));
    }
}
