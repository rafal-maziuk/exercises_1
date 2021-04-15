package VI_klasy.zad_prog.zad3;

public class Person {

    private String fullName;
    private String adres;
    private int age;
    private int phoneNr;

    public Person(final String fullName, final String adres, final int age, final int phoneNr) {
        this.fullName = fullName;
        this.adres = adres;
        this.age = age;
        this.phoneNr = phoneNr;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(final String adres) {
        this.adres = adres;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public int getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(final int phoneNr) {
        this.phoneNr = phoneNr;
    }
}
