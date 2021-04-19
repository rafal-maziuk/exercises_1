package VI_klasy.zad_prog.zad8;

public class Temperature {

    double fahrenheit;
    double ftemp;

    public Temperature(final double fahrenheit) {
        ftemp = fahrenheit;
    }

    public double getFahrenheit() {
        return ftemp;
    }

    public void setFahrenheit(final double fahrenheit) {
        ftemp = fahrenheit;
    }

    public double celsius(){
        double cel = (5/9.0) * (ftemp - 32);
        return cel;
    }

    public double kelvin(){
        double kel = ((5/9.0) * (ftemp - 32)) + 273;
        return kel;
    }
}
