package ru.basanov.portalad.dto;

import java.util.Date;

public class SimpleMessage {

    private Date date = new Date();

    public Date getDate() {
        return date;
    }

    public SimpleMessage() {
    }

    public SimpleMessage(Date date) {
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
