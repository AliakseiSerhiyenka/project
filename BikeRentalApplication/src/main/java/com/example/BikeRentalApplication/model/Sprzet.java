//package com.example.BikeRentalApplication.model;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@Table(name = "sprzet")
//@Data
//@NoArgsConstructor
//public class Sprzet {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    private String nazwa;
//
//    @Column(nullable = false)
//    private double cena;
//
//    @Column(nullable = false)
//    private String typ;
//
//    @ManyToOne
//    @JoinColumn(name = "rezerwacja_id", referencedColumnName = "id")
//    private Rezerwacja rezerwacja;
//    // list of spszent
//    public Sprzet(String nazwa, double cena, String typ) {
//        this.nazwa = nazwa;
//        this.cena = cena;
//        this.typ = typ;
//    }
//
//    @Override
//    public String toString() {
//        return "Sprzet{" +
//                "id=" + id +
//                ", nazwa='" + nazwa + '\'' +
//                ", cena=" + cena +
//                ", typ='" + typ + '\'' +
//                '}';
//    }
//}
