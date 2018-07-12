package com.example.lenovo.tourguideapp;

public class Info {

    private String name;
    private String description;
    private  int imageResourceId;

    public Info(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name; }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

}


