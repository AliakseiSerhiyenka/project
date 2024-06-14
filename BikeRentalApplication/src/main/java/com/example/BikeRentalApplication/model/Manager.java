package com.example.BikeRentalApplication.model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("manager")
@NoArgsConstructor
@Data
public class Manager extends Pracownik{

    private static LocalDate dzienWyplaty;
    private double wyplata;
    private static double minimalna;


    public Manager(Osoba osoba,String adress, double wyplata) {
        super(osoba,adress);
        this.wyplata = wyplata;
        osoba.setPracownikRole();
        dzienWyplaty=getDzien15();
    }
    public LocalDate getDzien15() {
        LocalDate today = LocalDate.now();
        return LocalDate.of(today.getYear(), today.getMonth(), 15);
    }
    public static LocalDate getDzienWyplaty() {
        return dzienWyplaty;
    }

    public static void setDzienWyplaty(LocalDate dzienWyplaty) {
        Manager.dzienWyplaty = dzienWyplaty;
    }

    public double getWyplata() {
        return wyplata;
    }

    public void setWyplata(double wyplata) {
        this.wyplata = wyplata;
    }

    public static double getMinimalna() {
        return minimalna;
    }

    public static void setMinimalna(double minimalna) {
        Manager.minimalna = minimalna;
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString()+
                "Dzien wyplaty="+dzienWyplaty+
                ", wyplata=" + wyplata +
                '}';
    }
}
