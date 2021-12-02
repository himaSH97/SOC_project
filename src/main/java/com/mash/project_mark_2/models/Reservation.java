package com.mash.project_mark_2.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reservation")
public class Reservation {
    @Id
    private String id;
    private String name;
    private String numberOfPersons;
    private String numberOfRooms;
    private String days;
    private String description;

    public Reservation(String name, String numberOfPersons, String numberOfRooms, String days, String description) {
        this.name = name;
        this.numberOfPersons = numberOfPersons;
        this.numberOfRooms = numberOfRooms;
        this.days = days;
        this.description = description;
    }

    public Reservation(String name, String numberOfPersons, String days, String description) {
        this.name = name;
        this.numberOfPersons = numberOfPersons;
        this.days = days;
        this.description = description;
    }

    public Reservation() {

    }

    public String getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(String numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(String numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
