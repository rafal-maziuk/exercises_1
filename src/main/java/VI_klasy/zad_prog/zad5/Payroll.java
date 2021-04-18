package VI_klasy.zad_prog.zad5;

public class Payroll {

    String fullName;
    int id;
    double payment;
    int amountHours;

    public Payroll() {
    }

    public Payroll(final String fullName, final int id) {
        this.fullName = fullName;
        this.id = id;
        payment = 0;
        amountHours = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(final double payment) {
        this.payment = payment;
    }

    public int getAmountHours() {
        return amountHours;
    }

    public void setAmountHours(final int amountHours) {
        this.amountHours = amountHours;
    }

    public double salary(){
        double salary;
        salary = payment * amountHours;
        return salary;
    }
}
