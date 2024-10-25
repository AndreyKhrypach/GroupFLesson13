package app.models;

import app.service.Fly;

public class Mosquito implements Fly {

    private String name;

    public Mosquito(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void flying() {
        System.out.println("piiiiiiiiiiiii");
    }

    @Override
    public String toString() {
        return "Mosquito{" +
                "name='" + name + '\'' +
                '}';
    }
}
