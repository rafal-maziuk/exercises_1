package VII_tablice_i_ArrList.zadania.zad_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Payroll payroll = new Payroll();


        for (int i = 0; i < payroll.employeeId.length; i++) {
            double brutto=0;
            System.out.println("podaj liczbe przepracowanych godzin pracownika nr " + (payroll.employeeId[i]) + " :");
            payroll.hours[i] = scanner.nextInt();
            System.out.println("podaj stawkę godzinową pracownika nr " + (payroll.employeeId[i]) + " :");
            payroll.payRate[i] = scanner.nextDouble();

            brutto = payroll.hours[i] * payroll.payRate[i];
            payroll.wages[i] = brutto;
        }

        System.out.println("wypłata pracownika nr 4520125 wynosi: ");   //good nr
        System.out.println(payroll.wynagrodzenie(4520125));
        System.out.println("wypłata pracownika nr 45201 wynosi: ");   //error
        System.out.println(payroll.wynagrodzenie(45201));
    }
}
