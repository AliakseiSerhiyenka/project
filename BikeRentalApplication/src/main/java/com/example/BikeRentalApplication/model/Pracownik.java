package com.example.BikeRentalApplication.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pracownik {
    private LocalDate dataZatrudnienia;
    private String adress;
    //int staz;

    Osoba osoba;

    public static List<Pracownik> pracowniks= new ArrayList<>();
    public Pracownik(Osoba osoba) {
        this.osoba=osoba;
        pracowniks.add(this);
        this.adress=adress;
        this.dataZatrudnienia=LocalDate.now();
    }
    public Pracownik(Osoba osoba,String adress) {
        this.osoba=osoba;
        pracowniks.add(this);
        this.adress=adress;
        this.dataZatrudnienia=LocalDate.now();
    }
    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "Osoba" + osoba.toString()+
                "dataZatrudnienia=" + dataZatrudnienia +
                ", adress='" + adress + '\'' +
                '}';
    }
}
