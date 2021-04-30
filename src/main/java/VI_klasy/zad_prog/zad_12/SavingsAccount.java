package VI_klasy.zad_prog.zad_12;

public class SavingsAccount {

    int rocznaStopaOprocentowania;
    double stanKonta;

    public SavingsAccount(final double stanKonta) {
        this.stanKonta = stanKonta;
    }

    public double wyplacanieZKonta(int kwota){
        stanKonta -= kwota;
        return stanKonta;
    }
    public double wplacanaKwota(int kwota){
        stanKonta += kwota;
        return stanKonta;
    }

    public double dodawanieMiesiecznychOdsetek(double ods){
        double odsMiesac = ods / 12.0;
        stanKonta = stanKonta + ((odsMiesac * stanKonta) / 100.0);
        return stanKonta;
    }

    public void setRocznaStopaOprocentowania(final int rocznaStopaOprocentowania) {
        this.rocznaStopaOprocentowania = rocznaStopaOprocentowania;
    }

    public double getStanKonta() {
        return stanKonta;
    }
}
