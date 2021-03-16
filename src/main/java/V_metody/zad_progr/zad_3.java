package V_metody.zad_progr;

import java.util.Scanner;

public class zad_3 {
    public static void main(String[] args)
    {
        double length,    // The rectangle's length
                width,     // The rectangle's width
                area;      // The rectangle's area

        // Get the rectangle's length from the user.
        length = getLength();

        // Get the rectangle's width from the user.
        width = getWidth();

        // Get the rectangle's area.
        area = getArea(length, width);

        // Display the rectangle data.
        displayData(length, width, area);
    }
    static Scanner scanner = new Scanner(System.in);

    public static double getLength() {
        System.out.println("podaj długosc boku prostokata: ");
        int dlugosc = scanner.nextInt();
        return dlugosc;
    }
    public static double getWidth() {
        System.out.println("podaj szerokosc boku prostokata: ");
        int szerokosc = scanner.nextInt();
        return szerokosc;
    }
    public static double getArea(double dlu, double szer) {
        double area = dlu * szer;
        return area;
    }
    public static void displayData(double dlu, double szer, double pole) {
        System.out.println("dlugosc jednego boku wynosi: " + dlu + "\ndlugosc drugiego boku to: " + szer +
                "\npole figury wynosi: " + pole + "[jp]");
    }
}
