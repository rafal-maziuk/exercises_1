package petle_i_pliki;

import javax.swing.*;

public class PK_4_4 {

    public static void main(String[] args) {

        int number;
        String input;

        input = JOptionPane.showInputDialog("podaj liczbę całkowitą pomiędzy 10, a 24");
        number = Integer.parseInt(input);

        while (number < 10 || number > 24) {
            input = JOptionPane.showInputDialog("błędna liczba! \nPodaj poorawną liczbę:");
            number = Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null, "dziękuję, poprawna liczba");
    }
}
