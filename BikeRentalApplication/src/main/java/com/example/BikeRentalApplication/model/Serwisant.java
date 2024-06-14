package com.example.BikeRentalApplication.model;

import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@DiscriminatorValue("serwisant")
@Data
@NoArgsConstructor
public class Serwisant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dzienWyplaty;
    private double stawkaZaGodzine;

    @ElementCollection
    private List<String> umiejetnosciTechniczne;

    @OneToMany(mappedBy = "serwisant", cascade = CascadeType.ALL)
    private List<Naprawa> naprawas;


}
