package com.example.BikeRentalApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="elektryczny")
@Data
@NoArgsConstructor
public class Elektryczny extends Napend {

    private int pojemnoscBaterii;
    private int predkosc;
    private int maxDystans;

    protected Elektryczny(int id, String typ, int pojemnoscBaterii, int predkosc, int maxDystans) {
        super(id, typ);
        this.pojemnoscBaterii = pojemnoscBaterii;
        this.predkosc = predkosc;
        this.maxDystans = maxDystans;
    }

    @Override
    public String toString() {
        return "Elektryczny{" +
                "pojemnoscBaterii=" + pojemnoscBaterii +
                ", predkosc=" + predkosc +
                ", maxDystans=" + maxDystans +
                '}';
    }

}
