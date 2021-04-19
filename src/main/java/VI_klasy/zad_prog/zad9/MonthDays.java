package VI_klasy.zad_prog.zad9;

public class MonthDays {

    int month, year, numOfDays;

    public MonthDays() {
    }

    public MonthDays(final int month, final int year) {
        this.month = month;
        this.year = year;
    }

    public void numberOfDays(int month){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month == 11){
            numOfDays = 31;
        }
        else if (month == 2) {
            if ((year % 100 == 0) && (year % 400 == 0)) {
                numOfDays = 29;
            } else if ((year % 100 != 0) && (year % 4 == 0)) {
                numOfDays = 29;
            }
            else
                numOfDays = 28;
        }
        else {
            numOfDays = 30;
        }
        System.out.println("miesiąc ma " + numOfDays + " dni");
    }
}
