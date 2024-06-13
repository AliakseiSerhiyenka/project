package com.example.BikeRentalApplication.model;



public abstract class Napend {

    private int id;
    private String typ;

    private Rower rower;




    public Napend(int id, String typ) {
        this.id = id;
        this.typ = typ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public Rower getRower() {
        return rower;
    }

    public void setRower(Rower rower) {
        this.rower = rower;
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
    // Gettery i settery
}