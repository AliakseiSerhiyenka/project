package com.example.BikeRentalApplication.model;

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

    public int getPojemnoscBaterii() {
        return pojemnoscBaterii;
    }

    public void setPojemnoscBaterii(int pojemnoscBaterii) {
        this.pojemnoscBaterii = pojemnoscBaterii;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public int getMaxDystans() {
        return maxDystans;
    }

    public void setMaxDystans(int maxDystans) {
        this.maxDystans = maxDystans;
    }
}
