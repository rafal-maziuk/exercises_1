package IV_petle_i_pliki.zadania;

public class ZP_11 {
    public static void main(String[] args) {
        double celsjusz = 0.0;
        double fahrendheit;

        String tekst = "temperatura w: \nfahrenheitah \t celsjuszach";

        System.out.println(tekst);
        for (int i = 0; i < tekst.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
        for (int i = 0; i <= 20; i++) {
            fahrendheit =((9 * celsjusz)/5) + 32;
            System.out.println(fahrendheit + "\t\t\t" + celsjusz);
            celsjusz++;
        }
    }
}
