package petle_i_pliki.zadania;

import java.util.Scanner;

public class ZP_1 {
    public static void main(String[] args) {

        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("wpisz dowolną dodatnią liczbę całkowitą, która nie jest zerem: ");
        number = scanner.nextInt();

        for (int i = 0; i <= number ; i++) {
            sum += i;
        }
        System.out.println("suma liczb: " + sum);
    }
}
