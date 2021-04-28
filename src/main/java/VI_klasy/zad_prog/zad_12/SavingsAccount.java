package VI_klasy.zad_prog.zad_12;

public class SavingsAccount {

    int rocznaStopaOprocentowania;
    double stanKonta;
    double odsetki = rocznaStopaOprocentowania / 12.0;

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
        this.odsetki = ods;
        stanKonta += (ods * stanKonta);
        return stanKonta;
    }

    public double getStanKonta() {
        return stanKonta;
    }
}
