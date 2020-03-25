package com.example.appsaver.model;

public class Consultants {
    private String name;
    private String rating;
    private String vicinity;
    private String icon;


    public Consultants(){


    }

    public Consultants(String name, String rating, String vicinity, String icon) {
        this.name = name;
        this.rating = rating;
        this.vicinity = vicinity;
        this.icon = icon;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
