package VI_klasy.zad_prog.zad_14;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient();

        patient.setFirstName("Rafal");
        patient.setSurname("Java");
        patient.setPhoneNr(555777);
        patient.setTown("Gdansk");

        Procedure procedure1 = new Procedure("usg", "1/04/2021", "dr Oetker", 330);
        Procedure procedure2 = new Procedure("rezonans", "5/04/2021", "dr Alban", 2000);
        Procedure procedure3 = new Procedure("lewatywa", "10/04/2020", "dr House", 666);

        double totalAmount = procedure1.getOplataZaBadanie() + procedure2.getOplataZaBadanie() + procedure3.getOplataZaBadanie();

        System.out.println("badanie nr 1: \n" + procedure1.toString());
        System.out.println("badanie nr 2: \n" + procedure2.toString());
        System.out.println("badanie nr 3: \n" + procedure3.toString());
        System.out.println("łączna cena za badania wynosi: " + totalAmount);
    }
}
