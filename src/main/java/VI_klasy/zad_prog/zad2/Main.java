package VI_klasy.zad_prog.zad2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(2018, "opel");

        System.out.println("poczatkowa szybkosc: " + car.getSpeed());

        for (int i = 0; i < 5; i++) {
            car.accelerate();
            System.out.println("aktualna predkosc to " + car.getSpeed());
        }

        for (int i = 0; i < 5 ; i++) {
            car.brake();
            System.out.println("aktualna predkosc: " + car.getSpeed());
        }
    }
}
