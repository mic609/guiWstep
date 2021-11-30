package com.company;

import java.util.Objects;

public class Person {

    private String imie;
    private String nazwisko;

    //------------------------------------------------------------------------------------------------------------------

    public void setImie(String imie) {
        this.imie = imie;
    }

    //------------------------------------------------------------------------------------------------------------------

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    //------------------------------------------------------------------------------------------------------------------


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return imie.equals(person.imie) && nazwisko.equals(person.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
