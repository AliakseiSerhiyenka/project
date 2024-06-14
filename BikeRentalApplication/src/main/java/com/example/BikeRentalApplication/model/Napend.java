package com.example.BikeRentalApplication.model;


import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="napend")
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Napend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String typ;

    @OneToOne
    @JoinColumn(name = "rower_id")
    private Rower rower;

    public Napend(int id, String typ) {
        this.id = id;
        this.typ = typ;
    }


    public Elektryczny isElect(Napend napend) {
        Elektryczny elektryczny = null;
        if (this instanceof Elektryczny) {
            elektryczny = (Elektryczny)napend;
        }
        return elektryczny;
    }


    public boolean isMebh() {
        if (this instanceof Mechaniczny) {
            return true;
        }
        return false;
    }

    public Mechaniczny getMech() throws Exception {
        if (isMebh()) {
            return (Mechaniczny)this;
        }
        throw new Exception("Is not Mechaniczny");
    }
    @Override
    public String toString() {
        return "Napend{" +
                "id=" + id +
                ", typ='" + typ + '\'' +
                '}';
    }
}