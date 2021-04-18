package VI_klasy.zad_prog.zad5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        int idNr, hours;
        double payment;
        Payroll user1 = new Payroll();
        Scanner scanner = new Scanner(System.in);


        System.out.println("podaj sowoje imie i nazwisko: ");
        name = scanner.nextLine();

        System.out.println("podaj swoj nr id: ");
        idNr = scanner.nextInt();

        System.out.println("podaj swoja stawke godzinowa: ");
        payment = scanner.nextDouble();
        user1.setPayment(payment);

        System.out.println("podaj ile godzin przepracowales w danym okresie czasu: ");
        hours = scanner.nextInt();
        user1.setAmountHours(hours);

        System.out.println("wypłata:");
        System.out.println(user1.salary());
    }
}
