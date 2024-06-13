package com.example.BikeRentalApplication.model;


public class Dzieciecy extends Rower {
    private boolean dodatkoweStabilizatory;
    private String tematycznyDesign;

    public Dzieciecy(Rower rower, boolean dodatkoweStabilizatory, String tematycznyDesign) {
        super(rower.id, rower.marka, rower.model, rower.kolor, rower.waga, rower.cenaZaDzien, rower.rozmiarRamy, rower.stanRoweru,rower.napend);
        //this.napend=rower.getNapend();
        this.dodatkoweStabilizatory = dodatkoweStabilizatory;
        this.tematycznyDesign = tematycznyDesign;
        addRower(this);
    }

    public boolean isDodatkoweStabilizatory() {
        return dodatkoweStabilizatory;
    }

    public String getTematycznyDesign() {
        return tematycznyDesign;
    }

    @Override
    public String toString() {

        return "Dzieciecy{" +
                super.toString()+
                "dodatkoweStabilizatory=" + dodatkoweStabilizatory +
                ", tematycznyDesign='" + tematycznyDesign + '\'' +
                '}';
    }
}
