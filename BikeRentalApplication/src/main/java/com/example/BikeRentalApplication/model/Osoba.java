package com.example.BikeRentalApplication.model;

import org.springframework.security.access.method.P;

import java.time.LocalDate;
import java.util.List;
public  class Osoba{
    private int id;
    private String imie;
    private String nazwisko;
    private String plec;
    private LocalDate dataUrodzenia;
    private List<Integer> numerTelefonu;
    private String email;

    private Klient klientRole;
    private Pracownik pracownikRole;


    private int wiek;

    public Osoba(int id, String imie, String nazwisko, String plec, LocalDate dataUrodzenia, List<Integer> numerTelefonu, String email) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.dataUrodzenia = dataUrodzenia;
        this.numerTelefonu = numerTelefonu;
        this.email = email;

    }
    public void setKlientRole() {
        this.klientRole = new Klient(this) ;
        //klientRole.setOsoba(this);
    }
    public void setPracownikRole() {
        this.pracownikRole = new Pracownik(this);
        //pracownikRole.setOsoba(this);
    }


    @Override
    public String toString() {
        return "Osoba{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec='" + plec + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ", numerTelefonu=" + numerTelefonu +
                ", email='" + email + '\'' +
                ", klientRole=" + klientRole.toString() +
                ", pracownikRole=" + pracownikRole.toString() +
                '}';
    }

    public int getId() {
        return id;
    }
}
