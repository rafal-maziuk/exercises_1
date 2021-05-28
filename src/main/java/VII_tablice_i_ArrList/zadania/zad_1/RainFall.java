package VII_tablice_i_ArrList.zadania.zad_1;

public class RainFall {

    double[] tab = new double[12];


    public double opadyRok(double[] tab){
        double sum = 0;
        for (int i = 0; i < tab.length ; i++) {
            sum += tab[i];
        }
        return sum;
    }
    public double avgMiesiecznyOpad(){
        return 0;
    }
    public String miesiacZNajwOpadow(){
        return "";
    }
    public String miesiacNajmnOpad(){
        return "";
    }
}
