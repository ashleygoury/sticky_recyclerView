package com.example.myapplication.model;

public class PunchEntity {
    private int id;
    private String date;
    private String breaks;
    private String hours;

    public PunchEntity() {
    }

    public PunchEntity(int id, String date, String breaks, String hours) {
        this.id = id;
        this.date = date;
        this.breaks = breaks;
        this.hours = hours;
    }

    public PunchEntity(String date, String breaks, String hours) {
        this.date = date;
        this.breaks = breaks;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBreaks() {
        return breaks;
    }

    public void setBreaks(String breaks) {
        this.breaks = breaks;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "PunchEntity{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", breaks='" + breaks + '\'' +
                ", hours=" + hours +
                '}';
    }
}