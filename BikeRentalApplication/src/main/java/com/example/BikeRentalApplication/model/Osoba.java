package com.example.BikeRentalApplication.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="osoba")
@Data
@NoArgsConstructor
public  class Osoba{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String imie;
    private String nazwisko;
    private String plec;
    private LocalDate dataUrodzenia;

    @ElementCollection
    private List<Integer> numerTelefonu;
    private String email;

    @OneToOne(mappedBy = "osoba", cascade = CascadeType.ALL)
    private Klient klientRole;

    @OneToOne(mappedBy = "osoba", cascade = CascadeType.ALL)
    protected Pracownik pracownikRole;

    public static List<Osoba> osoby= new ArrayList<>();
    @Transient
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

    public Pracownik getPracownikRole() {
        return pracownikRole;
    }

    //TODO add if null Role
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
                //", klientRole=" + klientRole.toString() +
                //", pracownikRole=" + pracownikRole.toString() +
                '}';
    }

    public int getId() {
        return id;
    }
}
