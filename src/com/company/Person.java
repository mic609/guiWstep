package com.company;

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

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
