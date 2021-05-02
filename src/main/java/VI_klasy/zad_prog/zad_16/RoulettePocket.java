package VI_klasy.zad_prog.zad_16;

public class RoulettePocket {

    int number;

    public RoulettePocket(final int number) {
        this.number = number;
        String color = getPocketColor(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public String getPocketColor(int number) {
        String colour = "";
        if (number == 0){
            colour = "zielony";
        }
        if ((number >= 1 && number <= 10) || (number >= 19 && number <= 28)){
            if (number % 2 == 0) {
                colour = "czarny";
            }
            else
                colour = "czerwony";
        }
        else if ((number >= 11 && number <= 18) || (number >= 29 && number <= 36)){
            if (number % 2 == 0) {
                colour = "czerwony";
            }
            else
                colour = "czarny";
        }

        return colour;
    }
}
