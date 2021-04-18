package VI_klasy.zad_prog.zad6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int t1, t2, t3;
        Scanner scanner = new Scanner(System.in);

        TestScores user1 = new TestScores();

        System.out.println("podaj wynik testu nr 1: ");
        t1 = scanner.nextInt();
        user1.setTest1(t1);

        System.out.println("podaj wynik testu nr 2: ");
        t2 = scanner.nextInt();
        user1.setTest2(t2);

        System.out.println("podaj wynik testu nr 3: ");
        t3 = scanner.nextInt();
        user1.setTest3(t3);

        System.out.println("średni wynik testów wynosi: ");
        System.out.println(user1.avg());
    }
}
