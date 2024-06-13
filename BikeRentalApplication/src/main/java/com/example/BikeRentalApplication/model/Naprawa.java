package com.example.BikeRentalApplication.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Naprawa {
    private int id;
    private double koszt;
    private LocalDate dataRozpoczecia;
    private LocalDate dataZakonczenia;
    private String opisUszkodzenia;
    private List<String> listaWymienionychCzesci;
    // to do
    Rower rower;

    Serwisant serwisant;

    public Naprawa(int id, double koszt, LocalDate dataRozpoczecia, LocalDate dataZakonczenia, String opisUszkodzenia) {
        this.id = id;
        this.koszt = koszt;
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataZakonczenia = dataZakonczenia;
        this.opisUszkodzenia = opisUszkodzenia;
        this.listaWymienionychCzesci = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getKoszt() {
        return koszt;
    }

    public void setKoszt(double koszt) {
        this.koszt = koszt;
    }

    public LocalDate getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(LocalDate dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public LocalDate getDataZakonczenia() {
        return dataZakonczenia;
    }

    public void setDataZakonczenia(LocalDate dataZakonczenia) {
        this.dataZakonczenia = dataZakonczenia;
    }

    public String getOpisUszkodzenia() {
        return opisUszkodzenia;
    }

    public void setOpisUszkodzenia(String opisUszkodzenia) {
        this.opisUszkodzenia = opisUszkodzenia;
    }

    public List<String> getListaWymienionychCzesci() {
        return listaWymienionychCzesci;
    }

    public void addCzesc(String czesc) {
        this.listaWymienionychCzesci.add(czesc);
    }


    public void printInfo() {
        System.out.println("Naprawa ID: " + id);
        System.out.println("Koszt: " + koszt);
        System.out.println("Data rozpoczęcia: " + dataRozpoczecia);
        System.out.println("Data zakończenia: " + dataZakonczenia);
        System.out.println("Opis uszkodzenia: " + opisUszkodzenia);
        System.out.println("Lista wymienionych części: " + listaWymienionychCzesci);
    }

}