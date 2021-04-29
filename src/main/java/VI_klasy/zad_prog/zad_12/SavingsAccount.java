package VI_klasy.zad_prog.zad_12;

public class SavingsAccount {

    int rocznaStopaOprocentowania;
    double stanKonta=0;
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

    public int getRocznaStopaOprocentowania() {
        return rocznaStopaOprocentowania;
    }

    public void setRocznaStopaOprocentowania(final int rocznaStopaOprocentowania) {
        this.rocznaStopaOprocentowania = rocznaStopaOprocentowania;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    public double getOdsetki() {
        return odsetki;
    }

    public void setOdsetki(final double odsetki) {
        this.odsetki = odsetki;
    }
}
