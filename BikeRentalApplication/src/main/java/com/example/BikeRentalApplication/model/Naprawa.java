package com.example.BikeRentalApplication.model;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "naprawa")
@Data
@NoArgsConstructor
public class Naprawa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double koszt;
    private LocalDate dataRozpoczecia;
    private LocalDate dataZakonczenia;
    private String opisUszkodzenia;

    @ElementCollection
    private List<String> listaWymienionychCzesci;

    @ManyToOne
    @JoinColumn(name = "rower_id")
    Rower rower;

    @ManyToOne
    @JoinColumn(name = "serwisant_id")
    Serwisant serwisant;

    public Naprawa(int id, double koszt, LocalDate dataRozpoczecia, LocalDate dataZakonczenia, String opisUszkodzenia) {
        this.id = id;
        this.koszt = koszt;
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataZakonczenia = dataZakonczenia;
        this.opisUszkodzenia = opisUszkodzenia;
        this.listaWymienionychCzesci = new ArrayList<>();
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