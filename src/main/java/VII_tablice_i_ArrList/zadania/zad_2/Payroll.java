package VII_tablice_i_ArrList.zadania.zad_2;

public class Payroll {

    int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    int[] hours = new int[7];
//    int[] hours = {100, 120, 140, 160, 180, 200, 220};
    double[] payRate = new double[7];
//    double[] payRate = {20, 22, 18, 17, 14, 24, 21};
    double[] wages = new double[7];

    //constructor no args
    public Payroll() {
    }

    public double wynagrodzenie(int id){

        int userId = id;
        double payment = 0;
        for (int i = 0; i < employeeId.length; i++) {
            if (employeeId[i] == userId){
                payment = wages[i];
                return payment;
            }
        }
        System.out.println("pracownik nie istnieje!");
        return -1;
    }

    public int[] getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(final int[] employeeId) {
        this.employeeId = employeeId;
    }

    public int[] getHours() {
        return hours;
    }

    public void setHours(final int[] hours) {
        this.hours = hours;
    }

    public double[] getPayRate() {
        return payRate;
    }

    public void setPayRate(final double[] payRate) {
        this.payRate = payRate;
    }

    public double[] getWages() {
        return wages;
    }

    public void setWages(final double[] wages) {
        this.wages = wages;
    }
}
