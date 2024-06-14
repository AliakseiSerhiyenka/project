package com.example.BikeRentalApplication.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="mechaniczny")
@Data
@NoArgsConstructor
public class Mechaniczny extends Napend {

    private int liczbaBiegow;
    private String rodzajSystemu;

    public Mechaniczny(int id, String typ, int liczbaBiegow, String rodzajSystemu) {
        super(id, typ);
        this.liczbaBiegow = liczbaBiegow;
        this.rodzajSystemu = rodzajSystemu;
    }

    @Override
    public String toString() {
        return "Mechaniczny{" +
                "liczbaBiegow=" + liczbaBiegow +
                ", rodzajSystemu='" + rodzajSystemu + '\'' +
                '}';
    }

    public int getLiczbaBiegow() {
        return liczbaBiegow;
    }

    public void setLiczbaBiegow(int liczbaBiegow) {
        this.liczbaBiegow = liczbaBiegow;
    }

    public String getRodzajSystemu() {
        return rodzajSystemu;
    }

    public void setRodzajSystemu(String rodzajSystemu) {
        this.rodzajSystemu = rodzajSystemu;
    }

}
