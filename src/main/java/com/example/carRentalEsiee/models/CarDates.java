package com.example.carRentalEsiee.models;

public class CarDates {
    String debut;
    String fin;

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "CarDates{" +
                "debut='" + debut + '\'' +
                ", fin='" + fin + '\'' +
                '}';
    }
}
