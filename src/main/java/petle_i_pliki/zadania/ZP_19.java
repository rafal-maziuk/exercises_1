package petle_i_pliki.zadania;

import java.util.Random;
import java.util.Scanner;

public class ZP_19 {
    public static void main(String[] args) {

        String colour= "none", red = "czerwony", green = "zielony", blue= "niebieski", orange= "pomarańczowy", yellow= "żółty";
        Random random = new Random();
        String input;
        Scanner scanner = new Scanner(System.in);
        int number, count = 0;

        for (int i = 0; i < 10 ; i++) {
            number = random.nextInt(5);

            System.out.println("podaj kolor wybrany przez PC [czerwony, zielony, niebieski, pomarańczowy, żółty]: ");
            input = scanner.nextLine();

            if (number == 0){
                colour = red;
            }
            else if (number == 1){
                colour = green;
            }
            else if (number == 2){
                colour = blue;
            }
            else if (number == 3){
                colour = orange;
            }
            else if (number == 4){
                colour = yellow;
            }
            System.out.println("wybór PC: " + colour);
            if (input.equalsIgnoreCase(colour)){
                count += 1;
            }
        }
        System.out.println("========== odgadles kolory poprawnie tyle razy: " + count);

    }
}
