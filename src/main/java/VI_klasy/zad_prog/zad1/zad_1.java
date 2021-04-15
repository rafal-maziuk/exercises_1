package VI_klasy.zad_prog.zad1;

public class zad_1 {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Sara Morgan", 123, "rachunkowość", "wiceprezes");
        Employee employee2 = new Employee("Marek Janczyk", 456, "informatyka", "programista");
        Employee employee3 = new Employee("Julia Rak", 789, "produkcja", "inżynier");

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
    }
}
