package VI_klasy.zad_prog.zad_11;

public class Substance {

    String name;
    double temp;
    final double ABSOLUTE_ZERO = -273.15;

    public Substance(final String name, final double temp) {
        this.name = name;
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(final double temp) {
        this.temp = temp;
    }

    public boolean isEthylFreezing(int temperature){
        if (temperature < ABSOLUTE_ZERO) {
            System.out.println("temperatura poniżej zera absolutnego!");
            return false;
        }
        else if (temperature <= -114 && temperature >= ABSOLUTE_ZERO){
                return true;
        }
        else {
            return false;
        }
    }
    public boolean isEthylBoiling(int temperature){
        if (temperature >= 78){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isOxygenFreezing(int temperature){
        if (temperature < ABSOLUTE_ZERO) {
            System.out.println("temperatura poniżej zera absolutnego!");
            return false;
        }
        else if (temperature <= -218 && temperature >= ABSOLUTE_ZERO){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isOxygenBoiling(int temperature){
        if (temperature >= -183){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isWatesFreezing(int temperature){
        if (temperature < ABSOLUTE_ZERO) {
            System.out.println("temperatura poniżej zera absolutnego!");
            return false;
        }
        else if (temperature <= 0 && temperature >= ABSOLUTE_ZERO){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isWaterBoiling(int temperature){
        if (temperature >= 100){
            return true;
        }
        else {
            return false;
        }
    }
}
