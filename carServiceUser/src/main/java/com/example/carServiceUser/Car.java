package com.example.carServiceUser;

public class Car {
    String marque;
    int prix;
    String plaque;
    boolean rent;
    Dates dates;
    int id;

    public Car(String marque, int prix, String plaque) {
        this.marque = marque;
        this.prix = prix;
        this.plaque = plaque;
        this.rent = rent;
    }

    public Car() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }
    public Dates getDates() {
        return dates;
    }
    public void setDates(Dates dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marque='" + marque + '\'' +
                ", prix=" + prix +
                ", plaque='" + plaque + '\'' +
                ", rent=" + rent +
                ", dates=" + dates +
                ", id=" + id +
                '}';
    }
}
