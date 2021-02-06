package petle_i_pliki;

import javax.swing.*;

public class PK_4_6 {

    public static void main(String[] args) {

        String input;

        input = JOptionPane.showInputDialog("wpisz 'Tak' lub 'Nie' :");

        while(!input.equals("Tak") && !input.equals("Nie")) {

            input = JOptionPane.showInputDialog("błąd. wpisz poprawne dane: ");
        }
        System.out.println("okej");
    }
}
