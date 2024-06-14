package com.example.BikeRentalApplication.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

@Entity
@Table(name="klient")
@Data
@NoArgsConstructor
public class Klient {

    @Id
    private int id;

    @Transient
    private int iloscRezerwacji;

    @OneToMany(mappedBy = "klient", cascade = CascadeType.ALL)
    private List<Rezerwacja> rezerwacje= new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "osoba_id", referencedColumnName = "id")
    private Osoba osoba;

    public static List<Klient> klients= new ArrayList<>();

    public Klient(Osoba osoba) {
        this.osoba=osoba;
        this.id=osoba.getId();
        klients.add(this);
        Osoba.osoby.add(getOsoba());

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
