package com.example.BikeRentalApplication.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="przegliad")
@Data
@NoArgsConstructor
public class Przegliad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate dataPrzegladu;
    private String opis;

    @ManyToOne
    @JoinColumn(name = "rower_id")
    Rower rower;

    @ManyToOne
    @JoinColumn(name = "naprawa_id")
    Naprawa naprawa;

    @ManyToOne
    @JoinColumn(name = "serwisant_id")
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

