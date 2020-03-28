package ru.basanov.portalad.model;

import java.util.UUID;

public class Sale {

    private String id = UUID.randomUUID().toString();

    private String name;

    private String date;

    private String count;

    public Sale() {
    }

    public Sale(String name, String date, String count) {
        this.name = name;
        this.date = date;
        this.count = count;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getCount() {
        return count;
    }
}
