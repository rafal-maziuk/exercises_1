package petle_i_pliki;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PK_4_19 {

    public static void main(String[] args) throws IOException { // added Exception

        String filename = "MyText.txt";
        String name;
        PrintWriter outputFile = new PrintWriter(filename);     // creating, opening file

        Scanner keyboard = new Scanner(System.in);      // taking info from user


        System.out.println("podaj swoje imię i nazwisko: ");
        name = keyboard.nextLine();

        outputFile.println(name);       //saving name in file
        outputFile.close();             //closing file
        System.out.println("dane zapisane w pliku!");

        insideData(filename);       // first check what is inside file

        //creating fileWriter to add some info, without removing existing data
        FileWriter fwriter = new FileWriter(filename, true);
        PrintWriter pWriter = new PrintWriter(fwriter);

        pWriter.println("Adam");
        pWriter.println("Corey");
        pWriter.close();

        insideData(filename);       // second check what is inside file
    }

    public static void insideData(String filename) throws IOException{
        File file = new File(filename);     // creating File to read data
        Scanner inputFile = new Scanner(file);

        System.out.println("===== początek wyświetlania zawartości pliku =====");
        while (inputFile.hasNext())
        {
            String inputName = inputFile.nextLine();
            System.out.println(inputName);
        }
        System.out.println("===== koniec wyświetlania zawartości pliku =====");
        inputFile.close();

    }
}
