package com.example.BikeRentalApplication.model;

import lombok.*;
import jakarta.persistence.*;
import java.time.Period;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="pracownik")
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "pracownik_type")
public class Pracownik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate dataZatrudnienia;
    private String adress;

    @Transient
    private int staz;

    @OneToOne
    @JoinColumn(name = "osoba_id", referencedColumnName = "id")
    private Osoba osoba;


    public static List<Pracownik> pracowniks= new ArrayList<>();


    public Pracownik(Osoba osoba) {
        this.osoba=osoba;
        this.id=osoba.getId();
        pracowniks.add(this);
        this.adress=adress;
        this.dataZatrudnienia=LocalDate.now();
    }
    public Pracownik(Osoba osoba,String adress) {
        if (pracowniks.contains(osoba.getPracownikRole())){
            //throw new IllegalArgumentException("This person is already Pracownik.");
        }
        this.osoba=osoba;
        pracowniks.add(this);
        this.adress=adress;
        this.dataZatrudnienia=LocalDate.now();
        Osoba.osoby.add(this.getOsoba());

    }
    public int wyliczStaz() {
        if (dataZatrudnienia == null) {
            return 0;
        }
        return Period.between(dataZatrudnienia, LocalDate.now()).getYears();
    }

    public int getStaz() {
        return  wyliczStaz();
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
