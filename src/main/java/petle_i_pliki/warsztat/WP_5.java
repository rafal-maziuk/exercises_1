package petle_i_pliki.warsztat;

public class WP_5 {
    public static void main(String[] args) {

        double num1 = 1, num2 = 30;
        double score;
        double total = 0;

        for (int i = 1; i <= 30 ; i++) {
            score = num1 / num2;
            total += score;
            num1++;
            num2--;
        }
        System.out.println("suma ciagu liczb wynosi: " + total);
    }
}
