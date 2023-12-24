package com.rt.plantguardianapi;

public class Plant {

    private Number id;
    private String name;

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public Plant(Number id, String name) {
        this.id = id;
        this.name = name;
    }

    public Plant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
