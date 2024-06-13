package com.example.BikeRentalApplication.model;


import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class Rower {

    protected int id;
    protected String marka;
    protected String model;
    protected String kolor;
    protected double waga;
    protected double cenaZaDzien;
    protected String rozmiarRamy;
    protected String stanRoweru;
    protected Napend napend;
    public static List<Rower> rowery = new ArrayList<>();
    private List<Rezerwacja> rezerwacje;
    private List<Naprawa> naprawy;

    //@SneakyThrows
    public static Rower getRowerById(int id) throws Exception {
        for (Rower rower : rowery) {
            if (rower.id == id) {
                return rower;
            }
        }
        throw new Exception("Rower don't exist!");
    }
    public static void displayAllRovers(){
        System.out.println(rowery);
    }
    public void addRower(Rower rower) {
//validate is null or exist
        rowery.add(rower);
        System.out.println("Rower added: " + rower);
    }
    protected Rower(int idRower, String marka, String model, String kolor, double waga, double cenaZaDzien, String rozmiarRamy, String stanRoweru) {
        this.id = idRower;
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.waga = waga;
        this.cenaZaDzien = cenaZaDzien;
        this.rozmiarRamy = rozmiarRamy;
        this.stanRoweru = stanRoweru;
    }
    protected Rower(int idRower, String marka, String model, String kolor, double waga, double cenaZaDzien, String rozmiarRamy, String stanRoweru,Napend napend) {
        this.id = idRower;
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.waga = waga;
        this.cenaZaDzien = cenaZaDzien;
        this.rozmiarRamy = rozmiarRamy;
        this.stanRoweru = stanRoweru;
        this.napend=napend;
    }

    public static Rower createElektrycznyRower(int idRower, String marka, String model, String kolor, double waga, double cenaZaDzien, String rozmiarRamy, String stanRoweru, int id, String typ, int pojemnoscBaterii, int predkosc, int maxDystans) {
        var rower = new Rower(idRower, marka, model, kolor,  waga, cenaZaDzien, rozmiarRamy, stanRoweru);
        rower.napend = new Elektryczny( id,typ,pojemnoscBaterii, predkosc, maxDystans);
        return rower;
    }

    public static Rower createMechanicznyRower(int idRower, String marka, String model, String kolor, double waga, double cenaZaDzien, String rozmiarRamy, String stanRoweru, int id, String typ, int liczbaBiegow, String rodzajSystemu) {
        var rower = new Rower(idRower, marka, model, kolor,  waga, cenaZaDzien, rozmiarRamy, stanRoweru);
        rower.napend = new Mechaniczny( id, typ, liczbaBiegow, rodzajSystemu);
        return rower;
    }

    @Override
    public String toString() {

        return "Rower{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                ", waga=" + waga +
                ", cenaZaDzien=" + cenaZaDzien +
                ", rozmiarRamy='" + rozmiarRamy + '\'' +
                ", stanRoweru='" + stanRoweru + '\'' +
                ", napend=" + napend.toString() +
                '}';
    }


    public  int getId() {
        return id;
    }

    public  String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getKolor() {
        return kolor;
    }

    public double getWaga() {
        return waga;
    }

    public double getCenaZaDzien() {
        return cenaZaDzien;
    }

    public String getRozmiarRamy() {
        return rozmiarRamy;
    }

    public String getStanRoweru() {
        return stanRoweru;
    }

    public Napend getNapend() {
        return napend;
    }

}
