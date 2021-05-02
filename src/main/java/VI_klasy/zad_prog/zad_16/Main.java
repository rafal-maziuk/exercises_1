package VI_klasy.zad_prog.zad_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("podaj nr przedziału na ruletce [zakres 0-36]: ");
        input = scanner.nextInt();

        if (input < 0 || input > 36){
            System.out.println("błędne dane wejściowe! zaczynaj od początku! ;(");
            System.exit(-1);
        }
        else {
            RoulettePocket roulettePocket = new RoulettePocket(input);
            System.out.println("kolor podanego przedziału to: " + roulettePocket.getPocketColor(input));
        }
    }
}
