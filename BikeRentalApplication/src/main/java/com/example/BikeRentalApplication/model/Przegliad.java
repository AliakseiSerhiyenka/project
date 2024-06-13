package com.example.BikeRentalApplication.model;

import java.time.LocalDate;

public class Przegliad {
    private int id;
    private LocalDate dataPrzegladu;
    private String opis;
    Rower rower;
    Naprawa naprawa;
    Serwisant  serwisant;


    public Przegliad(int id, LocalDate dataPrzegladu, String opis) {
        this.id = id;
        this.dataPrzegladu = dataPrzegladu;
        this.opis = opis;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataPrzegladu() {
        return dataPrzegladu;
    }

    public void setDataPrzegladu(LocalDate dataPrzegladu) {
        this.dataPrzegladu = dataPrzegladu;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }


    public void printInfo() {
        System.out.println("Przegląd ID: " + id);
        System.out.println("Data przeglądu: " + dataPrzegladu);
        System.out.println("Opis: " + opis);
    }

}

