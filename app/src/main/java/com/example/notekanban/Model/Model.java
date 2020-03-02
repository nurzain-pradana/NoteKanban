package com.example.notekanban.Model;

import java.sql.Blob;

public class Model {
    private int id;
    private String name;
    private String password;
    private String no_phone;
    private Blob photo;

    public Model(int id, String name, String password, String no_phone, Blob photo) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.no_phone = no_phone;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNo_phone() {
        return no_phone;
    }

    public void setNo_phone(String no_phone) {
        this.no_phone = no_phone;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }
}
