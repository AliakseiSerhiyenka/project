package com.example.BikeRentalApplication.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="rezerwacja")
@Data
@NoArgsConstructor
public class Rezerwacja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate dataZlozeniaRezerwacji;
    private LocalDate dataPoczatku;
    private LocalDate dataKonca;
    private String status;

    @ManyToOne
    @JoinColumn(name = "rower_id", referencedColumnName = "id")
    private Rower rower;

    @ManyToOne
    @JoinColumn(name = "klient_id", referencedColumnName = "id")
    private Klient klient;

    //@OneToMany(mappedBy = "rezerwacja", cascade = CascadeType.ALL)
    //public List<Sprzet> sprzet=new ArrayList<>();

    public Rezerwacja(int id, LocalDate dataZlozeniaRezerwacji, LocalDate dataPoczatku, LocalDate dataKonca, String status, Rower rower, Klient klient) {
        this.id = id;
        this.dataZlozeniaRezerwacji = dataZlozeniaRezerwacji;
        this.dataPoczatku = dataPoczatku;
        this.dataKonca = dataKonca;
        this.status = status;
        this.rower = rower;
        this.klient = klient;
        klient.addToRezewacje(this);
    }

//    public void addSprzet(Sprzet sprzet) {
//        this.sprzet.add(sprzet);
//        sprzet.setRezerwacja(this);
//    }
//
//    public void removeSprzet(Sprzet sprzet) {
//        this.sprzet.remove(sprzet);
//        sprzet.setRezerwacja(null);
//    }

}
