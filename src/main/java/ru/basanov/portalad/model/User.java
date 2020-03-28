package ru.basanov.portalad.model;

import java.util.UUID;

public class User {

    private String id = UUID.randomUUID().toString();

    private String login;

    private String password;

    public User() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
