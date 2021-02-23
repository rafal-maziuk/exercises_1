package petle_i_pliki.punkt_kontrolny;

import javax.swing.*;

public class PK_4_13 {

    public static void main(String[] args) {

        int number = 0, inputNum;
        String input;

        for (int i = 0; i < 7; i++) {
            input = JOptionPane.showInputDialog("wpisz liczbę całkowitą nr " + (i + 1) + " :");
            inputNum = Integer.parseInt(input);

            number += inputNum;
        }
        JOptionPane.showMessageDialog(null, "suma liczb wynosi: " + number);
    }
}
