package com.example.SpringBootRest.model;

public enum Timetable {
    FIRTH("0-8"),
    SECOND("8-16"),
    THIRD("16-24");

    private String timetable;

    Timetable(String timetable) {
        this.timetable = timetable;
    }
}
