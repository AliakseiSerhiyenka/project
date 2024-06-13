package com.example.BikeRentalApplication.model;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Klient {
    private int iloscRezerwacji;
    private List<Rezerwacja> rezerwacje;
    private Osoba osoba;
    public static List<Klient> klients= new ArrayList<>();

    public Klient(Osoba osoba) {
        this.osoba=osoba;
        klients.add(this);
        //osoba.setKlientRole();

    }

    public void addToRezewacje(Rezerwacja rezerwacja){
      rezerwacje.add(rezerwacja);
    }
    public int getKlientId(){
       return osoba.getId();
    }

    public Osoba getOsoba() {
        return osoba;
    }


    @Override
    public String toString() {
        return "Klient{" +
                "rezerwacje=" + rezerwacje +
                '}';
    }
}
