package com.example.BikeRentalApplication.model;

import java.time.LocalDate;
import java.util.List;
public class Rezerwacja {
    private int id;
    private LocalDate dataZlozeniaRezerwacji;
    private LocalDate dataPoczatku;
    private LocalDate dataKonca;
    private String status;
    private Rower rower;
    private Klient klient;
    private List<Sprzet> sprzet;

    public Rezerwacja(int id, LocalDate dataZlozeniaRezerwacji, LocalDate dataPoczatku, LocalDate dataKonca, String status, Rower rower, Klient klient, List<Sprzet> sprzet) {
        this.id = id;
        this.dataZlozeniaRezerwacji = dataZlozeniaRezerwacji;
        this.dataPoczatku = dataPoczatku;
        this.dataKonca = dataKonca;
        this.status = status;
        this.rower = rower;
        this.klient = klient;
        this.sprzet = sprzet;
        klient.addToRezewacje(this);
    }
}
