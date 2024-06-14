package com.example.BikeRentalApplication.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("Dorosly")
@Data
@NoArgsConstructor
public class Dorosly extends Rower {

    private boolean bagaznikPrzedni;
    private boolean bagaznikTylny;

    public Dorosly(Rower rower, boolean bagaznikPrzedni, boolean bagaznikTylny) {
        super(rower.id, rower.marka, rower.model, rower.kolor, rower.waga, rower.cenaZaDzien, rower.rozmiarRamy, rower.stanRoweru,rower.napend);
        this.bagaznikPrzedni = bagaznikPrzedni;
        this.bagaznikTylny = bagaznikTylny;
        addRower(this);
    }

    @Override
    public String toString() {
        return "Dorosly{" +
                "bagaznikPrzedni=" + bagaznikPrzedni +
                ", bagaznikTylny=" + bagaznikTylny +
                ", id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                ", waga=" + waga +
                ", cenaZaDzien=" + cenaZaDzien +
                ", rozmiarRamy='" + rozmiarRamy + '\'' +
                ", stanRoweru='" + stanRoweru + '\'' +
                ", napend=" + napend +
                '}';
    }
// Gettery i settery
}
