package V_metody.zad_progr;

import java.util.Scanner;

public class zad_12 {
    public static void main(String[] args) {
        double masa, szybkosc;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj mase obiektu w KG :");
        masa = scanner.nextDouble();

        System.out.println("podaj szybkosc obiektu w m/s :");
        szybkosc = scanner.nextDouble();

        double energia = kineticEnergy(masa, szybkosc);
        System.out.println("energia kinetyczna podanego obiektu wynosi: " + energia);

    }
    public static double kineticEnergy(double masa, double szybkosc){
        double energy = 0.5 * masa * szybkosc * szybkosc;
        return energy;
    }
}
