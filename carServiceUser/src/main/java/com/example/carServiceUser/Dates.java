package com.example.carServiceUser;


public class Dates {
    private String debut;
    private String fin;

    private int idDate;

    private User user;

    public Dates(String debut, String fin) {
        this.debut = debut;
        this.fin = fin;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Dates() {
    }

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

    public int getIdDate() {
        return idDate;
    }

    public void setIdDate(int id) {
        this.idDate = id;
    }
}
