package V_metody.zad_progr;

public class zad_6 {
    public static void main(String[] args) {

        System.out.println("stopnie Celsjusza\t stopnie Fahrenheita");
        for (int i = 0; i <= 20 ; i++) {
            System.out.printf("\t %.2f" + "\t\t\t\t " + i + "\n", celsius(i));
        }
    }
    public static double celsius(int fahrenheitTemp){
        double celsius;
        celsius = (5.0 / 9)*(fahrenheitTemp - 32);
        return celsius;
    }
}
