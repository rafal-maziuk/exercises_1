package VI_klasy.zad_prog.zad_11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int temperature = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj temperaturę w stopniach C : ");
        temperature = scanner.nextInt();
        Substance substance = new Substance();

        if (substance.isEthylBoiling(temperature) == true){
            System.out.println("etyl wrze");
        }
        if (substance.isEthylFreezing(temperature) == true){
            System.out.println("etyl zamarza");
        }
        if (substance.isOxygenBoiling(temperature) == true){
            System.out.println("tlen wrze");
        }
        if (substance.isOxygenFreezing(temperature) == true){
            System.out.println("tlen zamarza");
        }
        if (substance.isWaterBoiling(temperature) == true){
            System.out.println("woda wrze");
        }
        if (substance.isWatesFreezing(temperature)== true){
            System.out.println("woda zamarza");
        }
    }
}
