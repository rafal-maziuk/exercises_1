package VI_klasy.zad_prog.zad_14;

public class Patient {
    String firstName, secondName, surname, street, town;
    int postNr, phoneNr, phoneNrContact;
    String nameContact, surnameContact;

    public Patient() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(final String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(final String town) {
        this.town = town;
    }

    public int getPostNr() {
        return postNr;
    }

    public void setPostNr(final int postNr) {
        this.postNr = postNr;
    }

    public int getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(final int phoneNr) {
        this.phoneNr = phoneNr;
    }

    public int getPhoneNrContact() {
        return phoneNrContact;
    }

    public void setPhoneNrContact(final int phoneNrContact) {
        this.phoneNrContact = phoneNrContact;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(final String nameContact) {
        this.nameContact = nameContact;
    }

    public String getSurnameContact() {
        return surnameContact;
    }

    public void setSurnameContact(final String surnameContact) {
        this.surnameContact = surnameContact;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", postNr=" + postNr +
                ", phoneNr=" + phoneNr +
                ", phoneNrContact=" + phoneNrContact +
                ", nameContact='" + nameContact + '\'' +
                ", surnameContact='" + surnameContact + '\'' +
                '}';
    }
}
