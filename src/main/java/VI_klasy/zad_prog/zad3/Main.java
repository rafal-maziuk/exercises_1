package VI_klasy.zad_prog.zad3;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Rafal Maz", "Gdansk", 31, 505111);
        Person person2 = new Person("Adam Małysz", "Wisłą", 35, 333444);
        Person person3 = new Person("Stefan Gerard", "Glasgow", 42, 777888);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

    }
}
