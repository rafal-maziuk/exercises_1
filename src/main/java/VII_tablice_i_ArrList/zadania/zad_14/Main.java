package VII_tablice_i_ArrList.zadania.zad_14;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File fileGirlName = new File("C:\\_IT\\cwiczenia\\exc_1\\src\\main\\java\\VII_tablice_i_ArrList\\zadania\\zad_14\\GirlNames.txt"),
                fileBoyName = new File("BoyNames.txt");
        Scanner input1 = new Scanner(fileGirlName);
        Scanner input2 = new Scanner(fileBoyName);
        ArrayList<String> girlNameList = new ArrayList<>();
        ArrayList<String> boyNameList = new ArrayList<>();

        method(input1, girlNameList);
        method(input2, boyNameList);

        System.out.println(girlNameList);
        System.out.println(boyNameList);
    }

    public static void method(@NotNull Scanner scan, List list){
        while (scan.hasNext()){
            String name = scan.nextLine();
            list.add(name);
        }
        scan.close();
        System.out.println();
    }
}