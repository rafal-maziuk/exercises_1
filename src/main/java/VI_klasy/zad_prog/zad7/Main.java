package VI_klasy.zad_prog.zad7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double promien;

        System.out.println("podaj promien kola: ");
        promien = scanner.nextDouble();

        Circle circle = new Circle();
        circle.setRadius(promien);

        System.out.println("srednica kola wynosi: " + circle.diameter());
        System.out.println("obwod kola wynosi: " + circle.circumference());
        System.out.println("pole kola wynosi: " + circle.area());
    }
}
