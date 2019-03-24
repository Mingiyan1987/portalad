package ru.basanov.portalad.dto;

import java.io.Serializable;

public class ResultDTO<T> implements Serializable {

    private String message;
    private boolean succes;

    public ResultDTO() {
    }

    public ResultDTO(String message, boolean succes) {
        this.message = message;
        this.succes = succes;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSucces(boolean succes) {
        this.succes = succes;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSucces() {
        return succes;
    }
}
