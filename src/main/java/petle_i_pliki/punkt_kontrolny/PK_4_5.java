package petle_i_pliki.punkt_kontrolny;

import javax.swing.*;

public class PK_4_5 {
    public static void main(String[] args) {

        String input;
        char symbol;

        input = JOptionPane.showInputDialog("wpisz jedną z liter: \nT, \nt, \nN, \nn");
        symbol = input.charAt(0);

        while (symbol != 'T' && symbol != 't' && symbol != 'N' && symbol != 'n') {
            input = JOptionPane.showInputDialog("BRAWO! nie umiesz wpisać jednej litery...\nponów próbę:");
            symbol = input.charAt(0);
        }
        JOptionPane.showMessageDialog(null, "dobra robota");
    }
}
