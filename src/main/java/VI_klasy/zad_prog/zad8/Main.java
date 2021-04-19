package VI_klasy.zad_prog.zad8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double temp;

        System.out.println("podaj temperature w stopniach Fahrenheita: ");
        temp = scanner.nextDouble();

        Temperature temp1 = new Temperature(temp);

        System.out.println("temperatuta przerobiona na Celsjusze to: " + temp1.celsius());
        System.out.println("temperatuta przerobiona na Kelviny to: " + temp1.kelvin());
    }
}
